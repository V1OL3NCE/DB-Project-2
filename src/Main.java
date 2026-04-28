import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 100; i++) {
            System.out.print(util.randomGrade() + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(util.allRooms());
        */

        //Testing Department
        System.out.println();


        Department.readData();
        Room.allRooms();


    }
}
