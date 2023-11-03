package WeekProjects;

import java.util.Scanner;

public class SimpleCalculator {
    public int add(int a, int b){
       int c=a+b;
        return c;
    }
    public int subtract(int a, int b){
        int c=a-b;
        return c;
    }
    public int multiply(int a, int b){
        int c=a*b;
        return c;
    }
    public int divide(int a, int b){
        int c=a/b;
        return c;
    }

    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        System.out.println("Hello!");
        while (true) {
            System.out.println("What operation would you want to use?");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. /");
            System.out.println("4. *");
            System.out.println("press anything not in the option to quit");
            String operator = new Scanner(System.in).nextLine();
            if (operator.equals("1")) {
                System.out.println("Input the two numbers");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Enter second number!");
                int b = new Scanner(System.in).nextInt();
                int answer = cal.add(a, b);
                System.out.println();
                System.out.println("Your answer is " + answer);
                continue;

            } else if (operator.equals("2")) {
                System.out.println("Input the two numbers");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Enter second number!");
                int b = new Scanner(System.in).nextInt();
                int answer = cal.subtract(a, b);
                System.out.println();
                System.out.println("Your answer is " + answer);
                continue;
            } else if (operator.equals("3")) {
                System.out.println("Input the two numbers");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Enter second number!");
                int b = new Scanner(System.in).nextInt();
                float answer = cal.divide(a, b);
                System.out.println();
                System.out.println("Your answer is " + answer);
                continue;
            } else if (operator.equals("4")) {
                System.out.println("Input the two numbers");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Enter second number!");
                int b = new Scanner(System.in).nextInt();
                int answer = cal.multiply(a, b);
                System.out.println();
                System.out.println("Your answer is " + answer);
                continue;
            } else {
                System.out.println("Invalid option!");
                break;
            }
        }
    }

}
