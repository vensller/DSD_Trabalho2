package Client;

import Controller.ClockController;
import Model.ServerTime;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivens
 */
public class Client extends Thread{

    private String adress;
    private int port;
    private long sleepMilis;
    private Date date;
    private ClockController controller;
    
    public Client(String adress, int port, long sleepMilis, ClockController controller){
        this.adress = adress;
        this.port = port;
        this.sleepMilis = sleepMilis;
        this.date = new Date();
        this.controller = controller;
    }
    
    @Override
    public void run() {
        try{
            while (true){
                long t0 = System.currentTimeMillis();
                Socket socket = new Socket(this.adress, this.port);            
                socket.setReuseAddress(true);            
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

                output.writeUTF("Send me the time");
                output.flush();                      

                ServerTime time = (ServerTime) input.readObject();
                
                Calendar c = Calendar.getInstance(); 
                c.setTime(time.getUtc());                 
                
                long t1 = System.currentTimeMillis();
                int p = (int)(t1 - t0 - time.getH()) / 2;
                
                if (time.getUtc().before(date)){
                    p = p / 2;
                }                
                
                c.add(Calendar.MILLISECOND, p);                
                date = c.getTime();
                controller.attDate(date);

                output.close();
                input.close();
                socket.close();
                sleep(sleepMilis);
            }
        }catch(IOException | ClassNotFoundException | InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
