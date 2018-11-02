package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivens
 */
public class ServerController {

    private List<ServerObserver> observers;

    public ServerController() {
        observers = new ArrayList<>();
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
    
}
