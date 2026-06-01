import java.util.ArrayList;
import java.util.List;


public class Roster{
    private int courseOfferingID;
    private int studentID;


    public Roster(CourseOffering courseOffering, Student student){
        courseOfferingID = courseOffering.getOfferingID();
        studentID = student.getStudentID();
    }


    public int getCourseOfferingID() {
        return courseOfferingID;
    }


    @Override
    public String toString(){
        return "INSERT INTO ROSTER (StudentID , OfferingID) VALUES (" + studentID + ", " + courseOfferingID + ");";
    }


    public static void generateRoster (ArrayList<Student> students, List<List<Roster>> rosterListSortByStudent, List<List<CourseOffering>> courseOfferingsSortByPeriod){
        for (int i = 0; i < students.size(); i++) {
            rosterListSortByStudent.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                int random = (int) (Math.random() * courseOfferingsSortByPeriod.get(j).size());
                Roster rosterTemp = new Roster(courseOfferingsSortByPeriod.get(j).get(random), students.get(i));
                System.out.println(rosterTemp.toString());
                rosterListSortByStudent.get(i).add(rosterTemp);
            }
        }
    }


}



