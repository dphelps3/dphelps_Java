package timeclock;

// import utilities
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.*;

public class FileReader {
    
    public static void main(String[] args) throws IOException {
        
        // storing the name of the .txt file
        String filename = "E:/Phelps/TimeClock/testfile.txt";
        
        // opening the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        // read the first three lines from the file
        String line1 = inputFile.nextLine();
        String line2 = inputFile.nextLine();
        String line3 = inputFile.nextLine();
        
        // Display the line
        System.out.println("The stored time is: ");
        System.out.println(line3);
        
        // get current time
        RetrieveDate getTheDate = new RetrieveDate();
        // String currTime = getTheDate.GrabTime();
        
        // output the current time
        // System.out.println("The current time is: \n" + currTime);
        
        // re-format the time strings back into date format
        String s = line3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        // String se = currTime;
        SimpleDateFormat secondDateFormat = new SimpleDateFormat("hh:mm a");
        
        // try statement
        try
        {
            Date date = simpleDateFormat.parse(s);
            System.out.println("Date: " + simpleDateFormat.format(date));
        }
        catch (Exception ex)
        {
            System.out.println("Exception" + ex);
        }
        // Close the file
        inputFile.close();
        
    }
}