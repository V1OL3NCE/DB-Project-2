

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


    public int getOfferingID() {
        return offeringID;
    }


    @Override
    public String toString(){
        return "INSERT INTO ASSIGNMENT (assignmentID, offeringID, assignmentName, assignmentTypeID) VALUES (" + assignmentID + ", " + offeringID + ", '" + assignmentName + "', " + assignmentType + ")";
    }
}



