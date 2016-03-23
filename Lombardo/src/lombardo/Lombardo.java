
package lombardo;

// import swing
import javax.swing.*;

public class Lombardo {

    public static void main(String[] args) {
        
        // obtain the message
        String msg = JOptionPane.showInputDialog("Please enter a message:");
        
        // the renderer
        if(msg != null && msg.length() > 0) {
            System.out.println(msg);
        } else {
            System.out.println("Hello World!");
        }
        
        System.exit(0);
    }
    
}
