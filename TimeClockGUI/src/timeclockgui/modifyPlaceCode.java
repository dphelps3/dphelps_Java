
package timeclockgui;

import java.io.PrintWriter;

public class modifyPlaceCode {
    
    public void updateCode(String newCode) {
        
        // declare variable
        String updatedCode;
        
        // value to pass the updated code
        updatedCode = newCode;
        
        // write values to file - changes the code to number 1
            String codeUpdate = "E:/Phelps/TimeClock/placecode.txt";
            PrintWriter codePrintWriter = null;
            try {
                codePrintWriter = new PrintWriter(codeUpdate);
                codePrintWriter.println(updatedCode);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (codePrintWriter != null)
                {
                    codePrintWriter.close();
                }
            }
        
    }

}
