package Server;

import Controller.ServerController;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ivens
 */
public class Server {
    
    private ServerController controller;

    public Server(ServerController controller) {
        this.controller = controller;
    }   
       
    public void execute(){        
        try{            
            ServerSocket serverSocket = new ServerSocket(5555);          
            serverSocket.setReuseAddress(true);
            while (true){
                controller.log("Waiting connection...");
                Socket socket = serverSocket.accept();                
                SocketThread thread = new SocketThread(socket, controller);
                thread.start();                
            }
        }catch (IOException e){
            e.printStackTrace();
        }          
    }
    
}
