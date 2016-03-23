
package VowCon;

// import Java Scanner
import java.util.Scanner;

public class DetectorMain {
    
    public static void main(String[] args) {
        
        // declare variables
        String myInput;
        int myOption = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        // instantiate the detector object and insert value
        Detector detectNow = new Detector();
        
// enter a String
        System.out.println("Enter a word of your choice: ");
        myInput = keyboard.nextLine();
        detectNow.setString(myInput);
                
        do { 
            System.out.println("What would you like to do now?"
                + "\n1: Count number of vowels"
                + "\n2: Count number of consonants"
                + "\n3: Count number of letters"
                + "\n4: Enter another string"
                + "\n5: Exit the program");
            
            myOption = keyboard.nextInt();
            keyboard.nextLine();
            
            if (myOption == 1){
                System.out.println("\nVowels: \n" + detectNow.getVowels());
            } else if (myOption == 2){
                System.out.println("Consonants: \n" + detectNow.getCons());
            } else if (myOption == 3){
                System.out.println("Combined: \n" + detectNow.getCombined());
            } else if (myOption == 4){
                System.out.println("Enter new string: \n");
                myInput = keyboard.nextLine();
                detectNow.setString(myInput);
            }
            
        } while (myOption != 5);
        
        if (myOption == 5){
            System.out.println("\nThank you!");
            System.exit(0);
        }
             
    }
    
}
