import java.util.ArrayList;


public class AssignmentType {
    private int assignmentTypeID;
    private static int ID = 0;
    private String assignmentTypeName ;


    public AssignmentType(String Name) {
        this.assignmentTypeName = Name;
        assignmentTypeID = ID;
        ID++;
    }


    public int getAssignmentTypeID() {
        return assignmentTypeID;
    }


    @Override
    public String toString(){
        return "INSERT INTO AssignmentType (AssignmentTypeID, AssignmentTypeName ) VALUES (" + assignmentTypeID + ", '" + assignmentTypeName + "');";
    }


    public static void generateAssignmentType(ArrayList<AssignmentType> assignmentTypes){
        assignmentTypes.add(new AssignmentType("Major"));//MAJOR IS ID OF 0
        assignmentTypes.add(new AssignmentType("Minor"));//MINOR IS ID OF 1
        for (AssignmentType assignmentType : assignmentTypes) {
            System.out.println(assignmentType);
        }
    }
}





