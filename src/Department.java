import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private static ArrayList<Department> DeptArr = new ArrayList<>();
    private int DepartmentID;
    private String DepartmentName;
    private static int ID = 1;


    public Department(String Name) {
        this.DepartmentName = Name;
        DepartmentID = ID;
        ID++;
    }

    public int getDepartmentID() {return DepartmentID;}

    public String getDepartmentName() {return DepartmentName;}

    public static void readData() {
        File file = new File("src/DepartmentNames.txt");
        try {
            Scanner fileScan = new Scanner(file);

            String line = fileScan.nextLine();
            String[] sep = line.split(",");
            for (int i = 0; i < sep.length; i++){
                DeptArr.add(i, new Department(sep[i]));
            }

            for (Department element : DeptArr) {
                System.out.println(element);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    @Override
    public String toString(){
        return "INSERT INTO Departments (DepartmentID , DepartmentName) VALUES (" + DepartmentID + ", '" + DepartmentName + "')";
    }
}
