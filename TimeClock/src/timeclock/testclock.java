
package timeclock;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testclock {
    
    public static void main(String[] args) throws ParseException {
    
        String time1 = "07/15/2013 11:00:01";
        String time2 = "07/15/2013 12:15:10";
        String format = "MM/dd/yyyy HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date fromDate = sdf.parse(time1);
        Date toDate = sdf.parse(time2);

        long diff = toDate.getTime() - fromDate.getTime();
        String dateFormat="duration: ";
        int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
        if(diffDays>0){
            dateFormat+=diffDays+" day ";
        }
        diff -= diffDays * (24 * 60 * 60 * 1000);

        int diffhours = (int) (diff / (60 * 60 * 1000));
        if(diffhours>0){
            dateFormat+=diffhours+" hour ";
        }
        diff -= diffhours * (60 * 60 * 1000);

        int diffmin = (int) (diff / (60 * 1000));
        if(diffmin>0){
            dateFormat+=diffmin+" min ";
        }
        diff -= diffmin * (60 * 1000);

        int diffsec = (int) (diff / (1000));
        if(diffsec>0){
            dateFormat+=diffsec+" sec";
        }
        System.out.println(dateFormat);
    }
}
