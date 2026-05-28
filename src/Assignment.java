import java.util.ArrayList;
import java.util.List;


public class Assignment {
    private String assignmentName = "";
    private int assignmentID;
    public static int ID = 1;
    private int offeringID;
    private int assignmentType;




    public Assignment( CourseOffering courseOffering, String Name, AssignmentType assignmentType) {
        assignmentID = ID;
        ID++;
        offeringID = courseOffering.getOfferingID();
        assignmentName = Name;
        this.assignmentType = assignmentType.getAssignmentTypeID();
    }




    public int getAssignmentID() {
        return assignmentID;
    }


    @Override
    public String toString(){
        return "INSERT INTO ASSIGNMENT (assignmentID, offeringID, assignmentName, assignmentTypeID) VALUES (" + assignmentID + ", " + offeringID + ", '" + assignmentName + "', " + assignmentType + ")";
    }


    public static void generateAssignments(ArrayList<Assignment> assignments, List<List<CourseOffering>> courseOfferingsSortByPeriod, ArrayList<AssignmentType> assignmentTypes){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < courseOfferingsSortByPeriod.get(i).size(); j++) {
                for (int k = 1; k <= 3; k++) {
                    assignments.add(new Assignment(courseOfferingsSortByPeriod.get(i).get(j), "Test " + k, assignmentTypes.get(0)));
                }
                for (int k = 1; k <= 6; k++) {
                    assignments.add(new Assignment(courseOfferingsSortByPeriod.get(i).get(j), "Quiz " + k,assignmentTypes.get(1)));
                }
                for (int k = 1; k <= 6; k++) {
                    assignments.add(new Assignment(courseOfferingsSortByPeriod.get(i).get(j), "HW " + k,assignmentTypes.get(1)));
                }
            }
        }
        for (Assignment a: assignments) {
            System.out.println(a);
        }
    }
}



