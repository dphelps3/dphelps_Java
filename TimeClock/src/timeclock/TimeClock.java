
package timeclock;

// import all the utilities
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.PrintWriter;

public class TimeClock {

    public static void main(String[] args) throws IOException {
        
        boolean answer = false;
        // string that contains the text for each button
        String[] buttons = {"Photo", "Video", "Programming", "Exit" };
        String[] punchOut = {"Punch Out", "Exit" };
        
        /* before doing anything, this program reads a specific text file
        to see where the user is currently at */
        String filename = "E:/Phelps/TimeClock/placecode.txt";
        
        // opening the .txt file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        // read the first line from the file
        String line1 = inputFile.nextLine();
        
        // Display the line
        System.out.println(line1);
        
        /* find out where the person is at for our switch statement
        0 - a new punch in
        1 - currently punched in as photo
        2 - currently punched in as video
        3 - currently punched in as programming
        */
        switch (line1) {
            case "3":
                String action3 = "You are currently punched in for Programming";
                // creation of the JOptionPane
                int rc3 = JOptionPane.showOptionDialog(null, action3, "TIME ALLOTMENT",
                JOptionPane.INFORMATION_MESSAGE, 0, null, punchOut, punchOut[1]);
                if(buttons[rc3].equals("Punch Out")){
                    answer = true;
                }
            break;
            case "2":
                String action2 = "You are currently punched in for Video";
                // creation of the JOptionPane
                int rc2 = JOptionPane.showOptionDialog(null, action2, "TIME ALLOTMENT",
                JOptionPane.INFORMATION_MESSAGE, 0, null, punchOut, punchOut[1]);
                if(buttons[rc2].equals("Punch Out")){
                    answer = true;
                }
            break;
            case "1":
                String action1 = "You are currently punched in for Photo";
                // creation of the JOptionPane
                int rc1 = JOptionPane.showOptionDialog(null, action1, "TIME ALLOTMENT",
                JOptionPane.INFORMATION_MESSAGE, 0, null, punchOut, punchOut[1]);
                if(buttons[rc1].equals("Punch Out")){
                    answer = true;
                }
            break;
        }
        // closes the .txt file
        inputFile.close();  
        
        /* if the answer is true, that meant that the user punched out
        this function will send an end timestamp and return the value to 0.
        the user can now punch in under a new section
        */
        if (answer = true){
            
            // variable for file name
            String fileAlias = "";
            
            // switch statement for end timestamp
            switch (line1) {
            case "3":
                fileAlias = "programming";
            break;
            case "2":
                fileAlias = "Video";
            break;
            case "1":
                fileAlias = "Photo";
            break;
            }
            
            // stamp end time in respective text file
            RetrieveDate endTime = new RetrieveDate();
            
            //variables to hold date/time values
            String stampEndDate = endTime.GrabDate();
            
            // write to an existing file
            File writeEndToFile = new File("E:/Phelps/TimeClock/" + fileAlias
                    + ".txt");
            PrintWriter endPrintWriter = null;
            
            // write values to file
            try {
                endPrintWriter = new PrintWriter(writeEndToFile);
                endPrintWriter.println(stampEndDate);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (endPrintWriter != null)
                {
                    endPrintWriter.close();
                }
            }
        // closes the .txt file
        inputFile.close(); 
            
            // changes placecode value to 0
            String file1 = "E:/Phelps/TimeClock/placecode.txt";
            PrintWriter printWriter = null;
            try {
                printWriter = new PrintWriter(file1);
                printWriter.println("0");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (printWriter != null)
                {
                    printWriter.close();
                }
            }
        }
        
        if (answer = true || line1.equals("0")){
            
        String action1 = "Which sector are you punching in for? ";  
        
        // creation of the JOptionPane
        int rc = JOptionPane.showOptionDialog(null, action1, "TIME ALLOTMENT",
                JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[3]);
        
        // if Photo button is selected
        if(buttons[rc].equals("Photo")) {
            
            // write values to file - changes the code to number 1
            String file2 = "E:/Phelps/TimeClock/placecode.txt";
            PrintWriter photoPrintWriter = null;
            try {
                photoPrintWriter = new PrintWriter(file2);
                photoPrintWriter.println("1");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (photoPrintWriter != null)
                {
                    photoPrintWriter.close();
                }
            }
            
            // instantiate date/time functions
            RetrieveDate gotDate = new RetrieveDate();
            
            //variables to hold date/time values
            String photoDate = gotDate.GrabDate();
            // String photoTime = gotDate.GrabTime();
            
            // write to an existing file
            File file1 = new File("E:/Phelps/TimeClock/photo.txt");
            PrintWriter printWriter = null;
            
            // write values to file
            try {
                printWriter = new PrintWriter(file1);
                printWriter.println(photoDate);
                // printWriter.println(photoTime);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (printWriter != null)
                {
                    printWriter.close();
                }
            }
            
            JOptionPane.showConfirmDialog(null, "Photo option saved to file.\n" 
                    + photoDate + "\n",
                    //+ photoTime, 
                    "Photos Selected", JOptionPane.CLOSED_OPTION);
            
        // if Video button is selected
        } else if (buttons[rc].equals("Video")) {
            
            // instantiate date/time functions
            RetrieveDate gotDate = new RetrieveDate();
            
            JOptionPane.showConfirmDialog(null, "Video option saved.\n" 
                    + gotDate.GrabDate() + "\n",
                    //+ gotDate.GrabTime(), 
                    "Videos Selected", JOptionPane.CLOSED_OPTION);
            
        // if Programming button is selected
        } else if (buttons[rc].equals("Programming")) {
            
            // instantiate date/time functions
            RetrieveDate gotDate = new RetrieveDate();
            
            JOptionPane.showConfirmDialog(null, "Programming option saved.\n" 
                    + gotDate.GrabDate() + "\n",
                    // + gotDate.GrabTime(), 
                    "Programming Selected", JOptionPane.CLOSED_OPTION);
        // if red X button is selected
        
        // if exit is selected
        } else {
            JOptionPane.showConfirmDialog(null, "Goodbye.", 
                    "Exit Program", JOptionPane.CLOSED_OPTION);
            System.exit(0);
        }
    } 
  }
}
