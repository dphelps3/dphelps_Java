
package exercisemania;

// import Scanner
import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        // declaring variables
        int pId;
        int oNbr;
        String fName;
        String lName;
        String jTitle;
        String answer;
        String employeePerson;
        int numAnswer;
        int x = 1;
        
        // activating scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // asking user to enter info
        System.out.println("Are you a boss? Y or N:");
        answer = keyboard.nextLine();
        
        if (answer == "Y" || answer == "y"){
            
            // instantiate employer object
            Employer newBoss = new Employer();
            
            // ask for first name
            System.out.println("Enter your first name: ");
            fName = keyboard.nextLine();
            newBoss.setFirstName(fName);
            
            // ask for last name
            System.out.println("Enter your last name: ");
            lName = keyboard.nextLine();
            newBoss.setLastName(lName);
            
            // ask for employees
            System.out.println("How many people work for you?");
            numAnswer = keyboard.nextInt();
            keyboard.nextLine();
            
            // while loop
            while (x < numAnswer){
                System.out.println("Enter full name for employee " + x + ": ");
                employeePerson = keyboard.nextLine();
                newBoss.setEmployeeArray(employeePerson);
            }
            
        }
        
    }
    
    
}
