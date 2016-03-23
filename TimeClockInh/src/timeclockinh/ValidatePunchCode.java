
package timeclockinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class ValidatePunchCode {
    
    static void checkPunchCode() throws FileNotFoundException, ParseException, IOException {
    
        /* this method reads a specific text file
        to see which sector the user is currently punched in */
        
        // path to the text file
        String filename = "E:/Phelps/TimeClock/placecode.txt";
        
        // opening the .txt file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        // read the first line from the file
        String line1 = inputFile.nextLine();
        
        // Display the line
        //System.out.println(line1);
        
        // if statement, depending on code
        if (line1.equals("0")){
            // bring up the main punch-in window
            WindowCreator.createWin();
        } else {
            // instantiate new object
            PunchOutWindow punchOut = new PunchOutWindow();
            
            // send current code to PunchOutWindow
            punchOut.setCode(line1);
            
            // bring up Punch Out window
            punchOut.getCode();
            
            // re-initiate the Manager function
            Manager.Manager();
        }
        
        // Close the file
        inputFile.close();
        
    }

}
