
package Calculator;

// import scanner
import java.util.Scanner;

public class RectangleDemo {
    
    public static void main(String[] args) {
        
        // variable to hold numerical values
        int userLength = 0;
        int userWidth = 0;
        
        // activating the scanner
        Scanner keyboard = new Scanner(System.in);
        
        // creating a new object (instantiating)
        Rectangle r = new Rectangle();
        
        // asking user to enter the length
        System.out.println("Enter the length of the rectangle: ");
        userLength = keyboard.nextInt();
        
        // asking user to enter the width
        System.out.println("Enter the width of the rectangle: ");
        userWidth = keyboard.nextInt();
        
        // sending values to the Rectangle class
        r.setLength(userLength);
        r.setWidth(userWidth);
        
        // outputting final data to the user
        System.out.println("RESULTS:");
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
    }
    
}
