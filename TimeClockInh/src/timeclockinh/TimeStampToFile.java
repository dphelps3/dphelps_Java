
package timeclockinh;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TimeStampToFile {
    
    public void updateTime(String newTime, String stampLocation) {
        
        // declare variable
        String updatedTime;
        
        // value to pass the updated code
        updatedTime = newTime;
        
        // create string to be used for file path
        String codeUpdate = "E:/Phelps/TimeClock/" + stampLocation + ".txt";
        
        // stamps time to file - appends to existing data
        try{
        OutputStreamWriter writer = new OutputStreamWriter(
              new FileOutputStream(codeUpdate, true), "UTF-8");
        BufferedWriter fbw = new BufferedWriter(writer);
        fbw.write(updatedTime);
        fbw.newLine();
        fbw.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

}
