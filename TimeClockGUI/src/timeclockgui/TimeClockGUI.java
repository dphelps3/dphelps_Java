
package timeclockgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TimeClockGUI {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        // declaring variables
        String greetingMsg = "";
        Boolean displayButtons = false;
        
        /* this method reads a specific text file
        to see which sector the user is currently punched in */
        
        // path to the text file
        String filename = "E:/Phelps/TimeClock/placecode.txt";
        
        // opening the .txt file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        // read the first line from the file
        String line1 = inputFile.nextLine();
                
        // if statement, depending on code
        
        if (line1.equals("0")){
            // bring up the main punch-in window
            greetingMsg = "Select a Punch-In Sector";
            displayButtons = true;
        } else {
            displayButtons = false;
            // declare variable
            String sectorVal = "";
            
            switch(line1){
                case "1":
                    sectorVal = "Photo";
                break;
                case "2":
                    sectorVal = "Video";
                break;
                case "3":
                    sectorVal = "Programming";
                break;
                case "4":
                    sectorVal = "Self Development";
                break;
                default: sectorVal = "Error!";
                break;
            }
            greetingMsg = "You are currently punched in under " + sectorVal;
        }
        
        // initiate object and pass values to the Main class.
        Main gui = new Main(greetingMsg, displayButtons, line1);
        
        // Close the text file
        inputFile.close();
        
        // display the GUI window
        gui.setVisible(true);
    
    }
}