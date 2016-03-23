
package timeclockinh;

import java.io.*;

public class z_test {
    
    public static void main(String[] args) throws Exception {
        
        // call the timestamp method
        TimeStamp getNow = new TimeStamp();
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("E:/Phelps/TimeClock/testfile.txt"));
            out.write(getNow.GrabDate() + "\n");
            out.close();
            out = new BufferedWriter(new FileWriter("E:/Phelps/TimeClock/testfile.txt",true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("E:/Phelps/TimeClock/testfile.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        }
        catch (Exception e) {
            System.out.println("Exception Occurred " + e);
        }
        
    }

}
