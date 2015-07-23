
package PenniesForPay;

// import java scanner
import java.util.Scanner;

public class PenniesMain {
    
    public static void main(String[] args) {
        
        // declare variables
        int daysWorked;
        double penny = 0.01;
        
        // import scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to input number of days
        System.out.println("How many days did you work? ");
        daysWorked = keyboard.nextInt();
        
        // for loop to calculate pay per day, with a final total
        for (int i = 1; i <= daysWorked; i++)
        {
            System.out.println("Day " + i + ": $" + penny);
            penny = penny + penny;
        }
        
    }
    
}
