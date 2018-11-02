package Controller;

import Server.Server;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivens
 */
public class ServerController {

    private List<ServerObserver> observers;
    private Server server;

    public ServerController() {
        observers = new ArrayList<>();
        server = new Server(this);
    }    
    
    public void log(String log){
        for (ServerObserver obs : observers){
            obs.log(log);
        }
    }

    public void observServer(ServerObserver obs) {
        observers.add(obs);        
    }
    
    public void stopObservingServer(ServerObserver obs){
        observers.remove(obs);
    }
    
    public void initServer(){
        int log = 0;
        while (true){
            this.log(log +"");
            log++;
        }
    }
    
}
