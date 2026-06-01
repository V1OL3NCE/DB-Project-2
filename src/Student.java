import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Student {
    private String studentName;
    private int studentId;
    private static int ID = 1;


    public Student(String Name){
        this.studentName = Name;
        studentId = ID;
        ID++;
    }


    public int getStudentId(){
        return studentId;
    }


    public String getName(){
        return studentName;
    }


    @Override
    public String toString(){
        return "INSERT INTO STUDENT (Student_ID , Name) VALUES (" + studentId + ", '" + studentName + "');";
    }


    public static void generateStudents(ArrayList<Student> students) {
        File studentFile = new File("src/Students.txt");
        try {
            Scanner fileScan = new Scanner(studentFile);
            while (fileScan.hasNext()){
                String line = fileScan.nextLine();
                Student studentTemp = new Student(line);
                students.add(studentTemp);
                System.out.println(studentTemp.toString());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}



