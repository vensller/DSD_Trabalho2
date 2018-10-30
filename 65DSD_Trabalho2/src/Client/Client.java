package Client;

import Model.ServerTime;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ivens
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException {        
        try{
            String endereco = "";
            while (true){
                long t0 = System.currentTimeMillis();
                Socket socket = new Socket(endereco, 5555);            
                socket.setReuseAddress(true);            
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

                output.writeUTF("Send me the time");
                output.flush();                      

                ServerTime time = (ServerTime) input.readObject();
                long t1 = System.currentTimeMillis();
                long p = (t1 - t0 - time.getH()) / 2;
                Calendar c = Calendar.getInstance(); 
                c.setTime(time.getUtc()); 
                c.add(Calendar.MILLISECOND, (int) p);
                SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:MM:ss");
                System.out.println(format.format(c.getTime()));

                output.close();
                input.close();
                socket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
