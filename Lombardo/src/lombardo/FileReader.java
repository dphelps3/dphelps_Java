
package lombardo;

import java.io.*;

public class FileReader implements Reader {
    
    private boolean lineReadFlag = false;
    
    public String readln() {
        
        File data = new File(File.separator + "data.txt");
        
        BufferedReader in = null;
        String line = null;
        
        try {
            if (data.exists()) {
                in = new BufferedReader(new java.io.FileReader(data));
                line = in.readLine();
                in.close();
            } else {
                System.out.println("File not found - data.txt");
                line = null;
            }
        } catch(Exception_class_Name ref){}
        
    }
    
}
