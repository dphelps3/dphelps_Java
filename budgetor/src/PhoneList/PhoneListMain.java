package PhoneList;

import java.util.Scanner;

public class PhoneListMain {
    
    public static void main(String[] args) {
        
        // declare variables
        String myInput;
        int myOption = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        // instantiate the PhoneList object and insert value
        PhoneList memberList = new PhoneList();
        
        // enter a String
        System.out.println("Search for a name: ");
        myInput = keyboard.nextLine();
        memberList.PhoneList(myInput);
        
             
    }
    
}
