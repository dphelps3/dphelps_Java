
package OverloadedMthd;

public class MyMath {
    
    /* in method overloading, multiple methods have the same name,
    but use different parameters */
        
    // to calculate area of a circle
<<<<<<< HEAD
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
=======
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
>>>>>>> 106dd2ee60b28faf6580db300c9207c9488b2131
    }
    
}
