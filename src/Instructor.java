import java.util.Scanner;

public class Instructor {
    private String Name;
    private int InstructorId;
    private int DepartmentId;
    public static int ID = 1;

    public Instructor(String name, Department departmentname){
        this.Name = name;
        InstructorId = ID;
        ID++;
        DepartmentId = departmentname.getDepartmentID();
    }

    public int getInstructorId() {
        return InstructorId;
    }

    @Override
    public String toString(){
        return "INSERT INTO Instructor (Instructor_ID, Instructor_Name, Department_ID ) VALUES (" + InstructorId + ", '" + Name + ", '" + DepartmentId + "');";
    }

}

