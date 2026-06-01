import java.util.ArrayList;
import java.util.List;


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
        CourseID = c.getCourseID();
        RoomID = r.getRoomID();
        this.period = period;
    }


    public int getOfferingID() {
        return offeringID;
    }


    @Override
    public String toString(){
        return "INSERT INTO CourseOffering (OfferingID, Period, InstructorID, CourseID, RoomID) VALUES (" + offeringID + ", " + period + ", " + InstructorID + ", " + CourseID + ", " + RoomID + ");";
    }


    public static void generateCourseOffering( List<List<CourseOffering>> courseOfferingsSortByPeriod, ArrayList<Instructor> instructors, ArrayList<Course> courses, ArrayList<Room> roomObjects){
        List<List<Course>> coursesSortByPeriod = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            coursesSortByPeriod.add(new ArrayList<>());
            courseOfferingsSortByPeriod.add(new ArrayList<>());
        }
        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < (int)(Math.random()*5)+1; j++) {
                int loopTemp = (int) (Math.random() * 10 + 1);
                coursesSortByPeriod.get(loopTemp - 1).add(courses.get(i));
            }
        }
        for (int i = 0; i < 10; i++) {
            ArrayList<Instructor> instructorTemp = new ArrayList<>(instructors);
            ArrayList<Room> roomTemp = new ArrayList<>(roomObjects);
            for (int j = 0; j < coursesSortByPeriod.get(i).size(); j++) {
                int iTempInt = (int) ((Math.random() * instructorTemp.size()));
                int rTempInt = (int) ((Math.random() * roomTemp.size()));
                CourseOffering tempOffering = new CourseOffering(instructorTemp.get(iTempInt), coursesSortByPeriod.get(i).get(j), roomTemp.get(rTempInt), i + 1);
                courseOfferingsSortByPeriod.get(i).add(tempOffering);
                instructorTemp.remove(iTempInt);
                roomTemp.remove(rTempInt);
                System.out.println(tempOffering.toString());
            }
        }
    }
}



