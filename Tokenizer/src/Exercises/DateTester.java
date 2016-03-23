
package Exercises;

public class DateTester {
    
    public static void main(String[] args) {
        
        // create a string containing a date
        String date = "10/31/2015";
        
        // create a DateComponent object
        DateComponent dc = new DateComponent(date);
        
        // display the components of the data
        System.out.println("Here's the date: " + date);
        System.out.println("The month is: " + dc.getMonth());
        System.out.println("The day is: " + dc.getDay());
        System.out.println("The year is: " + dc.getYear());
        
    }
    
}
