
package timeclockinh;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class x_test {
    
    public static void main(String[] args) throws IOException, ParseException {
            List<String > photoList =new ArrayList<String>();
            FileInputStream photoTotals = new FileInputStream("E:/Phelps/TimeClock/photo.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(photoTotals));

            String strLine ="", tmp;
            while ((tmp = br.readLine()) != null){ 
                //strLine =tmp+"\n"+strLine;
                photoList.add(tmp);
                }

            System.out.println(photoList.size());
            
            /* if the array size is not an even number, we know that
            the user missed a punch in/out and will throw an error */
            if (photoList.size()%2 != 0){
                System.out.println("ERROR! A punch in/out was missed.");
            } else {
            // convert to a time format
            SimpleDateFormat timeFmt = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            long diff = 0;
            for (int i = photoList.size()-1; i >= 0; i-=2 ) {
                Date timeOut = timeFmt.parse(photoList.get(i));
                Date timeIn = timeFmt.parse(photoList.get(i-1));
                // get the difference between timestamps
                diff += timeOut.getTime() - timeIn.getTime();
                
            }
            System.out.println(diff);
                        
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
            System.out.println(dateFormat);
                
        }
            
        // Close the file
        photoTotals.close();
    }
}
