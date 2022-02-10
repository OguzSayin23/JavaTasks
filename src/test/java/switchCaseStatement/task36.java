package test.java.switchCaseStatement;

import java.util.Scanner;

public class task36 {
    /*
    Write a program that creates a calculator by using switch statements
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter operator :"); sc.nextLine();
        String op = sc.nextLine();
        System.out.print("Enter second number :");
        int b = sc.nextInt();

        switch (op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
