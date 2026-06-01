import java.util.ArrayList;
import java.util.List;


public class Grade {
    private int studentID;
    private int assignmentID;
    private int grade;


    public Grade(Student student, Assignment assignment, int grade){
        studentID = student.getStudentID();
        assignmentID = assignment.getAssignmentID();
        this.grade = grade;
    }


    @Override
    public String toString(){
        return "INSERT INTO Grade (Assignment_ID, student_ID , Grade) VALUES ( " + assignmentID + ", " + studentID + ", " + grade + ");";
    }


    public static void generateGrades(ArrayList<Student> students, ArrayList<Assignment> assignments, List<List<Roster>> rosterListSortByStudent){
        for (int i = 0; i < rosterListSortByStudent.size(); i++) {
            for (int j = 0; j < rosterListSortByStudent.get(i).size(); j++) {
                int temp = rosterListSortByStudent.get(i).get(j).getCourseOfferingID();
                for (int k = (15*(temp-1)); k <= (15*temp)-1; k++) {
                    int gradeRandom = (int) (Math.random() * 25) + 75;
                    Grade grade = new Grade(students.get(i),assignments.get(k),gradeRandom);
                    System.out.println(grade.toString());
                }
            }
        }
    }
}



