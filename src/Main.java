import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        System.out.println("CREATE TABLE Department (\n" +
                "    DepartmentID int PRIMARY KEY,\n" +
                "    DepartmentName varchar(255)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Room (\n" +
                "    RoomID int PRIMARY KEY,\n" +
                "    RoomName varchar(255)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Student (\n" +
                "    StudentID int PRIMARY KEY,\n" +
                "    Name varchar(255)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE AssignmentType (\n" +
                "    AssignmentTypeID int PRIMARY KEY,\n" +
                "    AssignmentTypeName varchar(255)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE CourseType (\n" +
                "    CourseTypeID int PRIMARY KEY,\n" +
                "    CourseTypeName varchar(255)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Instructor (\n" +
                "    InstructorID int PRIMARY KEY,\n" +
                "    DepartmentID int,\n" +
                "    Name varchar(255),\n" +
                "    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Course (\n" +
                "    CourseID int PRIMARY KEY,\n" +
                "    CourseTypeID int,\n" +
                "    CourseName varchar(255),\n" +
                "    FOREIGN KEY (CourseTypeID) REFERENCES CourseType(CourseTypeID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE CourseOffering (\n" +
                "    OfferingID int PRIMARY KEY,\n" +
                "    InstructorID int,\n" +
                "    CourseID int,\n" +
                "    RoomID int,\n" +
                "    Period int,\n" +
                "    FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID),\n" +
                "    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),\n" +
                "    FOREIGN KEY (RoomID) REFERENCES Room(RoomID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Assignment (\n" +
                "    AssignmentID int PRIMARY KEY,\n" +
                "    OfferingID int,\n" +
                "    AssignmentName varchar(255),\n" +
                "    AssignmentTypeID int,\n" +
                "    FOREIGN KEY (OfferingID) REFERENCES CourseOffering(OfferingID),\n" +
                "    FOREIGN KEY (AssignmentTypeID) REFERENCES AssignmentType(AssignmentTypeID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Grade (\n" +
                "    Grade int,\n" +
                "    AssignmentID int,\n" +
                "    StudentID int,\n" +
                "    FOREIGN KEY (AssignmentID) REFERENCES Assignment(AssignmentID),\n" +
                "    FOREIGN KEY (StudentID) REFERENCES Student(StudentID)\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE Roster (\n" +
                "    StudentID int,\n" +
                "    OfferingID int,\n" +
                "    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),\n" +
                "    FOREIGN KEY (OfferingID) REFERENCES CourseOffering(OfferingID)\n" +
                ");\n" +
                "\n" +
                "\n"
        );

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



