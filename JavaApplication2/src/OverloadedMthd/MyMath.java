
package OverloadedMthd;

public class MyMath {
    
    /* in method overloading, multiple methods have the same name,
    but use different parameters */
        
    // to calculate area of a circle
    public static double square(double radius)
    {
        return (3.14 * (radius * radius));
    }
    
    // to calculate area of a rectangle
    public static int square(int width, int length)
    {
        return width * length;
    }
    
    // to calculate area of a cylinder
    public static double square(double height, double radius)
    {
        return (3.14 * ((radius * radius) * (height)));
    }
    
}
