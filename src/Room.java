import java.util.ArrayList;


public class Room {
    private int roomID;
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


    @Override
    public String toString(){
        return "INSERT INTO Room (roomID , Name) VALUES (" + roomID + ", '" + roomName + "');";
    }


    public static void generateRooms(ArrayList<Room> roomObjects) {
        ArrayList<String> roomNames = new ArrayList<>();
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
                            roomNames.add(floor + side + n);
                        }
                        break;
                    case 2:
                        side = "E";
                        for (int n = 1; n < 21; n++) {
                            roomNames.add(floor + side + n);
                        }
                        break;
                    case 3:
                        side = "S";
                        for (int n = 1; n < 21; n++) {
                            roomNames.add(floor + side + n);
                        }
                        break;
                    case 4:
                        side = "W";
                        for (int n = 1; n < 21; n++) {
                            roomNames.add(floor + side + n);
                        }
                        break;
                }
            }
        }
        for (int i = 0; i < roomNames.size(); i++) {
            Room tmp = new Room(roomNames.get(i));
            roomObjects.add(tmp);
            System.out.println(tmp.toString());
        }
    }
}

