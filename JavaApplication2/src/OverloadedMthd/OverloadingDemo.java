
package OverloadedMthd;

// import the Scanner
import java.util.Scanner;

public class OverloadingDemo {
    
    public static void main(String[] args) {
        
<<<<<<< HEAD
        int iNumber;
        double dNumber;
=======
        double radius, height, radius2;
        int width, length;
      
>>>>>>> 106dd2ee60b28faf6580db300c9207c9488b2131
        String exitProgram = "";
        
        // create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
<<<<<<< HEAD
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
=======
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
>>>>>>> 106dd2ee60b28faf6580db300c9207c9488b2131
        exitProgram = keyboard.nextLine();
        
        // if statement for exiting program
        if (exitProgram == "Y" || exitProgram == "y")
        {
            System.exit(0);
        }
<<<<<<< HEAD
        else
        {
            System.out.println("\nVery well then. We shall stay here all night.");
        
        }
=======
>>>>>>> 106dd2ee60b28faf6580db300c9207c9488b2131
        
    }
}
    

