public class Grades {
    private int studentId;
    private int assignmentId;
    private int grade;


    public Grades(Student student,Assignment assignment,int grade){
        studentId = student.getStudentID();
        assignmentId = assignment.getAssignmentID();
        this.grade = grade;
    }


    @Override
    public String toString(){
        return "INSERT INTO Grade (AssignmentID, StudentID , Grade) VALUES ( " + assignmentId +", " + studentId + ", " + grade + ")";
    }

}
