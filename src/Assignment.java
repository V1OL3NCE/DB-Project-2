public class Assignment {
    private String assignmentName = "";
    private int assignmentID;
    public static int ID = 1;
    private int offeringID;
    private int Assignment_Type;

    public Assignment(String Name, Instructor instructorname) {
        assignmentName = Name;
        assignmentID = ID;
        ID++;
    }

    @Override
    public String toString(){
        return "INSERT INTO ASSIGNMENT (assignmentID, offeringID, assignmentName, assignmentTypeID) VALUES (" + assignmentID + ", " + offeringID + ", '" + assignmentName + "', " + Assignment_Type + ")";
    }
}
