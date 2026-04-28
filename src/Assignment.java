public class Assignment {
    private String Assignment_Name = "";
    private int Assignment_ID;
    public static int ID = 1;
    private int Offering_ID;
    private int Assignment_Type;

    public Assignment(String Name, Instructor instructorname) {
        Assignment_Name = Name;
        Assignment_ID = ID;
        ID++;
    }

    @Override
    public String toString(){
        return "INSERT INTO ASSIGNMENT (Assignment_ID, Offering_ID, Assignment_Name, Assignment_Type_ID) VALUES (" + Assignment_ID + ", " + Offering_ID + ", '" + Assignment_Name + "', " + Assignment_Type + ")";
    }
}
