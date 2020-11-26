package com.app.local.inner;

import java.util.Scanner;

public class OuterStudent {

    private int id;
    private String name;

    public OuterStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void getStudentDetails() {

        class LocalInnerStudentResult {

            public void getResult() {

                System.out.println("student id is => " + OuterStudent.this.id);
                System.out.println("student name is => " + OuterStudent.this.name);
            }
        }
        LocalInnerStudentResult obj = new LocalInnerStudentResult();
        obj.getResult();
    }

    public static void main(String[] args) {
        /*
          take input
         */
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("1. insert id and name");
            System.out.println("2. exit");

            System.out.println("enter your choice => ");
            int choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("enter student id => ");
                    int id = scan.nextInt();

                    System.out.println("enter student name => ");
                    String name = scan.next();

                    OuterStudent studentObject = new OuterStudent(id, name);
                    studentObject.getStudentDetails();
                    break;

                case 2:
                    System.out.println("good bye");
                    return;

                default:
                    System.out.println("something wrong!!");
                    break;
            }

        }

    }
}
