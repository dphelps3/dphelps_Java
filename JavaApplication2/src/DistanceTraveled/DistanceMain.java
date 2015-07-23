
package DistanceTraveled;

// import a scanner for user input
import java.util.Scanner;
import java.io.*;

public class DistanceMain {
    
    public static void main(String[] args) throws IOException {
        
        // declare variables
        int userTrainSpeed;
        double userTrainTime;
        String filename;
        String savedData;
        
        // Create a DistanceFunctions object
        DistanceFunctions calculator = new DistanceFunctions();
        
        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user to enter train speed
        System.out.print("Enter the train's speed: ");
        userTrainSpeed = keyboard.nextInt();
        
        if (userTrainSpeed <= 0) {
            System.out.println("Error. You cannot enter a speed value less"
                    + " than 0 mph! Please try again.");
            System.exit(0);
        }
        
        // ask user to enter time traveled
        System.out.print("Enter the time traveled (in hours): ");
        userTrainTime = keyboard.nextDouble();
        
        if (userTrainTime < 1) {
            System.out.println("Error. Train time cannot be less than 1 hour."
                    + " Please try again.");
            System.exit(0);
        }
        
        if (userTrainSpeed > 0 && userTrainTime > 1) {
            
            // set the speed and time values
            calculator.setTrainSpeed(userTrainSpeed);
            
            // display the speed of the train
            System.out.println("\nThe train's speed: " + calculator.getTrainSpeed()
                + " MPH.");
            
            // loop that will show train progress after the end of each hour
            for (int x = 1; x <= userTrainTime; x++){
                
                // set current trainTime
                calculator.setTrainTime(x);
                
                // display the speed, time and distance
                System.out.println("Distance after hour " + x + ": "
                    + calculator.getDistance() + " miles.");
            }
            
            File file = new File("test.txt");
            FileOutputStream fis = new FileOutputStream(file);
            PrintStream out = new PrintStream(fis);
            System.setOut(out);
            System.out.println("\nThe train's speed: " + calculator.getTrainSpeed()
                + " MPH.");
            // loop that will show train progress after the end of each hour
            for (int x = 1; x <= userTrainTime; x++){
                
                // set current trainTime
                calculator.setTrainTime(x);
                
                // display the speed, time and distance
                System.out.println("Distance after hour " + x + ": "
                    + calculator.getDistance() + " miles.");
            }
        
        } else {
            System.out.println("System Error. Please try again. If problem"
                    + " persists. Please contact us.");
        }
        
        
    }
    
}

