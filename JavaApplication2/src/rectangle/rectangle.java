
package rectangle;

public class rectangle {
    
    private double length;
    private double width;
    
    /* The setLength method accepts an argument
    that is stored in the length field
    */
    
    // This is a method
    public void setLength(double len)
    {
        length = len;
    }
    
    /* the setWidth method accepts an argument
    that is stored in the width field
    */
    public void setWidth(double w)
    {
        width = w;
    }
    
    /* the getLength method returns the value
    stored in the length field
    */
    public double getLength()
    {
        return length;
    }
    
    // same for the getWidth method
    public double getWidth()
    {
        return width;
    }
    
    /* the getArea method returns the value
    of the length field times the width
    field
    */
    public double getArea()
    {
        return length * width;
    }
    
}
