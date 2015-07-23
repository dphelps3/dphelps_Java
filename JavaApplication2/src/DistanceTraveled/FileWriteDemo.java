
package DistanceTraveled;

// import java scanner and IOException
import java.util.Scanner;
import java.io.*;

public class FileWriteDemo {
    
    public static void main(String[] args) throws IOException {
        
        // declaring variables
        String filename; // File name
        String friendName; // Friend's name
        int numFriends;
        
        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // Get the number of friends
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        
        //Consume the remaining newLine character
        keyboard.nextLine();
        
        // get the filename
        System.out.print("Enter the filename (no file extensions, please): ");
        filename = keyboard.nextLine() + ".txt";
        
        // open the file
        PrintWriter outputFile = new PrintWriter(filename);
        
        // Get data and write it to the file
        for (int i = 1; i <= numFriends; i++)
        {
            // Get name of a friend
            System.out.print("Enter the name of friend "
                + "number " + i + ": ");
            friendName = keyboard.nextLine();
            
            // write the name to the file
            outputFile.println(friendName);
        }
        
        // close the file
        outputFile.close();
                
        System.out.println("Data written successfully!");
        
    }
    
}
