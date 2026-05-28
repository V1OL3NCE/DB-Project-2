public class CourseOffering {
    private int offeringID;
    private static int ID = 1;
    private int period;
    private int instructorID;
    private int courseID;
    private int roomID;


    public CourseOffering(Instructor i, Course c, Room r, int period){
        offeringID = ID;
        ID++;
        instructorID = i.getInstructorId();
        courseID = c.getCourse_Id();
        roomID = r.getRoomID();
        this.period = period;
    }

    public int getOfferingID() {
        return offeringID;
    }

    public int getCourseID() {
        return courseID;
    }


    @Override
    public String toString(){
        return "INSERT INTO Course_Offering (Offering_ID, Period, Instructor_ID, Course_ID, Room_ID) VALUES (" + offeringID + ", " + period + ", " + instructorID + ", " + courseID + ", " + roomID + ");";
    }
}
