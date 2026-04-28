public class AssignmentType {
    private static int Assignment_Type_ID = 0;
    private String Assignment_Type_Name ;

    public AssignmentType(String Name) {
        Assignment_Type_ID++;
        this.Assignment_Type_Name = Name;
    }

    public int getAssignment_Type_ID() {
        return Assignment_Type_ID;
    }

    public String getAssignment_Type_Name() {
        return Assignment_Type_Name;
    }

    @Override
    public String toString(){
        return "INSERT INTO Assignment_Type (Assignment_Type_ID, Assignment_Type_Name ) VALUES (" + Assignment_Type_ID + ", '" + Assignment_Type_Name + "')";
    }
}
