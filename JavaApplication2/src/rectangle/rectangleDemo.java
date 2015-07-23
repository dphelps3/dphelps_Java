
package rectangle;

public class rectangleDemo {
    
    public static void main(String[] args) {
        
        // Create a Rectangle object
        rectangle box = new rectangle();
        
        // set the length to 10 and the width to 20
        box.setLength(10.0);
        box.setWidth(20.0);
        
        // display the length, width, and area
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getLength());
        System.out.println("The box's area is " + box.getArea());
        
    }
    
}
