public class CourseType {
    private static int Course_Type_ID  = 0;
    private String Course_Type_Name;

    public CourseType(String Assignment_Type_Name) {
        Course_Type_ID++;
        this.Course_Type_Name= Assignment_Type_Name;
    }

    public int getCourse_Type_ID () {
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
