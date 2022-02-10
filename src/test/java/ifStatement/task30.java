package test.java.ifStatement;

import java.util.Scanner;

public class task30 {
    /*
    Write a Java program:
1) Declare and initialize a number
2) Display whether the number is an odd number or even number.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number");
        }else{
            System.out.println(num+" is a odd number");
        }
    }
}
