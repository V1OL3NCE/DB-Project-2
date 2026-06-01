import java.util.ArrayList;
import java.util.List;


public class Grades {
    private int studentId;
    private int assignmentId;
    private int grade;


    public Grades(Student student,Assignment assignment,int grade){
        studentId = student.getStudentId();
        assignmentId = assignment.getAssignmentID();
        this.grade = grade;
    }


    @Override
    public String toString(){
        return "INSERT INTO Grade (AssignmentID, StudentID , Grade) VALUES ( " + assignmentId +", " + studentId + ", " + grade + ");";
    }


    public static void generateGrades(ArrayList<Student> students, ArrayList<Assignment> assignments, List<List<Roster>> rosterListSortByStudent){
        for (int i = 0; i < rosterListSortByStudent.size(); i++) {
            for (int j = 0; j < rosterListSortByStudent.get(i).size(); j++) {
                int temp = rosterListSortByStudent.get(i).get(j).getCourseOfferingId();
                for (int k = (15*(temp-1)); k <= (15*temp)-1; k++) {
                    int gradeRandom = (int) (Math.random() * 25) + 75;
                    Grades grade = new Grades(students.get(i),assignments.get(k),gradeRandom);
                    System.out.println(grade.toString());
                }
            }
        }
    }
}



