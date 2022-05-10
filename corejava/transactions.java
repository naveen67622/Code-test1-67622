package basics.corejava;

import java.util.Date;

public class transactions {
    
    private String id;
    private Date time;
    private int amount;
    private String location;
    public void Transaction() {}
    
    public transactions(int amount){
        
        
    }

    @Override
    public String toString() {
        return "transactions [amount=" + amount + ", id=" + id + ", location=" + location + ", time=" + time + "]";
    }
    

}
