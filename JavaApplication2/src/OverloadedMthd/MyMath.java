
package OverloadedMthd;

public class MyMath {
    
    /* in method overloading, multiple methods have the same name,
    but use different parameters */
        
    // to calculate area of a circle
    public static double square(double userRadius)
    {
        return (3.14 * (userRadius * userRadius));
    }
    
    // to calculate area of a rectangle
    public static int square(int userWidth, int userLength)
    {
        return userWidth * userLength;
    }
    
    // to calculate area of a cylinder
    public static double square(double userHeight, double userRadius2)
    {
        return (3.14 * ((userRadius2 * userRadius2) * (userHeight)));
    }
    
}
