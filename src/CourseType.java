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

    public String getCourseTypeName() {
        return courseTypeName;
    }

    @Override
    public String toString(){
        return "INSERT INTO Course_Type (Course_Type_ID , Course_Type_Name) VALUES (" + courseTypeID  + ", '" + courseTypeName+ "')";
    }
}
