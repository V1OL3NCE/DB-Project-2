import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Department {
    private int departmentID;
    private String Department_Name;
    private static int ID = 1;


    public Department(String Name) {
        this.Department_Name = Name;
        departmentID = ID;
        ID++;
    }


    public int getDepartmentID() {return departmentID;}


    @Override
    public String toString(){
        return "INSERT INTO Departments (Department_ID , Department_Name) VALUES (" + departmentID + ", '" + Department_Name + "')";
    }


    public static void generateDepartments(ArrayList<Department> departments) {
        String[] sep;
        File file = new File("src/DepartmentNames.txt");
        try {
            Scanner fileScan = new Scanner(file);


            String line = fileScan.nextLine();
            sep = line.split(",");
            for (int i = 0; i < sep.length; i++) {
                Department tmp = new Department(sep[i]);
                departments.add(tmp);
                System.out.println(tmp.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}



