
package Rainfall;

// import java Scanner
import java.util.Scanner;

// import DecimalFormat
import java.text.DecimalFormat;

public class main {
    
    public static void main(String[] args) {
        
        // declare variables
        final int MONTHS = 12;
        
        int nbrOfYears = 0;
        int nbrOfMonths = 0;
        double receivedValue = 0;
        double runningTotal = 0;
        double avgRainfall = 0;
        
        // activate scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for number of years
        System.out.println("Please enter number of years: ");
        nbrOfYears = keyboard.nextInt();
        
            /* error validation - to ensure that user does not enter
            a number less than 1 */
            while (nbrOfYears < 1)
            {
                System.out.println("Sorry, you cannot enter a value less than 1."
                        + " Please try again");

                // ask user for number of years
            System.out.println("Please enter number of years: ");
            nbrOfYears = keyboard.nextInt();
            }
                    
            // loop through each year the user selected
            for (int a = 1; a <= nbrOfYears; a++)
            {
                System.out.println("YEAR " + a + ": ");
                        
                // nested for loop for months out of the year
                for (int b = 1; b <= MONTHS; b++)
                {
                    System.out.println("Enter rainfall amount for month: " + b);
                    receivedValue = keyboard.nextDouble();
                    
                    // error validation for any negative values
                    while (receivedValue < 0){
                        System.out.println("Error. Number cannot be negative.");
                        
                        // ask user to enter rainfall again
                        System.out.println("Enter rainfall amount for month: " + b);
                        receivedValue = keyboard.nextDouble();
                    }
                    
                    runningTotal += receivedValue; 
                }
            }
            
            // decimalFormat to round percentage to two decimal places
            DecimalFormat formatter = new DecimalFormat("#0.00");
            
            // calculate number of months
            nbrOfMonths = nbrOfYears * MONTHS;
            
            // calculate overall average rainfall
            avgRainfall = runningTotal / nbrOfMonths;
            
            // Output the totals
            System.out.println("\nNumber of Months: " + nbrOfMonths);
            System.out.println("Total Inches of Rainfall: " + runningTotal);
            System.out.println("Average Rainfall: " + 
                        formatter.format(avgRainfall) + " inches");
    }
    
}
