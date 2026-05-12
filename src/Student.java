public class Student {
    private String studentName;
    private int studentID;
    private static int ID = 1;

    public Student (String Name){
        this.studentName = Name;
        studentID = ID;
        ID++;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Student.ID = ID;
    }

    public String getName(){
        return studentName;
    }
    public int getstudentID(){
        return studentID;
    }

    @Override
    public String toString(){
        return "INSERT INTO STUDENT (studentID , Name) VALUES (" + studentID + ", '" + studentName + "')";
    }
}
