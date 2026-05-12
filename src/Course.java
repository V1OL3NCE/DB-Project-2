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

    public int getCourse_Id() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "INSERT INTO Course (Course_ID , CourseType_ID, CourseName) VALUES (" + courseID + ", " + CourseType + ",'" + name + "')";
    }
}
