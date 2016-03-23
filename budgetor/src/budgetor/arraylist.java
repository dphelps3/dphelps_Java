
package budgetor;

// import arrayList
import java.util.ArrayList;

public class arraylist {
    
    public static void main(String[] args) {
        
        int x;

        ArrayList<String> array = new ArrayList<String>();

        array.add("CSH");
        array.add("QuietGlide");
        array.add("InvisiDoor");

        for (x = 0; x < array.size(); x++) {
            System.out.println(array.get(x));
        }
        
        System.out.println("");
        
        // now remove one element
        array.remove(1);
        
        // check again
        for (x = 0; x < array.size(); x++) {
            System.out.println(array.get(x));
        }
        
    }
}
