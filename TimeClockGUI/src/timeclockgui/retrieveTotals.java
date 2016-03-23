package timeclockgui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class retrieveTotals {
    
    public void getTotals() throws FileNotFoundException, ParseException, IOException {
        
        // create an array
        String[] secArray = {"photo", "video", "programming", "selfdev"};
        
        // create running total variable and other variables
        double runningTotal = 0;
        double photoTotals = 0;
        double videoTotals = 0;
        double programmingTotals = 0;
        double selfdevTotals = 0;
        
        // for loop to iterate through the secArray
        for (int z = 0; z < secArray.length; z++){
                        
            List<String > currList = new ArrayList<String>();
            FileInputStream currTotals = new FileInputStream("E:/Phelps/TimeClock/" + secArray[z] + ".txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(currTotals));

            String strLine = "", tmp;
            while ((tmp = br.readLine()) != null){ 
                //strLine =tmp+"\n"+strLine;
                currList.add(tmp);
                }
            
            /* if the array size is not an even number, we know that
            the user missed a punch in/out and will throw an error */
            if (currList.size()%2 != 0){
                // System.out.println("ERROR! A punch in/out was missed.");
                JOptionPane.showConfirmDialog(null, "ERROR! A punch in/out was missed.",
                "ERROR", JOptionPane.CLOSED_OPTION);
            } else {
            // convert to a time format
            SimpleDateFormat timeFmt = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            long diff = 0;
            for (int i = currList.size()-1; i >= 0; i-=2 ) {
                Date timeOut = timeFmt.parse(currList.get(i));
                Date timeIn = timeFmt.parse(currList.get(i-1));
                // get the difference between timestamps
                diff += timeOut.getTime() - timeIn.getTime();
                
            }
            // maintain running total for each sector
            if (secArray[z].equals("selfdev")) {
                selfdevTotals = diff;
            } else if (secArray[z].equals("programming")) {
                programmingTotals = diff;
            } else if (secArray[z].equals("video")) {
                videoTotals = diff;
            } else if (secArray[z].equals("photo")) {
                photoTotals = diff;
            } else {
                System.out.println("You have an error!");
            }
            
            runningTotal += diff;
                        
            // format to English language
            String dateFormat="Duration: ";
            int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
            if(diffDays>0){
                dateFormat+=diffDays+" day ";
            }
            diff -= diffDays * (24 * 60 * 60 * 1000);

            int diffhours = (int) (diff / (60 * 60 * 1000));
            if(diffhours>0){
                dateFormat+=diffhours+" hours ";
            }
            diff -= diffhours * (60 * 60 * 1000);

            int diffmin = (int) (diff / (60 * 1000));
            if(diffmin>0){
                dateFormat+=diffmin+" min ";
            }
            diff -= diffmin * (60 * 1000);

            int diffsec = (int) (diff / (1000));
            if(diffsec>0){
                dateFormat+=diffsec+" sec";
            }
            JOptionPane.showConfirmDialog(null, dateFormat,
                "TOTALS", JOptionPane.CLOSED_OPTION);
                            
        }
           
        // Close the file
        currTotals.close();
        System.out.println("Sector " + secArray[z] + " is done.");
        } // end of for loop
        
        // calculate the percentage
        double vidPct = Math.round((videoTotals / runningTotal) * 100);
        double phoPct = Math.round((photoTotals / runningTotal) * 100);
        double proPct = Math.round((programmingTotals / runningTotal) * 100);
        double sdPct = Math.round((selfdevTotals / runningTotal) * 100);
        
        // display individual totals
        System.out.println("Video Totals: " + videoTotals + ", " + vidPct + "%");
        System.out.println("Photo Totals: " + photoTotals + ", " + phoPct + "%");
        System.out.println("Programming Totals: " + programmingTotals + ", " + proPct + "%");
        System.out.println("Self Dev Totals: " + selfdevTotals + ", " + sdPct + "%");
        
        // display running total
        //System.out.println(runningTotal);
        
        
    } 
}
