import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName;
    private int studentID;
    private static int ID = 1;

    public Student(String Name){
        this.studentName = Name;
        studentID = ID;
        ID++;
    }

    public static void setStudentID(int ID) {
        Student.ID = ID;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getName(){
        return studentName;
    }

    @Override
    public String toString(){
        return "INSERT INTO STUDENT (Student_ID , Name) VALUES (" + studentID + ", '" + studentName + "')";
    }

    public static void generateStudents(ArrayList<Student> students) {
        File studentNamesFile = new File("src/students.txt");
        try {
            Scanner studentFileScan = new Scanner(studentNamesFile);
            while (studentFileScan.hasNext()) {
                String studentName = studentFileScan.nextLine();
                Student tempStudent = new Student(studentName);
                students.add(tempStudent);
                System.out.println(tempStudent.toString());
            }
            studentFileScan.close();
        }catch (FileNotFoundException e) {
            System.out.println("error reading file: " + e.getMessage());
        }
    }
}
