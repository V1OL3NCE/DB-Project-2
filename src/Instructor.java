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
        return "INSERT INTO Instructor (Instructor_ID, Instructor_Name, Department_ID ) VALUES (" + instructorID + ", '" + name + ", '" + departmentID + "');";
    }

    public static void generateInstructors(ArrayList<Department> departments, ArrayList<Instructor> instructors) {
        File instructorNamesFile = new File("src/instructors.txt");
        try {
            Scanner instructorFileScan = new Scanner(instructorNamesFile);
            while (instructorFileScan.hasNext()){
                String instructorName = instructorFileScan.nextLine();
                Instructor tempInstructor = new Instructor(instructorName, departments.get((int) (Math.random() * 10) )); // random is to assign a random department to the instructor
                instructors.add(tempInstructor);
                System.out.println(tempInstructor.toString());
            }
            instructorFileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}

