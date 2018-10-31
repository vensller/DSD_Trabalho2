package Server;

import Model.ServerTime;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ivens
 */
public class SocketThread extends Thread{
    
    private Socket connection;
    private String clientPort;

    public SocketThread(Socket connection) {
        this.connection = connection;
        clientPort = connection.getLocalAddress().toString();
    }

    @Override
    public void run() {
        try{
            ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
            long h1 = System.currentTimeMillis();
            
            String msg = input.readUTF();
            
            if (msg.equals("Send me the time")){                       
                ServerTime time = new ServerTime(h1, new Date());                
                output.writeObject(time);
                output.flush();
            }
            
            output.close();            
            input.close();
            connection.close();
        }catch(IOException e){
            e.printStackTrace();
            try{
                connection.close();
            }catch(IOException e2){
                e2.printStackTrace();
            }
        }finally{
            System.out.println("Thread " + this.getId() + " finished " + clientPort);
        }
    }  
    
    
}
