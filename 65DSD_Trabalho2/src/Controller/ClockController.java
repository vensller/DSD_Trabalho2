package Controller;

import Client.Client;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivens
 */
public class ClockController{

    private List<ClockObserver> observers;
    private Client client;
    
    public ClockController(String adress, int port, long sleepMilis){
        observers = new ArrayList<ClockObserver>();
        client = new Client(adress, port, sleepMilis, this);        
    }
    
    public void observClock(ClockObserver obs){
        observers.add(obs);
    }
    
    public void stopObservingClock(ClockObserver obs){
        observers.remove(obs);
    }
    
    public void initClock(){
        client.start();
    }
    
    public void stopClock(){
        client.interrupt();
    }
    
    public synchronized void attDate(Date newDate) {
        for (ClockObserver obs : observers){
            obs.attDate(newDate);
        }
    }

    
}
