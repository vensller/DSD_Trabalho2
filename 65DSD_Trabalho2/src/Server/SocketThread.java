package Server;

import Model.ServerTime;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Ivens
 */
public class SocketThread extends Thread{
    
    private Socket connection;

    public SocketThread(Socket connection) {
        this.connection = connection;
    }

    @Override
    public void run() {
        try{
            ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
            
            String msg = input.readUTF();
            
            if (msg.equals("Send me the time")){       
                ServerTime time = new ServerTime(0, new Date());
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
            System.out.println("Thread " + this.getId() + " finished.");
        }
    }  
    
    
}
