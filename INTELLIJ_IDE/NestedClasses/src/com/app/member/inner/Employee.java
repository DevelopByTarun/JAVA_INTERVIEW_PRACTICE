package com.app.member.inner;

import java.util.Scanner;
import java.util.UUID;

public class Employee {

    private String id;
    private String name;
    private int age;

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Employee firstEmployee = new Employee(UUID.randomUUID().toString(), "kim", 30);
         /*
        1st way inner class object
         */
        Employee.Address firstEmployeeAddress = firstEmployee.new Address("delhi", "rohini", "india", 110089);

        Employee secondEmployee = new Employee(UUID.randomUUID().toString(), "ram", 18);
         /*
        2nd way inner class object
         */
        Address secondEmployeeAddress = secondEmployee.new Address("death valley", "new york", "usa", 950022);

        // take input
        Scanner scanner = new Scanner(System.in);

        System.out.print(" enter employee number => ");
        int employeeNumber = scanner.nextInt();

        switch (employeeNumber) {

            case 1:
                System.out.println("Details of first employee => ");
                firstEmployeeAddress.getEmployeeDetails();
                break;

            case 2:
                System.out.println("Details of second employee => ");
                secondEmployeeAddress.getEmployeeDetails();
                break;

            default:
                System.out.println("something wrong");
                break;
        }

        scanner.close();
    }

    private class Address {

        private String city;
        private String state;
        private String country;
        private int zipcode;

        private Address(String city, String state, String country, int zipcode) {

            this.city = city;
            this.state = state;
            this.country = country;
            this.zipcode = zipcode;
        }

        private void getEmployeeDetails() {

            System.out.println(" Employee id is => " + id);     // outer class variable
            System.out.println(" Employee name is => " + Employee.this.name);  // outer class variable
            System.out.println(" Employee age is => " + Employee.this.age);     // outer class variable
            System.out.println(" Employee city is => " + city);
            System.out.println(" Employee state is => " + state);
            System.out.println(" Employee country is => " + country);
            System.out.println(" Employee zipcode is => " + zipcode);
        }

    }

}
