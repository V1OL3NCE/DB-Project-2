import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseType {
    private static ArrayList<CourseType> CourseTypeArr = new ArrayList<>();
    private static int Course_Type_ID = 0;
    private String Course_Type_Name;
    private static int ID = 1;

    public CourseType(String Course_Type_Name) {
        Course_Type_ID = ID;
        this.Course_Type_Name = Course_Type_Name;
        ID++;
    }

    public int getCourse_Type_ID() {
        return Course_Type_ID ;
    }

    public String getCourse_Type_Name() {
        return Course_Type_Name;
    }

    @Override
    public String toString(){
        return "INSERT INTO Course_Type (Course_Type_ID , Course_Type_Name) VALUES (" + Course_Type_ID  + ", '" + Course_Type_Name+ "')";
    }
}
