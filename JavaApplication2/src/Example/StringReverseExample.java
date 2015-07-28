
package Example;

import java.util.Scanner;

public class StringReverseExample {
    
    public static void main(String[] args) {
        
        // declaring variable
        String userInput = "";
        
        // importing scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Asking user for string
        System.out.println("Please enter a string: ");
        userInput = keyboard.nextLine();
        
        // new class
        String reverse = new StringBuffer(userInput).reverse().toString();
        
        // output to the user
        System.out.println("\nBefore: " + userInput);
        System.out.println("\nAfter: " + reverse);
        
    }
    
}
