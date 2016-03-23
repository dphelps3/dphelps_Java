
package Rectangle;

// import java scanner
import java.util.Scanner;

public class CubeDemo {
    
    public static void main(String[] args) {
        
        // declare variables
        double length,
                width,
                height;
        
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // get the dimensions of a cube from the user
        System.out.println("Enter the following dimensions of a cube: ");
        
        System.out.print("Length: ");
        length = keyboard.nextDouble();
        
        System.out.print("Width: ");
        width = keyboard.nextDouble();
        
        System.out.print("Height: ");
        height = keyboard.nextDouble();
        
        // create a cube object and pass the dimensions to the constructor
        Cube myCube = new Cube(length,width,height);
        
        // display the properties of the cube
        System.out.println();
        System.out.println("Here are the properties of the cube: ");
        
        System.out.println("Length: " + myCube.getLength() + " feet");
        System.out.println("Width: " + myCube.getWidth() + " feet");
        System.out.println("Height: " + myCube.getHeight() + " feet");
        System.out.println("Base Area: " + myCube.getArea() + " square feet");
        System.out.println("Surface Area: " + myCube.getSurfaceArea() + " square feet");
        System.out.println("Volume: " + myCube.getVolume() + " cubic feet");
        
    }
    
}
