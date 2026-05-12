public class Room {
    private int Room_ID = 0;
    private static int ID = 1;
    private final String Room_Name;

    public Room(String RoomName) {
        this.Room_ID = ID;
        this.Room_Name = RoomName;
        ID ++;
    }

    public int getRoomID() {
        return Room_ID;
    }

    public String getRoomName() {
        return Room_Name;
    }

    @Override
    public String toString(){
        return "INSERT INTO Room (Room_ID , Name) VALUES (" + Room_ID + ", '" + Room_Name + "');";
    }
}