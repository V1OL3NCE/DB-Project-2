import java.util.ArrayList;

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

    public static void generateRoomNames(ArrayList<String> rooms) {
        String floor = "";
        String side = "";
        for (int f = 0; f < 9; f++) {
            if (f == 0) {
                floor = "B";
            } else {
                floor = f + "";
            }
            for (int s = 1; s < 5; s++) {
                switch (s) {
                    case 1:
                        side = "N";
                        for (int n = 1; n < 21; n++) {
                            rooms.add(floor + side + n);
                        }
                        break;
                    case 2:
                        side = "E";
                        for (int n = 1; n < 21; n++) {
                            rooms.add(floor + side + n);
                        }
                        break;
                    case 3:
                        side = "S";
                        for (int n = 1; n < 21; n++) {
                            rooms.add(floor + side + n);
                        }
                        break;
                    case 4:
                        side = "W";
                        for (int n = 1; n < 21; n++) {
                            rooms.add(floor + side + n);
                        }
                        break;
                }
            }
        }
    }

    public static void generateRooms(ArrayList<String> rooms) {
        Room.generateRoomNames(rooms);
        ArrayList<Room> roomObjects = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            Room tmp = new Room(rooms.get(i));
            roomObjects.add(tmp);
            System.out.println(tmp.toString());
        }
    }
}