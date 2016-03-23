
package Exercises;

public class EmailTester {
    
    public static void main(String[] args) {
        
        // create a string containing a date
        String email = "joe@gaddisbooks.com";
        
        // create a DateComponent object
        EmailComponent ec = new EmailComponent(email);
        
        // display the components of the data
        System.out.println("Here's the email address: " + email);
        System.out.println("Here's the username: " + ec.getUser());
        System.out.println("The company is: " + ec.getCompany());
        System.out.println("The domain is: " + ec.getDomain());
        
    }
    
}