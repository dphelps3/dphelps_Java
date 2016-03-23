
package budgetor;

public class RoomCarpet {
    
    // variable to hold cost per sq ft
    private double costSqFt = 8;
    
    // instantiate an object
    RoomDimension roomObject = new RoomDimension();
    
    // get total cost of carpet via method
    public double FinalCost(){
        return roomObject.RoomArea() * costSqFt;
    }
    
}
