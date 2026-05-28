import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        ArrayList<Department> departments = new ArrayList<>();
        Department.generateDepartments(departments);


        ArrayList<Instructor> instructors = new ArrayList<>();
        Instructor.generateInstructors(departments, instructors);


        ArrayList<Student> students = new ArrayList<>();
        Student.generateStudents(students);

        ArrayList<String> rooms = new ArrayList<>();
        Room.generateRooms(rooms);


        ArrayList<AssignmentType> assignmentTypes = new ArrayList<>();
        AssignmentType.generateAssignmentTypes(assignmentTypes);


        //CourseType gen - start --------------------------------------------------------------------
        CourseType AP = new CourseType("Advanced Placement");
        CourseType regents = new CourseType("Regents");
        CourseType elective = new CourseType("Elective");
        System.out.println(AP.toString() + "\n" + regents.toString() + "\n" + elective.toString());
        //CourseType - end --------------------------------------------------------------------------

/*
        //Course gen -start ---------------------------------------------------
        ArrayList<Course> courses = new ArrayList<>();
        File coursesFile = new File("src/courses.txt");
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
        List<List<CourseOffering>> offeringsByPeriod = new ArrayList<>();
        List<List<Course>> coursesByPeriod = new ArrayList<>();
        for (int i = 0; i < 10; i++) {//makes a new ArrayList for each period
            coursesByPeriod.add(new ArrayList<>());
            offeringsByPeriod.add(new ArrayList<>());
        }
        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < 5; j++) {
                int loopTemp = (int) (Math.random() * 10 + 1);
                coursesByPeriod.get(loopTemp - 1).add(courses.get(i));
            }
        }
        for (int i = 0; i < 10; i++) {
            ArrayList<Instructor> instructorTemp = new ArrayList<>(instructors);
            ArrayList<Room> roomTemp = new ArrayList<>(roomObjects);
            for (int j = 0; j < coursesByPeriod.get(i).size(); j++) {
                int iTempInt = (int) ((Math.random() * instructorTemp.size()));//random instructor
                int rTempInt = (int) ((Math.random() * roomTemp.size()));//random room
                CourseOffering tempOffering = new CourseOffering(instructorTemp.get(iTempInt), coursesByPeriod.get(i).get(j), roomTemp.get(rTempInt), i + 1);
                offeringsByPeriod.get(i).add(tempOffering);
                instructorTemp.remove(iTempInt);//remove instructor from arraylist for this period
                roomTemp.remove(rTempInt);//remove room from arraylist for this period
                System.out.println(tempOffering.toString());
            }
        }
        //-end



        List<List<Roster>> rosterListSortByStudent = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            rosterListSortByStudent.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                int random = (int) (Math.random() * offeringsByPeriod.get(j).size());
                Roster rosterTemp = new Roster(offeringsByPeriod.get(j).get(random), students.get(i));
                System.out.println(rosterTemp.toString());
                rosterListSortByStudent.get(i).add(rosterTemp);
            }
        }


        //Assignment gen - start ------------------------------------------------------


        ArrayList<Assignment> assignments = new ArrayList<>();
        for (int i = 0; i < 10; i++) {//period
            for (int j = 0; j < offeringsByPeriod.get(i).size(); j++) {//size of period
                //make 15 assignments for that offering
                for (int k = 1; k <= 5; k++) {
                    assignments.add(new Assignment(offeringsByPeriod.get(i).get(j).getCourseID(), "Test " + k, assignmentTypes.get(0).getAssignmentTypeID()));
                }
                for (int k = 1; k <= 5; k++) {
                    assignments.add(new Assignment(offeringsByPeriod.get(i).get(j).getCourseID(), "Quiz " + k,assignmentTypes.get(0).getAssignmentTypeID()));
                }
                for (int k = 1; k <= 5; k++) {
                    assignments.add(new Assignment(offeringsByPeriod.get(i).get(j).getCourseID(), "HW " + k,assignmentTypes.get(1).getAssignmentTypeID()));
                }
            }
        }
        for (Assignment a: assignments) {
            System.out.println(a);
        }



        //Assignment gen - end --------------------------------------------------------


        for (int i = 0; i < rosterListSortByStudent.size(); i++) {
            for (int j = 0; j < rosterListSortByStudent.get(i).size(); j++) {
                int temp = rosterListSortByStudent.get(i).get(j).getCourseOfferingID();
                for (int k = (15*(temp-1)); k <= (15*temp)-1; k++) {
                    int gradeRandom = (int) (Math.random() * 25) + 75;
                    Grades grade = new Grades(students.get(i),assignments.get(k),gradeRandom);
                    System.out.println(grade.toString());
                }
            }
        }
        */

    }
}
