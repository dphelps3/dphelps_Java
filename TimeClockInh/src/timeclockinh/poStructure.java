
package timeclockinh;

import javax.swing.JOptionPane;

public class poStructure {
    
    private String currentKey;
    // private String currentCode;
    
    // receive the key from PunchOutWindow class
    public void setKey(String currentKey, String currentCode) {
         this.currentKey = currentKey;
         // this.currentCode = currentCode;
    }
            
    public int getKey(){
    
    // window message
    String poMsg = "You are currently punched in under " + currentKey;
    
    // make a specialized array of buttons for the Punch Out window
    String[] poButtons = {"Punch Out", "Never Mind" };
        
    int mainWin = JOptionPane.showOptionDialog(null, poMsg, "TIME ALLOTMENT",
    JOptionPane.INFORMATION_MESSAGE, 0, null, poButtons, poButtons[1]);
    
    if(poButtons[mainWin].equals("Punch Out")){
        
        // stamps the current time into its respective sector file
        TimeStamp getNow = new TimeStamp();
        TimeStampToFile stampNow = new TimeStampToFile();
        stampNow.updateTime(getNow.GrabDate(), currentKey);
               
        // instantiate modifyPlaceCode object
        modifyPlaceCode modCode = new modifyPlaceCode();
        modCode.updateCode("0");
        
        JOptionPane.showConfirmDialog(null, "Punch-Out Completed.", 
                    "PUNCH OUT", JOptionPane.CLOSED_OPTION);
    } else if (poButtons[mainWin].equals("Never Mind")){
        JOptionPane.showConfirmDialog(null, "Goodbye.",
                "EXIT", JOptionPane.CLOSED_OPTION);
    }
    
    return mainWin;
    }

}
