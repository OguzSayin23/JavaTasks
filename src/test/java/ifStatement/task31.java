package test.java.ifStatement;

import java.util.Scanner;

public class task31 {
    /*
    A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
program that declares three integers as angles and check whether a triangle is valid or
not.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter triangle angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b+c==180){
            System.out.println("triangle is valid");
        }else{
            System.out.println("triangle is NOT valid");
        }
    }
}
