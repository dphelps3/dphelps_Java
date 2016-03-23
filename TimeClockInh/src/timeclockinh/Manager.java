
package timeclockinh;

import java.io.FileNotFoundException;

public class Manager {
    // this class manages and directs all the dirty behind-the-scenes work
        
    static void Manager() throws FileNotFoundException {
        
        // hands off the punch code validation
        ValidatePunchCode.checkPunchCode();
        
    }
    
}
