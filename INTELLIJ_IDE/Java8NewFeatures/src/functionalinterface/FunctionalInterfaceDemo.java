package functionalinterface;

import java.util.Scanner;

@FunctionalInterface
interface Plus {

    public int addition(int num1, int num2);
}

@FunctionalInterface
interface Minus {

    public int subtraction(int num1, int num2);
}

@FunctionalInterface
interface Divide {

    public int division(int num1, int num2);
}

@FunctionalInterface
interface Multiply {

    public int multiplication(int num1, int num2);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("");

            System.out.print("enter your choice => ");
            int choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {

                case 1:
                    System.out.println("enter 1st number for addition => ");
                    int a = scanner.nextInt();

                    System.out.println("enter 2nd number for addition => ");
                    int b = scanner.nextInt();

                    Plus addy = (int num1, int num2) -> {

                        return num1 + num2;
                    };
                    System.out.println("addition of 2 number => " + addy.addition(a, b));
                    break;

                case 2:
                    System.out.println("enter 1st number for subtraction => ");
                    int c = scanner.nextInt();

                    System.out.println("enter 2nd number for subtraction => ");
                    int d = scanner.nextInt();

                    Minus suby = (num1, num2) -> {

                        return num1 - num2;
                    };
                    System.out.println("subtraction of 2 number => " + suby.subtraction(c, d));
                    break;

                case 3:
                    System.out.println("enter 1st number for division => ");
                    int e = scanner.nextInt();

                    System.out.println("enter 2nd number for division => ");
                    int f = scanner.nextInt();

                    Divide divy = (int num1, int num2) -> (num1 / num2);

                    System.out.println("division of 2 number => " + divy.division(e, f));
                    break;

                case 4:
                    System.out.println("enter 1st number for multiplication => ");
                    int g = scanner.nextInt();

                    System.out.println("enter 2nd number for multiplication => ");
                    int h = scanner.nextInt();

                    Multiply multi = (num1, num2) -> (num1 * num2);

                    System.out.println("multiplication of 2 number => " + multi.multiplication(g, h));
                    break;

                default:
                    System.out.println("good bye.........");
                    return;
            }
        }

    }

}
