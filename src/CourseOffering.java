public class CourseOffering {
    private int offeringID;
    private static int ID = 1;
    private int period;
    private int InstructorID;
    private int CourseID;
    private int RoomID;


    public CourseOffering(Instructor i, Course c, Room r, int period){
        offeringID = ID;
        ID++;
        InstructorID = i.getInstructorId();
        CourseID = c.getCourse_Id();
        RoomID = r.getRoomID();
        this.period = period;
    }


    public int getCourseID() {
        return CourseID;
    }


    @Override
    public String toString(){
        return "INSERT INTO Course_Offering (Offering_ID, Period, Instructor_ID, Course_ID, Room_ID) VALUES (" + offeringID + ", " + period + ", " + InstructorID + ", " + CourseID + ", " + RoomID + ");";
    }
}
