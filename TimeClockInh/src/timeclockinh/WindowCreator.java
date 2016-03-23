
package timeclockinh;

// import all the utilities
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class WindowCreator {
        
    static void createWin() throws FileNotFoundException, ParseException, IOException {
            
    // declare variables
    String welcomeMsg = "Select Punch-In Sector";
    String currentVal = "error";
    
    // instantiate all sector objects to retrieve info
    Photo tPhoto = new Photo();
    Video tVideo = new Video();
    Programming tProgramming = new Programming();
    SelfDev tSelfDev = new SelfDev();
    
    // array to hold the buttons
    String[] buttons = {tPhoto.fireButton(), tVideo.fireButton(),
        tProgramming.fireButton(), tSelfDev.fireButton(), "View Totals","Exit" };
    
    // create a JOptionPane window
    int mainWin = JOptionPane.showOptionDialog(null, welcomeMsg, "TIME ALLOTMENT",
    JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[5]);
    
    // if statement for the exit button
    if(buttons[mainWin].equals("Exit")){
        JOptionPane.showConfirmDialog(null, "Goodbye.",
                "EXIT", JOptionPane.CLOSED_OPTION);
        System.exit(0);
    } else if(buttons[mainWin].equals("View Totals")){
        retrieveTotals.getTotals();
    } else
       
    // switch statement
    switch (buttons[mainWin]) {
        case "Self Development":
            currentVal = "4";
        break;
        case "Programming":
            currentVal = "3";
        break;
        case "Video":
            currentVal = "2";
        break;
        case "Photo":
            currentVal = "1";
        break;
        default:
            currentVal = "Error!";
        break;
    }

        
        // stamps the current time into its respective sector file
        TimeStamp getNow = new TimeStamp();
        TimeStampToFile stampNow = new TimeStampToFile();
        stampNow.updateTime(getNow.GrabDate(), buttons[mainWin]);
    
        // instantiate modifyPlaceCode object. this changes the key code
        modifyPlaceCode changeCode = new modifyPlaceCode();
        changeCode.updateCode(currentVal);
        System.out.println(currentVal);
        
        JOptionPane.showConfirmDialog(null, "Punch-In for " + buttons[mainWin] + " Completed.", 
                    "PUNCH IN", JOptionPane.CLOSED_OPTION);
    }
    }
    
    

