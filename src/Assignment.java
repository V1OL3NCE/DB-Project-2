public class Assignment {
    private String assignmentName = "";
    private int assignmentID;
    public static int ID = 1;
    private int offeringID;
    private int assignmentTypeID;

    public Assignment( int offeringID, String Name, int assignmentTypeID) {
        assignmentID = ID;
        ID++;
        this.offeringID = offeringID;
        assignmentName = Name;
        this.assignmentTypeID = assignmentTypeID;
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public int getAssignmentTypeID() {
        return assignmentTypeID;
    }



    @Override
    public String toString(){
        return "INSERT INTO ASSIGNMENT (assignmentID, offeringID, assignmentName, assignmentTypeID) VALUES (" + assignmentID + ", " + offeringID + ", '" + assignmentName + "', " + assignmentTypeID + ")";
    }
}
