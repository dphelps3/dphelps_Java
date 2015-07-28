
package Occupancy;

// import java Scanner
import java.util.Scanner;

// import DecimalFormat
import java.text.DecimalFormat;

public class Main {
    
    public static void main(String[] args) {
        
        // Declare variables
        int floors = 0;
        int occupiedRooms = 0;
        int vacantRooms = 0;
        int totalRooms = 0;
        double occupancyRate = 0;
        double conv_occupiedRooms;
        double conv_totalRooms;
        
        // import Java Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user for number of floors
        System.out.println("How many floors in your hotel? ");
        floors = keyboard.nextInt();
        
        // for loop to loop through each floor in the hotel
        for (int i = 1; i <= floors; i++)
        {
            System.out.println("\nHow many rooms on floor " + i + " ? ");
            totalRooms += keyboard.nextInt();
            
            System.out.println("\nHow many rooms are occupied on floor " + i + " ? ");
            occupiedRooms += keyboard.nextInt();
            
        }
        
        // Total vacant rooms
        vacantRooms = totalRooms - occupiedRooms;
        
        // cast int values into double
        conv_occupiedRooms = (double)occupiedRooms;
        conv_totalRooms = (double)totalRooms;
        
        // calculate occupancy rate
        occupancyRate = (conv_occupiedRooms / conv_totalRooms) * 100;
        
        // decimalFormat to round percentage to two decimal places
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        // output information to user
        System.out.println("\n\nHOTEL\n");
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Occupied Rooms: " + occupiedRooms);
        System.out.println("Vacant Rooms: " + vacantRooms);
        System.out.println("Occupancy Rate: " + formatter.format(occupancyRate) + "%");
        
    }
    
}
