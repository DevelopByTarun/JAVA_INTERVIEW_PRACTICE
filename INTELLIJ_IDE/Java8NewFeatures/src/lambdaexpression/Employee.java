package lambdaexpression;

import java.util.LinkedHashSet;

public class Employee {

    public LinkedHashSet<Employee> employeesList = new LinkedHashSet<Employee>();
    private int id;
    private String name;
    private int age;
    private String city;
    private float salary;

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
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * set field
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * get field
     *
     * @return salary
     */
    public float getSalary() {
        return this.salary;
    }

    /**
     * set field
     *
     * @param salary
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void addEmployee(Employee employee) {
        this.employeesList.add(employee);
    }

    public void getAllEmployees() {
        LinkedHashSet<Employee> totalEmployees = this.employeesList;
        totalEmployees.stream().forEach(System.out::println);
    }

    public void getEmployeeById(int id) {
        LinkedHashSet<Employee> getEmployee = this.employeesList;
        getEmployee.stream()
                .filter(f -> f.id == id)
                .map(m -> "name= " + m.name + ", age= " + m.age + ", city= " + m.city + ", salary= " + m.salary)
                .forEach(System.out::println);
    }

    public void getFilterEmployeesByAge() {
        LinkedHashSet<Employee> filterByAge = this.employeesList;
        filterByAge.stream()
                .filter(f -> f.age >= 20 && f.age <= 30)
                .forEach(System.out::println);
    }

    public void getFilterEmployeesBySalary() {
        LinkedHashSet<Employee> filterBySalary = this.employeesList;
        filterBySalary.stream()
                .filter(f -> f.salary >= 5000.45 && f.age <= 8000.51)
                .forEach(System.out::println);
    }

    public void getAllEmployeesSortInDescendingOrder() {
        LinkedHashSet<Employee> listByAge = this.employeesList;
        listByAge.stream()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }

}
