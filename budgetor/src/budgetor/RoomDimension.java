
package budgetor;

public class RoomDimension {
    
    private double roomLength;
    private double roomWidth;

    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }
    
    public double RoomArea(){        
        return roomLength * roomWidth;
    }
    
    
    
}
