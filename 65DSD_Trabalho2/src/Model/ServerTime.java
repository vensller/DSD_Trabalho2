package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ivens
 */
public class ServerTime implements Serializable{
    private static final long serialVersionUID = -5399605122490343339L;
    
    private long H;
    private Date utc;

    public ServerTime(long H, Date utc) {
        this.H = H;
        this.utc = utc;
    }   

    public Date getUtc() {
        return utc;
    }

    public void setUtc(Date utc) {
        this.utc = utc;
    }    
        
}
