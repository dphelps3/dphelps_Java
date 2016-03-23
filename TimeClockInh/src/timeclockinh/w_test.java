
package timeclockinh;

import java.util.*;

public class w_test {
    
    public static void main(String[] args) {
        
        // initializing the arrayList
        ArrayList<String> timeEntries = new ArrayList<String>();
        
        timeEntries.add("Sterling");
        timeEntries.add("Darren");
        timeEntries.add("Wayne");
        
        System.out.println("First Names: " + timeEntries.get(0));
        System.out.println("First Names: " + timeEntries.get(2));
        System.out.println("Size is: " + timeEntries.size());
        
    }
}
