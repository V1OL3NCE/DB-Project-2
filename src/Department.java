import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private static ArrayList<Department> DeptArr = new ArrayList<>();
    private int Department_ID;
    private String Department_Name;
    private static int ID = 1;


    public Department(String Name) {
        this.Department_Name = Name;
        Department_ID = ID;
        ID++;
    }

    public int getDepartmentID() {return Department_ID;}

    public String getDepartmentName() {return Department_Name;}

    @Override
    public String toString(){
        return "INSERT INTO Departments (Department_ID , Department_Name) VALUES (" + Department_ID + ", '" + Department_Name + "')";
    }
}
