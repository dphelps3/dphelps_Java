
package Rectangle;

// import java scanner
import java.util.Scanner;

public class TriangleDemo {
    
    public static void main(String[] args) {
        
        // declare variables
        double length,
                width;
        
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // get the dimensions of a cube from the user
        System.out.println("Enter the following dimensions of a triangle: ");
        
        System.out.print("Length (height): ");
        length = keyboard.nextDouble();
        
        System.out.print("Width (base): ");
        width = keyboard.nextDouble();
        
        
        // create a cube object and pass the dimensions to the constructor
        Triangle myTri = new Triangle(length,width);
        
        // display the properties of the cube
        System.out.println();
        System.out.println("Here are the properties of the triangle: ");
        
        System.out.println("Length (height): " + myTri.getLength() + " feet");
        System.out.println("Width (base): " + myTri.getWidth() + " feet");
        System.out.println("Surface Area: " + myTri.getSurfaceArea() + " feet");
        
    }
    
}
