import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Course {
    private String name;
    private int courseID;
    private int CourseType;
    private static int ID = 1;


    public Course(String name, CourseType courseType){
        this.name = name;
        courseID = ID;
        ID++;
        CourseType = courseType.getCourseTypeID();
    }


    public int getCourse_ID() {
        return courseID;
    }



    @Override
    public String toString(){
        return "INSERT INTO Course (Course_ID , CourseType_ID, Course_Name) VALUES (" + courseID + ", " + CourseType + ",'" + name + "');";
    }


    public static void generateCourses(ArrayList<Course> courses,ArrayList<CourseType> courseTypes){
        File courseFile = new File("src/Courses.txt");
        try {
            Scanner fileScan = new Scanner(courseFile);
            while (fileScan.hasNext()) {
                String t = fileScan.nextLine();
                if (t.equals("REGENTS")) break;
                Course tmp = new Course(t, courseTypes.get(0));
                courses.add(tmp);
                System.out.println(tmp.toString());
            }
            while (fileScan.hasNext()) {
                String t = fileScan.nextLine();
                if (t.equals("ELECTIVES")) break;
                Course tmp = new Course(t, courseTypes.get(1));
                courses.add(tmp);
                System.out.println(tmp.toString());
            }
            while (fileScan.hasNext()) {
                String t = fileScan.nextLine();
                Course tmp = new Course(t, courseTypes.get(2));
                courses.add(tmp);
                System.out.println(tmp.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}



