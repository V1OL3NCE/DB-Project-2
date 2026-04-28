import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Room gen - start
        ArrayList<String> RoomNames = new ArrayList<>();
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
                            String rooms = "";
                            rooms = floor + side + n;
                            RoomNames.add(rooms);
                        }
                        break;
                    case 2:
                        side = "E";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            RoomNames.add(rooms);
                        }
                        break;
                    case 3:
                        side = "S";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            RoomNames.add(rooms);
                        }
                        break;
                    case 4:
                        side = "W";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            RoomNames.add(rooms);
                        }
                        break;
                }
            }
        }
        for (int i = 0; i < RoomNames.size(); i++) {
            Room tmp = new Room(RoomNames.get(i));
            System.out.println(tmp.toString());
        }
        //Room gen - end

        //department gen - start
        ArrayList<Department> departments = new ArrayList<>();
        String[] sep;
        File file = new File("src/DepartmentNames.txt");
        try {
            Scanner fileScan = new Scanner(file);

            String line = fileScan.nextLine();
            sep = line.split(",");
            for (int i = 0; i < sep.length; i++){
                Department tmp = new Department(sep[i]);
                departments.add(tmp);
                System.out.println(tmp.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        //-end
        //Instructor -start
        ArrayList<Instructor> instructors = new ArrayList<>();
        File file1 = new File("src/Instructor.txt");
        try {
            Scanner fileScan = new Scanner(file1);
            while (fileScan.hasNext()){
                String t;
                t = fileScan.nextLine();
                Instructor tmp = new Instructor(t,departments.get((int) (Math.random() * 10) ));
                instructors.add(tmp);
                System.out.println(tmp.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        //-end
    }
}
