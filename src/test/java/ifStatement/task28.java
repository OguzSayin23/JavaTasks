package test.java.ifStatement;

import java.util.Scanner;

public class task28 {
    /*
    Revenue can be calculated as the selling price of the product times the quantity sold, i.e.
revenue = price ×quantity. Write a program that asks the user to enter product price and
quantity and then calculate the revenue. If the revenue is more than 5000 a discount is
10% offered. Program should display the discount and net revenue.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter product price :");
        double price = sc.nextDouble();

        System.out.print("enter product quantity :");
        int quantity = sc.nextInt();

        double rev = price*quantity;

        if(rev>5000){
            System.out.println("discount: "+rev/10);
            System.out.println("net revenue: "+rev*9/10);
            }else{
            System.out.println(rev);
        }
    }


}
