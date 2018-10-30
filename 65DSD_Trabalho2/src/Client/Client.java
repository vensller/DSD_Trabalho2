package Client;

import Model.ServerTime;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Ivens
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException {        
        try{
            String endereco = "";
            Socket socket = new Socket(endereco, 5555);            
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                        
            output.writeUTF("Send me the time");
            output.flush();                      
            
            ServerTime time = (ServerTime) input.readObject();
            System.out.println(time.getUtc());
            output.close();
            input.close();
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
