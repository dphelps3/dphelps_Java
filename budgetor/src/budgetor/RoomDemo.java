
package budgetor;

// import java Scanner
import java.util.Scanner;

public class RoomDemo {
    
    public static void main(String[] args) {
        
        // variables
        double userWidth;
        double userLength;
        
        //scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hi, please enter the width of the room: ");
        userWidth = keyboard.nextDouble();
        
        System.out.println("Please enter the length of the room: ");
        userLength = keyboard.nextDouble();
        
        // instantiate an object
        RoomDimension myObject = new RoomDimension();
        
        // plugging in the values
        myObject.setRoomLength(userLength);
        myObject.setRoomWidth(userWidth);
        
        // show the results
        System.out.println("Room Width: " + myObject.getRoomWidth());
        System.out.println("Room Length: " + myObject.getRoomLength());
        System.out.println("Room Area: " + myObject.RoomArea());
        System.out.println("Room Cost: $" + myObject.RoomArea() * 8);
        
    }
    
}
