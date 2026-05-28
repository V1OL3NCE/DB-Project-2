import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private static ArrayList<Department> DeptArr = new ArrayList<>();
    private int departmentID;
    private String Department_Name;
    private static int ID = 1;


    public Department(String Name) {
        this.Department_Name = Name;
        departmentID = ID;
        ID++;
    }

    public int getDepartmentID() {return departmentID;}

    public String getDepartmentName() {return Department_Name;}

    @Override
    public String toString(){
        return "INSERT INTO Departments (Department_ID , Department_Name) VALUES (" + departmentID + ", '" + Department_Name + "')";
    }

    public static void generateDepartments(ArrayList<Department> departments) {
        File departmentNamesFile = new File("src/departmentNames.txt");
        try {
            Scanner departmentFileScan = new Scanner(departmentNamesFile);
            while (departmentFileScan.hasNext()) {
                String departmentName = departmentFileScan.nextLine();
                Department tempDepartment = new Department(departmentName);
                departments.add(tempDepartment);
                System.out.println(tempDepartment.toString());
            }
            departmentFileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
