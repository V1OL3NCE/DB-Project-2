public class Course {
    private String name;
    private int Course_Id;
    private int CourseType;
    private static int ID = 1;

    public Course(String name, CourseType courseType){
        this.name = name;
        Course_Id = ID;
        ID++;
        CourseType = courseType.getCourse_Type_ID();
    }

    public int getCourse_Id() {
        return Course_Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "INSERT INTO Course (Course_ID , CourseType_ID, CourseName) VALUES (" + Course_Id + ", " + CourseType + ",'" + name + "')";
    }
}
