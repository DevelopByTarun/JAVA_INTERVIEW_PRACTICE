package lambdaexpression;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EmployeeLambdaWithComparatorAndFilter {

    public static LinkedHashSet<Employee> addData_1;
    public static LinkedHashSet<Employee> addData_2;
    public Employee defaultRecord_1;
    public Employee defaultRecord_2;
    public Employee defaultRecord_3;
    public Employee defaultRecord_4;

    public EmployeeLambdaWithComparatorAndFilter() {

        // initialize data
        this.defaultRecord_1 = new Employee();
        this.defaultRecord_1.setId(1001);
        this.defaultRecord_1.setName("kim");
        this.defaultRecord_1.setAge(25);
        this.defaultRecord_1.setCity("delhi");
        this.defaultRecord_1.setSalary(5578.21f);

        this.defaultRecord_2 = new Employee();
        this.defaultRecord_2.setId(1002);
        this.defaultRecord_2.setName("ram");
        this.defaultRecord_2.setAge(32);
        this.defaultRecord_2.setCity("noida");
        this.defaultRecord_2.setSalary(9462.78f);

        this.defaultRecord_3 = new Employee();
        this.defaultRecord_3.setId(1003);
        this.defaultRecord_3.setName("tim");
        this.defaultRecord_3.setAge(19);
        this.defaultRecord_3.setCity("indore");
        this.defaultRecord_3.setSalary(4916.88f);

        this.defaultRecord_4 = new Employee();
        this.defaultRecord_4.setId(1004);
        this.defaultRecord_4.setName("shyam");
        this.defaultRecord_4.setAge(30);
        this.defaultRecord_4.setCity("gurgaon");
        this.defaultRecord_4.setSalary(7771.99f);

        // 1st set
        addData_1 = new LinkedHashSet<Employee>();
        addData_1.add(this.defaultRecord_1);
        addData_1.add(this.defaultRecord_2);

        // 2nd set
        addData_2 = new LinkedHashSet<Employee>();
        addData_2.add(this.defaultRecord_3);
        addData_2.add(this.defaultRecord_4);
    }

    public static void main(String[] args) {

        // calling constructor to initialize set and employee objects
        new EmployeeLambdaWithComparatorAndFilter();

        Employee employeeObject = new Employee();
        // add 2 sets in 1 set
        employeeObject.employeesList.addAll(addData_1);
        employeeObject.employeesList.addAll(addData_2);

        // take input
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("");
            System.out.println("1. addEmployee()");
            System.out.println("2. getAllEmployees()");
            System.out.println("3. getEmployeeById()");
            System.out.println("4. getFilterEmployeesByAge()");
            System.out.println("5. getFilterEmployeesBySalary()");
            System.out.println("6. getAllEmployeesSortInDescendingOrder()");
            System.out.println("press any key for exit");
            System.out.println("");

            System.out.println("enter your choice => ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("enter employee id => ");
                    int id = scanner.nextInt();

                    System.out.println("enter employee name => ");
                    String name = scanner.next();

                    System.out.println("enter employee age => ");
                    int age = scanner.nextInt();

                    System.out.println("enter employee city => ");
                    String city = scanner.next();

                    System.out.println("enter employee salary => ");
                    float salary = scanner.nextFloat();

                    employeeObject.setId(id);
                    employeeObject.setName(name);
                    employeeObject.setAge(age);
                    employeeObject.setCity(city);
                    employeeObject.setSalary(salary);

                    employeeObject.addEmployee(employeeObject);
                    if (employeeObject != null) {
                        System.out.println("employee added successfully");
                    } else {
                        System.out.println("unable to add employee");
                    }
                    break;

                case 2:
                    if (employeeObject != null) {
                        employeeObject.getAllEmployees();
                    } else {
                        System.out.println("list is blank");
                    }
                    break;

                case 3:
                    System.out.println("enter employee id => ");
                    int getEmployee = scanner.nextInt();

                    if (employeeObject != null) {
                        employeeObject.getEmployeeById(getEmployee);
                    } else {
                        System.out.println("unable to find employee");
                    }
                    break;

                case 4:
                    if (employeeObject != null) {
                        employeeObject.getFilterEmployeesByAge();
                    } else {
                        System.out.println("unable to find employee by age");
                    }
                    break;

                case 5:
                    if (employeeObject != null) {
                        employeeObject.getFilterEmployeesBySalary();
                    } else {
                        System.out.println("unable to find employee by salary");
                    }
                    break;

                case 6:
                    if (employeeObject != null) {
                        employeeObject.getAllEmployeesSortInDescendingOrder();
                    } else {
                        System.out.println("no list");
                    }
                    break;

                default:
                    System.out.println("good byee");
                    System.exit(0);
                    return;
            }

        }

    }
}
    