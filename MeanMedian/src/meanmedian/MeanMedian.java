
package meanmedian;

import java.util.*;

public class MeanMedian {

    public static void main(String[] args) {
       
        // Declare variables
        int days = 0;
        int mean = 0;
                
        // implementing the keyboard scanner
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for input
        System.out.println("Please enter number of days you want to measure"
                + " wind speeds (max. 30 days): ");
        days = keyboard.nextInt();
        
        // create an array for data entry
        int[] windSpd = new int[days+1];
        
        // check to see if user put in correct value between 1 - 30
        if (days > 1 && days < 31){
            
            for (int i = 1; i <= days; i++){
                System.out.println("Insert wind speed for day " + i + ": ");
                windSpd[i] = keyboard.nextInt();
            }
            
        } else {
            System.out.println("Invalid value. Please try again. Number of days"
                    + " need to be between 1-30.");
        }
        
        // get the sum of array list
        int arrayTotal = 0;
        for (int sum : windSpd){
            arrayTotal += sum;
        }
        
        // calculating the mean
        mean = arrayTotal / days;
        
        // sorting the array
        Arrays.sort(windSpd);
        
        // finding the median of the sorted array
        int median;
        if (windSpd.length % 2 == 0){
            median = ((int)windSpd[windSpd.length/2] + (int)windSpd[windSpd.length/2 -1])/2;
        } else {
            median = (int)windSpd[windSpd.length/2];
        }
        
        // output totals to user
        System.out.println("Days: " + days);
        System.out.println("Mean Wind Speed: " + mean);
        System.out.println("Median Wind Speed: " + median);
    }
    
}
