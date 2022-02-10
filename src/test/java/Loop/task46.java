package test.java.Loop;

import java.util.Scanner;

public class task46 {
    /*
    Write a program that the user to declare a positive integer. It should then print the
multiplication table of that number.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number:");

        int num = sc.nextInt();
        System.out.println("Multiplication Table for "+num+":\n"+"===========================");

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
