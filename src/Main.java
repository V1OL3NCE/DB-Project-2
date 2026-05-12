import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //departments gen - start ----------------------------------------------
        ArrayList<Department> departments = new ArrayList<>();
        File departmentNamesFile = new File("src/departmentNames.txt");
        try {
            Scanner departmentFileScan = new Scanner(departmentNamesFile);
            while (departmentFileScan.hasNext()) {
                String departmentName = departmentFileScan.nextLine();
                Department tempDepartment = new Department(departmentName);
                departments.add(tempDepartment);
                System.out.println(tempDepartment.toString());
            }
            departmentFileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        //departments gen - end ------------------------------------------------


        //Instructors - start -------------------------------------------------------------------------------------------
        ArrayList<Instructor> instructors = new ArrayList<>();
        File instructorNamesFile = new File("src/instructor.txt");
        try {
            Scanner instructorFileScan = new Scanner(instructorNamesFile);
            while (instructorFileScan.hasNext()){
                String instructorName = instructorFileScan.nextLine();
                Instructor tempInstructor = new Instructor(instructorName, departments.get((int) (Math.random() * 10) )); // random is to assign a random department to the instructor
                instructors.add(tempInstructor);
                System.out.println(tempInstructor.toString());
            }
            instructorFileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        //Instructors - end ---------------------------------------------------------------------------------------------


        //Students - start ---------------------------------------------
        ArrayList<Student> students = new ArrayList<>();
        File studentNamesFile = new File("src/students.txt");
        try {
            Scanner studentFileScan = new Scanner(studentNamesFile);
            while (studentFileScan.hasNext()) {
                String studentName = studentFileScan.nextLine();
                Student tempStudent = new Student(studentName);
                students.add(tempStudent);
                System.out.println(tempStudent.toString());
            }
            studentFileScan.close();
        }catch (FileNotFoundException e) {
            System.out.println("error reading file: " + e.getMessage());
        }
        //Students - end -----------------------------------------------


        //Room gen - start ---------------------------------------------------------------------------------------------
        ArrayList<String> roomNames = new ArrayList<>();
        String floor = "";
        String side = "";
        for (int f = 0; f < 9; f++) {
            if (f == 0) {
                floor = "B";
            } else {
                floor = f + "";
            }
            for (int s = 1; s < 5; s++) {
                switch (s) {
                    case 1:
                        side = "N";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            roomNames.add(rooms);
                        }
                        break;
                    case 2:
                        side = "E";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            roomNames.add(rooms);
                        }
                        break;
                    case 3:
                        side = "S";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            roomNames.add(rooms);
                        }
                        break;
                    case 4:
                        side = "W";
                        for (int n = 1; n < 21; n++) {
                            String rooms = "";
                            rooms = floor + side + n;
                            roomNames.add(rooms);
                        }
                        break;
                }
            }
        }
        ArrayList<Room> roomObjects = new ArrayList<>();
        for (int i = 0; i < roomNames.size(); i++) {
            Room tmp = new Room(roomNames.get(i));
            roomObjects.add(tmp);
            System.out.println(tmp.toString());
        }
        //Room gen - end -----------------------------------------------------------------------------------------------



        //AssignmentType gen - start ---------------------------------
        ArrayList<AssignmentType> assignmentTypes = new ArrayList<>();
        assignmentTypes.add(new AssignmentType("Major"));
        assignmentTypes.add(new AssignmentType("Minor"));
        for (AssignmentType assignmentType : assignmentTypes) {
            System.out.println(assignmentType);
        }
        //AssignmentType gen - end -----------------------------------






        //CourseType gen - start --------------------------------------------------------------------
        CourseType AP = new CourseType("Advanced Placement");
        CourseType regents = new CourseType("Regents");
        CourseType elective = new CourseType("Elective");
        System.out.println(AP.toString() + "\n" + regents.toString() + "\n" + elective.toString());
        //CourseType - end --------------------------------------------------------------------------

        //Course gen -start ---------------------------------------------------
        ArrayList<Course> courses = new ArrayList<>();
        File coursesFile = new File("src/course.txt");
        try {
            Scanner fileScan = new Scanner(coursesFile);
            while (fileScan.hasNext()) {
                String courseName = fileScan.nextLine();
                if (courseName.equals("REGENTS")) break;
                Course tempCourse = new Course(courseName, AP);
                courses.add(tempCourse);
                System.out.println(tempCourse.toString());
            }
            while (fileScan.hasNext()) {
                String courseName = fileScan.nextLine();
                if (courseName.equals("ELECTIVES")) break;
                Course tempCourse = new Course(courseName, regents);
                courses.add(tempCourse);
                System.out.println(tempCourse.toString());
            }
            while (fileScan.hasNext()) {
                String courseName = fileScan.nextLine();
                Course tempCourse = new Course(courseName, elective);
                courses.add(tempCourse);
                System.out.println(tempCourse.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        //Course gen - end --------------------------------------------------

        //CourseOffering gen -start
        ArrayList<CourseOffering> courseOfferings = new ArrayList<>();
        List<List<Course>> coursesSortByPeriod = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            coursesSortByPeriod.add(new ArrayList<>());
        }

        // Fills up the coursesSortByPeriod ArrayList with random courses
        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < 5; j++) {
                int loopTemp = (int) (Math.random() * 10 + 1);
                coursesSortByPeriod.get(loopTemp - 1).add(courses.get(i));
            }
        }
        for (int i = 0; i < 10; i++) {
            ArrayList<Instructor> instructorTemp = new ArrayList<>(instructors);
            ArrayList<Room> roomTemp = new ArrayList<>(roomObjects);
            for (int j = 0; j < coursesSortByPeriod.get(i).size(); j++) {
                int instructorTempInt = (int) ((Math.random() * instructorTemp.size())); // gets the ID of a random instructor
                int roomTempInt = (int) ((Math.random() * roomTemp.size())); // gets the ID of a random room
                CourseOffering tempCourseOffering = new CourseOffering(instructorTemp.get(instructorTempInt), coursesSortByPeriod.get(i).get(j), roomTemp.get(roomTempInt), i + 1);
                courseOfferings.add(tempCourseOffering);
                instructorTemp.remove(instructorTempInt);
                roomTemp.remove(roomTempInt);
            }
        }
        for (int i = 0; i < courseOfferings.size(); i++) {
            System.out.println(courseOfferings.get(i).toString());
        }
        //-end

    }
}
