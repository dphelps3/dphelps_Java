
package OverloadedMthd;

// import the Scanner
import java.util.Scanner;

public class OverloadingDemo {
    
    public static void main(String[] args) {
        
        double radius, height, radius2;
        int width, length;
      
        String exitProgram = "";
        
        // create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // request information for circle
        System.out.println("CIRCLE");
        System.out.print("Enter the circle's radius: ");
        radius = keyboard.nextDouble();
        System.out.println("Circle area is: " + MyMath.square(radius));
        
        // request information for rectangle
        System.out.println("\nRECTANGLE");
        System.out.print("Enter the rectangle's width: ");
        width = keyboard.nextInt();
        System.out.print("Enter the rectangle's length: ");
        length = keyboard.nextInt();
        System.out.println("Rectangle area is: " + MyMath.square(width, length));
        
        // request information for circle
        System.out.println("\nCYLINDER");
        System.out.print("Enter the cylinder's height: ");
        height = keyboard.nextDouble();
        System.out.print("Enter the cylinder's radius: ");
        radius2 = keyboard.nextDouble();
        System.out.println("Cylinder area is: " + MyMath.square(height,radius2));
        keyboard.nextLine();
        
        // exit the program on Y
        System.out.println("\nExit program? (Y/N) ");
        exitProgram = keyboard.nextLine();
        
        // if statement for exiting program
        if (exitProgram == "Y" || exitProgram == "y")
        {
            System.exit(0);
        }
        
    }
}
    

