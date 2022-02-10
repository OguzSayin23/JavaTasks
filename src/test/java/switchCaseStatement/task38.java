package test.java.switchCaseStatement;

import java.util.Scanner;

public class task38 {
    /*
    Write a program to display days:
1-Monday
2-Tuesday
3-Wednesday
4-Thursday
5-Friday
6-Saturday
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = sc.nextInt();

        switch (day%7){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("tuesday");
                break;
            case 2:
                System.out.println("wednesday");
                break;
            case 3:
                System.out.println("thursday");
                break;
            case 4:
                System.out.println("friday");
                break;
            case 5:
                System.out.println("saturday");
                break;
            case 6:
                System.out.println("sunday");
                break;
        }
    }
}
