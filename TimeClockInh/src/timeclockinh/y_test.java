
package timeclockinh;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class y_test 
{
    
    public static void main(String args[]) {
        
        try{
        
            OutputStreamWriter writer = new OutputStreamWriter(
                  new FileOutputStream("E:/Phelps/TimeClock/testfile.txt", true), "UTF-8");
            BufferedWriter fbw = new BufferedWriter(writer);
            fbw.write("3:02");
            fbw.newLine();
            fbw.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
