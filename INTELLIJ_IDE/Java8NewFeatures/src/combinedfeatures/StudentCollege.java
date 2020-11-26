package combinedfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class StudentCollege implements ImplementStudentCollege {

    protected static ArrayList<StudentCollege> studentCollegeList = new ArrayList<>();
    protected int sid;
    protected String name;
    protected String collegeName;
    protected int age;
    protected long rollNo;
    protected double fees;

    /**
     * get field
     *
     * @return sid
     */
    public int getSid() {
        return this.sid;
    }

    /**
     * set field
     *
     * @param sid
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return collegeName
     */
    public String getCollegename() {
        return this.collegeName;
    }

    /**
     * set field
     *
     * @param collegeName
     */
    public void setCollegename(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * get field
     *
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * set field
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get field
     *
     * @return rollNo
     */
    public long getRollno() {
        return this.rollNo;
    }

    /**
     * set field
     *
     * @param rollNo
     */
    public void setRollno(long rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * get field
     *
     * @return fees
     */
    public double getFees() {
        return this.fees;
    }

    /**
     * set field
     *
     * @param fees
     */
    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public void addStudentRecordInCollege(StudentCollege stud) {
        studentCollegeList.add(stud);
    }

    @Override
    public void deleteStudentRecordInCollege(int sid) {
        studentCollegeList.remove(sid);
    }

    @Override
    public void getStudentRecordInCollegeBySid(int sid) {
        StudentCollege.studentCollegeList
                .stream()
                .filter(sc -> sc.getSid() == sid)
                .map(m -> m.getName() + ", " + m.getCollegename() + ", " + m.getAge() + ", " + m.getRollno() + ", " + m.getFees())
                .forEach(x -> System.out.println(x));
    }

    @Override
    public void getAllStudentsRecordInCollege() {
        StudentCollege.studentCollegeList.forEach(s -> System.out.println(s));
    }

    @Override
    public void getAllStudentsRecordInDescendingOrderInCollege() {
        StudentCollege.studentCollegeList.stream()
                .sorted(
                        (StudentCollege sc1, StudentCollege sc2) -> {
                            return sc2.getSid() - sc1.getSid();
                        }
                ).forEach(System.out::println);
    }

    @Override
    public void getTotalNumberOfStudentsInCollege() {
        Long total = StudentCollege.studentCollegeList.stream()
                .collect(Collectors.counting());
        System.out.println("total number of students is => " + total);
    }

    @Override
    public void getAverageStudentFeesInCollege() {
        Double feesAverage = StudentCollege.studentCollegeList.stream()
                .collect(Collectors.averagingDouble(a -> a.getFees()));
        System.out.println("average student college fees is => " + feesAverage);
    }

    @Override
    public void getComparisionAndSortOfAllStudentsRecordsInCollegeByName() {
        Collections.sort(StudentCollege.studentCollegeList, (StudentCollege name1, StudentCollege name2) -> {
            return name1.getName().compareTo(name2.getName());
        });
        StudentCollege.studentCollegeList.forEach(System.out::println);
    }

    @Override
    public void getComparisionAndSortOfAllStudentsRecordsInCollegeByAge() {
        StudentCollege.studentCollegeList.stream()
                .sorted(
                        (StudentCollege age1, StudentCollege age2) -> {
                            return age1.getAge() - age2.getAge();
                        }
                ).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "StudentCollege{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", fees=" + fees +
                '}';
    }

}
