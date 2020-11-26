package lambdaexpression;

import java.util.ArrayList;
import java.util.stream.Collectors;

@FunctionalInterface
interface EmployeeDetails {

    public String doUpperAndConcat(String str1, String str2) throws Exception;

    public static void doSumOfId(ArrayList<Emp> sumEmployeeList) throws Exception {
//        IntStream sum = sumEmployeeList.stream().mapToInt(Emp::getId);
        int sum = sumEmployeeList.stream().collect(Collectors.summingInt(Emp::getId));
        System.out.println("sum of employees id => " + sum);
    }

    public default void doCountId(ArrayList<Emp> countEmployeeList) throws Exception {
        int totalEmployees = Math.toIntExact(countEmployeeList.stream().count());
        System.out.println("total number of employees => " + totalEmployees);
    }
}

class Emp {

    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static final String doStringStuff(EmployeeDetails ed, String s1, String s2) throws Exception {
        return ed.doUpperAndConcat(s1, s2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class InterfaceWithLambdaExpressions {

    public static void main(String[] args) throws Exception {

        ArrayList<Emp> employeeList = new ArrayList<Emp>();
        employeeList.add(new Emp(1001, "kim"));
        employeeList.add(new Emp(2002, "neha"));
        employeeList.add(new Emp(3003, "julie"));
        employeeList.add(new Emp(4004, "amit"));
        employeeList.add(new Emp(5005, "neha"));
        employeeList.add(new Emp(6006, "ram"));

        // print list
        employeeList.forEach(emp -> System.out.println(emp.toString()));
        System.out.println();

        // interface with lambda
        EmployeeDetails employeeDetails = (str1, str2) -> {
            return str1.toUpperCase().concat(str2.toUpperCase());
        };

        // call emp method
        String getStuff = Emp.doStringStuff(
                employeeDetails,
                employeeList.get(0).getName(),
                employeeList.get(1).getName()
        );
        System.out.println("result of upper and concat => " + getStuff);

        employeeDetails.doCountId(employeeList);

        EmployeeDetails.doSumOfId(employeeList);

        System.exit(0);
        System.gc();
    }

}
