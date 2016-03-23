
package timeclockgui;

import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeStamp {
    
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

}

