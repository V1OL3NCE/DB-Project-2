public class Room {
    private int roomID = 0;
    private static int ID = 1;
    private final String roomName;

    public Room(String RoomName) {
        this.roomID = ID;
        this.roomName = RoomName;
        ID++;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    @Override
    public String toString(){
        return "INSERT INTO ROOM (roomID , Name) VALUES (" + roomID + ", '" + roomName + "');";
    }
}