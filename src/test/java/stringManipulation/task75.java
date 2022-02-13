package test.java.stringManipulation;

import java.util.Scanner;

public class task75 {
    //Write a program that ask user to enter his/her firstname and lastname. Display in the
    //console total number of characters.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("your name lenght :"+name.length());
    }
}
