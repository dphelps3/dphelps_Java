
package Rectangle;

public class Rectangle {
    
    // declare private variables
    private double length;
    private double width;
    
    // constructor for Rectangle
    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
    }
    
    /* the setLength method accepts an argument that
    is stored in the length field */
    
    public void setLength(double len)
    {
        length = len;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        
        return length * width;
    }
    
    public double getPerimeter()
    {
        return ((length * 2) + (width * 2));
    }
    
}
