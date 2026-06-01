import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        ArrayList<Room> roomObjects = new ArrayList<>();
        Room.generateRooms(roomObjects);


        ArrayList<Department> departments = new ArrayList<>();
        Department.generateDepartments(departments);


        ArrayList<Instructor> instructors = new ArrayList<>();
        Instructor.generateInstructors(departments,instructors);


        ArrayList<CourseType> courseTypes = new ArrayList<>();
        CourseType.generateCourseTypes(courseTypes);


        ArrayList<Course> courses = new ArrayList<>();
        Course.generateCourses(courses,courseTypes);


        List<List<CourseOffering>> courseOfferingsSortByPeriod = new ArrayList<>();
        CourseOffering.generateCourseOffering(courseOfferingsSortByPeriod,instructors,courses,roomObjects);


        ArrayList<Student> students = new ArrayList<>();
        Student.generateStudents(students);


        List<List<Roster>> rosterListSortByStudent = new ArrayList<>();
        Roster.generateRoster(students,rosterListSortByStudent,courseOfferingsSortByPeriod);

        ArrayList<AssignmentType> assignmentTypes = new ArrayList<>();
        AssignmentType.generateAssignmentType(assignmentTypes);


        ArrayList<Assignment> assignments = new ArrayList<>();
        Assignment.generateAssignments(assignments,courseOfferingsSortByPeriod,assignmentTypes);


        Grade.generateGrades(students,assignments,rosterListSortByStudent);


    }
}



