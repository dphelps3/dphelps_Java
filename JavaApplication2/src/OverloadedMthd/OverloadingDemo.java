
package OverloadedMthd;

// import the Scanner
import java.util.Scanner;

public class OverloadingDemo {
    
    public static void main(String[] args) {
        
        int iNumber;
        double dNumber;
        String exitProgram = "";
        
        // create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // get an integer and display its square
        System.out.print("Enter an integer: ");
        iNumber = keyboard.nextInt();
        System.out.println("That number's square is " + MyMath.square(iNumber));
        
        // get a double and display its square
        System.out.print("Enter a double: ");
        dNumber = keyboard.nextDouble();
        System.out.println("That number's square is " + MyMath.square(dNumber));
        keyboard.nextLine();
        
        // exit the program on Y
        System.out.println("Exit program? (Y/N) ");
        exitProgram = keyboard.nextLine();
        
        // if statement for exiting program
        if (exitProgram == "Y" || exitProgram == "y")
        {
            System.exit(0);
        }
        else
        {
            System.out.println("\nVery well then. We shall stay here all night.");
        
        }
        
    }
}
    

