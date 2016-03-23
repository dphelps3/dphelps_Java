
package Rectangle;

// this class extends the Rectangle class
public class Triangle extends Rectangle{
        
    // constructor
    public Triangle(double len, double w)
    {
        // call the superclass constructor to
        // initialize the length and width
        super(len,w);
        
    }
    
    // return the cube's surface area
    public double getSurfaceArea()
    {
        return getArea() / 2;
    }
    
    
    
    
}
