package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ivens
 */
public class Server {
       
    public static void main(String[] args) {        
        try{            
            ServerSocket serverSocket = new ServerSocket(5555);          
            serverSocket.setReuseAddress(true);
            while (true){
                System.out.println("Waiting connection...");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected, initializing thread!");
                SocketThread thread = new SocketThread(socket);
                thread.start();                
            }
        }catch (IOException e){
            e.printStackTrace();
        }          
    }
    
}
