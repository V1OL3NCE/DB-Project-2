public class Student {
    private String StudentName;
    private int StudentID;
    private static int ID = 1;

    public Student (String Name){
        this.StudentName = Name;
        StudentID = ID;
        ID++;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Student.ID = ID;
    }

    public String getName(){
        return StudentName;
    }
    public int getStudentId(){
        return StudentID;
    }

    @Override
    public String toString(){
        return "INSERT INTO STUDENT (StudentID , Name) VALUES (" + StudentID + ", '" + StudentName + "')";
    }
}
