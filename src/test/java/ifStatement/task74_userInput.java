package test.java.ifStatement;

import java.util.Scanner;

public class task74_userInput {
    //Write a program that calculates the sum of numbers entered by the user until user enters
    //a negative number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            System.out.print("enter your number:");
            num = sc.nextInt();
            if (num <0) {
               break;
            }
            sum = sum + num;
            
        }while(num>0);
        System.out.println("Total = " + sum);
    }
}
