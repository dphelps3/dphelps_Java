
package Exercises;

// import StringTokenizer class
import java.util.StringTokenizer;

public class DateComponent {
    
    private String month,
                    day,
                    year;
    
    public DateComponent(String dateStr) {
        
        // create a StringTokenizer object
        
        StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");
        
        // get the first token
        month = strTokenizer.nextToken();
        
        // get the second token
        day = strTokenizer.nextToken();
        
        // get the third token
        year = strTokenizer.nextToken();
                
    }
    
    // return the month field
    public String getMonth()
    {
        return month;
    }
    
    // return the day field
    public String getDay()
    {
        return day;
    }
    
    // return the year field
    public String getYear()
    {
        return year;
    }
    
}
