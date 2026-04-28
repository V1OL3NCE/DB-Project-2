import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private static ArrayList<Room> RoomArr = new ArrayList<>();
    private static int RoomID = 0;
    private String RoomName ;

    public Room(int RoomID, String RoomName) {
        this.RoomID = RoomID;
        this.RoomName = RoomName;
    }

    public int getRoomID() {
        return RoomID;
    }

    public String getRoomName() {
        return RoomName;
    }

    public static int randomGrade() {
        return (int) (Math.random() * 26 + 75);
    }

    public static void allRooms() {
        StringBuilder rooms = new StringBuilder();
        String floor;
        String side;
        for (int f = 0; f < 9; f++) {
            if (f == 0) {
                floor = "B";
            } else {
                floor = f + "";
            }
            for (int s = 1; s < 5; s++) {
                rooms.append("\n");
                switch (s) {
                    case 1:
                        side = "N";
                        for (int n = 1; n < 21; n++) {
                            rooms.append(floor).append(side).append(n).append(" ");
                        }
                        break;
                    case 2:
                        side = "E";
                        for (int n = 1; n < 21; n++) {
                            rooms.append(floor).append(side).append(n).append(" ");
                        }
                        break;
                    case 3:
                        side = "S";
                        for (int n = 1; n < 21; n++) {
                            rooms.append(floor).append(side).append(n).append(" ");
                        }
                        break;
                    case 4:
                        side = "W";
                        for (int n = 1; n < 21; n++) {
                            rooms.append(floor).append(side).append(n).append(" ");
                        }
                        break;
                }
            }
        }
        System.out.println(rooms);
    }

    @Override
    public String toString(){
        return "INSERT INTO ROOM (RoomID , Name) VALUES (" + RoomID + ", '" + RoomName + "')";
    }
}
