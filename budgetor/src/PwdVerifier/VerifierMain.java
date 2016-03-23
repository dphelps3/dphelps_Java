
package PwdVerifier;

import java.util.Scanner;

public class VerifierMain {
    
    public static void main(String[] args) {
        
        // declare variables
        String myInput;
        int myOption = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        // instantiate the detector object and insert value
        Verifier verifyNow = new Verifier();
        
        // enter a String
        System.out.println("Create a password: ");
        myInput = keyboard.nextLine();
        verifyNow.setPassword(myInput);
        
        // get the result
        System.out.println(verifyNow.getResult());
             
    }
    
}