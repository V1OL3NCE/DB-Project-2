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

    public String getAssignmentTypeName() {
        return assignmentTypeName;
    }

    @Override
    public String toString(){
        return "INSERT INTO Assignment_Type (Assignment_Type_ID, Assignment_Type_Name ) VALUES (" + assignmentTypeID + ", '" + assignmentTypeName + "')";
    }
}
