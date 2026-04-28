public class util {
    public static int randomGrade() {
        return (int) (Math.random() * 26 + 75);
    }

    public static StringBuilder allRooms() {
        StringBuilder rooms = new StringBuilder();
        String floor = "";
        String side = "";
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
        return rooms;
    }



}
