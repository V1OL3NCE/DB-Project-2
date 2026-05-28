public class Roster{
    private int courseOfferingId;
    private int studentId;
    private CourseOffering courseOffering;


    public Roster(CourseOffering courseOffering, Student student){
        courseOfferingId = courseOffering.getOfferingID();
        studentId = student.getStudentID();
        this.courseOffering = courseOffering;
    }


    public CourseOffering getCourseOffering() {
        return courseOffering;
    }


    public int getCourseOfferingID() {
        return courseOfferingId;
    }


    public int getStudentId() {
        return studentId;
    }


    @Override
    public String toString(){
        return "INSERT INTO ROSTER (StudentID , OfferingID) VALUES (" + studentId + ", " + courseOfferingId + ")";
    }
}
