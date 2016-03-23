package timeclock;

// import utilities for working with date/time
import java.util.Date;
import java.text.*;

public class RetrieveDate {
    
    private String currentDate;
    //private String currentTime;
    
    public String GrabDate() {
        // creating date stamp
        Date date = new Date();
        
        // formatting date
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        
        currentDate = dateFormat.format(date);
                
        return currentDate;
    }
    
    /* public String GrabTime() {
        // creating time stamp
        Date time = new Date();
        
        // formatting time
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        
        currentTime = timeFormat.format(time);
        
        return currentTime;
    } */

}
