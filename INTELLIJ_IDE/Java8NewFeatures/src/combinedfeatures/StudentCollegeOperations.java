package combinedfeatures;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCollegeOperations {

    private static ArrayList<StudentCollege> previousRecord;
    private StudentCollege sc_1;
    private StudentCollege sc_2;
    private StudentCollege sc_3;
    private StudentCollege sc_4;
    private StudentCollege sc_5;
    private StudentCollege sc_6;

    public StudentCollegeOperations() {
        // add data in objects
        this.sc_1 = new StudentCollege();
        sc_1.setSid(1);
        sc_1.setName(IStudentCollegeConstants.STUDENT_NAME_1);
        sc_1.setAge(IStudentCollegeConstants.STUDENT_AGE_1);
        sc_1.setCollegename(IStudentCollegeConstants.STUDENT_COLLEGE_NAME_1);
        sc_1.setFees(IStudentCollegeConstants.STUDENT_FEES_1);
        sc_1.setRollno(IStudentCollegeConstants.STUDENT_ROLL_NO_1);

        this.sc_2 = new StudentCollege();
        sc_2.setSid(2);
        sc_2.setName(IStudentCollegeConstants.STUDENT_NAME_2);
        sc_2.setAge(IStudentCollegeConstants.STUDENT_AGE_2);
        sc_2.setCollegename(IStudentCollegeConstants.STUDENT_COLLEGE_NAME_2);
        sc_2.setFees(IStudentCollegeConstants.STUDENT_FEES_2);
        sc_2.setRollno(IStudentCollegeConstants.STUDENT_ROLL_NO_2);

        this.sc_3 = new StudentCollege();
        sc_3.setSid(3);
        sc_3.setName(IStudentCollegeConstants.STUDENT_NAME_3);
        sc_3.setAge(IStudentCollegeConstants.STUDENT_AGE_3);
        sc_3.setCollegename(IStudentCollegeConstants.STUDENT_COLLEGE_NAME_3);
        sc_3.setFees(IStudentCollegeConstants.STUDENT_FEES_3);
        sc_3.setRollno(IStudentCollegeConstants.STUDENT_ROLL_NO_3);

        this.sc_4 = new StudentCollege();
        sc_4.setSid(4);
        sc_4.setName(IStudentCollegeConstants.STUDENT_NAME_4);
        sc_4.setAge(IStudentCollegeConstants.STUDENT_AGE_4);
        sc_4.setCollegename(IStudentCollegeConstants.STUDENT_COLLEGE_NAME_4);
        sc_4.setFees(IStudentCollegeConstants.STUDENT_FEES_4);
        sc_4.setRollno(IStudentCollegeConstants.STUDENT_ROLL_NO_4);

        this.sc_5 = new StudentCollege();
        sc_5.setSid(5);
        sc_5.setName(IStudentCollegeConstants.STUDENT_NAME_5);
        sc_5.setAge(IStudentCollegeConstants.STUDENT_AGE_5);
        sc_5.setCollegename(IStudentCollegeConstants.STUDENT_COLLEGE_NAME_5);
        sc_5.setFees(IStudentCollegeConstants.STUDENT_FEES_5);
        sc_5.setRollno(IStudentCollegeConstants.STUDENT_ROLL_NO_5);

        this.sc_6 = new StudentCollege();
        sc_6.setSid(6);
        sc_6.setName(IStudentCollegeConstants.STUDENT_NAME_6);
        sc_6.setAge(IStudentCollegeConstants.STUDENT_AGE_6);
        sc_6.setCollegename(IStudentCollegeConstants.STUDENT_COLLEGE_NAME_6);
        sc_6.setFees(IStudentCollegeConstants.STUDENT_FEES_6);
        sc_6.setRollno(IStudentCollegeConstants.STUDENT_ROLL_NO_6);

        // add objects in list
        previousRecord = new ArrayList<StudentCollege>();
        previousRecord.add(this.sc_1);
        previousRecord.add(this.sc_2);
        previousRecord.add(this.sc_3);
        previousRecord.add(this.sc_4);
        previousRecord.add(this.sc_5);
        previousRecord.add(this.sc_6);
    }

    public static void main(String[] args) throws Exception {
        // create anonymous object
        new StudentCollegeOperations();

        // add current list into previous list
        StudentCollege.studentCollegeList.addAll(previousRecord);

        // take input
        Scanner scanner = new Scanner(System.in);
        StudentCollege studentCollegeObj = new StudentCollege();
        /*
          create menu
         */
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("1. add student");
            System.out.println("2. show all students");
            System.out.println("3. delete student");
            System.out.println("4. show student through id");
            System.out.println("5. show all student in descending order");
            System.out.println("6. show sorted student by college name");
            System.out.println("7. show sorted student by age");
            System.out.println("8. total number of students in college");
            System.out.println("9. average college fees of a student");
            System.out.println("default. press any key for exit");
            System.out.println();
            System.out.println("enter your choice => ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("enter student id => ");
                    int sid = scanner.nextInt();

                    System.out.println("enter student name => ");
                    String name = scanner.next();

                    System.out.println("enter student college name => ");
                    String collegeName = scanner.next();

                    System.out.println("enter student age => ");
                    int age = scanner.nextInt();

                    System.out.println("enter student rollno => ");
                    long rollNo = scanner.nextLong();

                    System.out.println("enter student fees => ");
                    double fees = scanner.nextDouble();

                    studentCollegeObj.setSid(sid);
                    studentCollegeObj.setName(name);
                    studentCollegeObj.setCollegename(collegeName);
                    studentCollegeObj.setAge(age);
                    studentCollegeObj.setRollno(rollNo);
                    studentCollegeObj.setFees(fees);

                    if (studentCollegeObj != null) {
                        studentCollegeObj.addStudentRecordInCollege(studentCollegeObj);
                        System.out.println("successfully add student in college");
                    } else {
                        System.out.println("unable to add student in college");
                    }
                    break;

                case 2:
                    if (studentCollegeObj != null) {
                        studentCollegeObj.getAllStudentsRecordInCollege();
                    } else {
                        System.out.println("unable to find students in college");
                    }
                    break;

                case 3:
                    System.out.println("enter student id want to delete => ");
                    int deleteId = scanner.nextInt();

                    if (studentCollegeObj != null) {
                        studentCollegeObj.deleteStudentRecordInCollege(deleteId);
                        System.out.println("successfully delete student in college");
                    } else {
                        System.out.println("unable to delete student in college");
                    }
                    break;

                case 4:
                    System.out.println("enter student id want to see record => ");
                    int studentId = scanner.nextInt();

                    if (studentCollegeObj != null) {
                        studentCollegeObj.getStudentRecordInCollegeBySid(studentId);
                    } else {
                        System.out.println("unable to find student in college");
                    }
                    break;

                case 5:
                    if (studentCollegeObj != null) {
                        studentCollegeObj.getAllStudentsRecordInDescendingOrderInCollege();
                    } else {
                        System.out.println("unable to find students in college as descending order");
                    }
                    break;

                case 6:
                    if (studentCollegeObj != null) {
                        studentCollegeObj.getComparisionAndSortOfAllStudentsRecordsInCollegeByName();
                    } else {
                        System.out.println("unable to find sorted students in college by name");
                    }
                    break;

                case 7:
                    if (studentCollegeObj != null) {
                        studentCollegeObj.getComparisionAndSortOfAllStudentsRecordsInCollegeByAge();
                    } else {
                        System.out.println("unable to find sorted students in college by age");
                    }
                    break;

                case 8:
                    if (studentCollegeObj != null) {
                        studentCollegeObj.getTotalNumberOfStudentsInCollege();
                    } else {
                        System.out.println("unable to calculate total number students in college");
                    }
                    break;

                case 9:
                    if (studentCollegeObj != null) {
                        studentCollegeObj.getAverageStudentFeesInCollege();
                    } else {
                        System.out.println("unable to calculated average fees of a student in college");
                    }
                    break;

                default:
                    System.out.println("good byee");
                    return;
            }
        }
    }
    
}
