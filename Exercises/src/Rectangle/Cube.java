
package Rectangle;

// this class extends the Rectangle class
public class Cube extends Rectangle{
    
    private double height;
    
    // constructor
    public Cube(double len, double w, double h)
    {
        // call the superclass constructor to
        // initialize the length and width
        super(len,w);
        
        // initialize height
        height = h;
    }
    
    // the getHeight method returns the height field
    public double getHeight()
    {
        return height;
    }
    
    // return the cube's surface area
    public double getSurfaceArea()
    {
        return getArea() * 6;
    }
    
    // getVolume method returns volume of cube
    public double getVolume()
    {
        return getArea() * height;
    }
    
    
    
}
