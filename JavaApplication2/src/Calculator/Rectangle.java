
package Calculator;

public class Rectangle {
    
    // declaring variable
    private double width;
    private double length;
    
    // configuring the Setters
    public void setWidth(double w) {
        width = w;
    }
    
    public void setLength(double len) {
        length = len;
    }
    
    // configuring the Getters
    public double getWidth() {
        return width;
    }
    
    public double getLength() {
        return length;
    }
    
    // creating a new method to calculate perimeter
    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }
    
    // create new method to calculate area
    public double getArea() {
        return width * length;
    }
    
}
