import java.util.ArrayList;


public class CourseType {
    private int courseTypeID;
    private String courseTypeName;
    private static int ID = 0;


    public CourseType(String courseTypeName) {
        courseTypeID = ID;
        this.courseTypeName = courseTypeName;
        ID++;
    }


    public int getCourseTypeID() {
        return courseTypeID ;
    }


    @Override
    public String toString(){
        return "INSERT INTO Course_Type (Course_Type_ID , Course_Type_Name) VALUES (" + courseTypeID  + ", '" + courseTypeName+ "')";
    }


    public static void generateCourseTypes(ArrayList<CourseType> courseTypes) {
        CourseType regent = new CourseType("Regent");
        courseTypes.add(regent);
        CourseType ap = new CourseType("Advanced Placement");
        courseTypes.add(ap);
        CourseType elective = new CourseType("Elective");
        courseTypes.add(elective);
        System.out.println(regent.toString() + "\n" + ap.toString() + "\n" + elective.toString());
    }
}



