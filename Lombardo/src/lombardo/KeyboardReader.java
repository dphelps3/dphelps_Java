
package lombardo;

import java.util.Scanner;

public class KeyboardReader implements Reader {
    
    public String readln() {
        System.out.println("Please enter some text, then press return: ");
        
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
}
