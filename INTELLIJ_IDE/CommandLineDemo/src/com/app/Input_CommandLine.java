package com.app;

public class Input_CommandLine {
    
    public static void main(String[] args) {

        String id = args[0];
        String name = args[1];
        String age = args[2];
        String city = args[3];
        String pincode = args[4];

        System.out.println("id is => " + id);
        System.out.println("name is => " + name);
        System.out.println("age is => " + age);
        System.out.println("city is => " + city);
        System.out.println("pincode is => " + pincode);

    }
}
