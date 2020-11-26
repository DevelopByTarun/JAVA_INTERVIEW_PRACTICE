package functionalinterface;

import java.util.HashSet;
import java.util.Set;

interface IStudent {

    // create default method
    default void addStudent(Student student) {
        Student.studentsSet.add(student);
    }
}

@FunctionalInterface
interface TestingFunctional {

    public void getAllStudents();

    @Override
    public String toString();
}

public class Student implements IStudent {

    public static Set<Student> studentsSet = new HashSet<>();
    private int id;
    private String name;

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Student one = new Student();
        one.setId(1001);
        one.setName("tarun");
        one.addStudent(one);

        Student two = new Student();
        two.setId(1002);
        two.setName("amit");
        two.addStudent(two);

        Student three = new Student();
        three.setId(1003);
        three.setName("ram");
        three.addStudent(three);

        Student four = new Student();
        four.setId(1004);
        four.setName("shyam");
        four.addStudent(four);

        // ascending order
        TestingFunctional ascending = () -> {
            Student.studentsSet.stream().sorted(
                    (Student s1, Student s2) -> {
                        return s1.getName().compareTo(s2.getName());
                    }
            ).forEach(System.out::println);
        };
        // call method
        ascending.getAllStudents();

        System.out.println();

        // descending order
        TestingFunctional descending = () -> {
            Student.studentsSet.stream().sorted(
                    (Student s1, Student s2) -> {
                        return s2.getName().compareTo(s1.getName());
                    }
            ).forEach(System.out::println);
        };
        // call method
        descending.getAllStudents();
    }

}
