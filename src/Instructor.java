import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Instructor {
    private String name;
    private int instructorID;
    private int departmentID;
    public static int ID = 1;


    public Instructor(String name, Department departmentName){
        this.name = name;
        instructorID = ID;
        ID++;
        departmentID = departmentName.getDepartmentID();
    }


    public int getInstructorId() {
        return instructorID;
    }


    @Override
    public String toString(){
        return "INSERT INTO Instructor (InstructorID, InstructorName, DepartmentID ) VALUES (" + instructorID + ", '" + name + ", " + departmentID + ");";
    }


    public static void generateInstructors(ArrayList<Department> departments, ArrayList<Instructor> instructors) {
        File instructorFile = new File("src/Instructors.txt");
        try {
            Scanner fileScan = new Scanner(instructorFile);
            while (fileScan.hasNext()) {
                String t;
                t = fileScan.nextLine();
                t = t.replace("'", "''");
                Instructor tmp = new Instructor(t, departments.get((int) (Math.random() * 10)));
                instructors.add(tmp);
                System.out.println(tmp.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }


}



