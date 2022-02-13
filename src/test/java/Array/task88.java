package test.java.Array;

import java.util.Random;
import java.util.Scanner;

public class task88 {
    //Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche,
    //Ferrari)
    //•Ask user to enter an index number to choose his dream car.
    //•Print the price for selected car.
    //Car prices :
    //Honda – Toyota – Nissan (Random price between 20000 and 40000)
    //BMW-Mercedes(Random price between 50000 and 80000)
    //Porsche - Ferrari(Random price between 100000 and 150000)
    //•Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter day number:");
        int carNum = sc.nextInt();
        int price=0;

        String[] cars = new String[7];
        cars[0] = "Honda";
        cars[1] = "Toyota";
        cars[2] = "Nissan";
        cars[3] = "BMW";
        cars[4] = "Mercedes";
        cars[5] = "Porche";
        cars[6] = "Ferrari";

        String userCar = cars[carNum];
        if (userCar.equalsIgnoreCase("honda")||userCar.equalsIgnoreCase("toyota")||
                userCar.equalsIgnoreCase("nissan")) {
            price = rd.nextInt(((40000-20000)+1)+20000);

        }else if (userCar.equalsIgnoreCase("bmw")||userCar.equalsIgnoreCase("mercedes")) {
            price = rd.nextInt(((80000-50000)+1)+50000);
           // System.out.println("your Car = " + "$"+ price);
        }else if (userCar.equalsIgnoreCase("porche")||userCar.equalsIgnoreCase("ferrari")) {
            price = rd.nextInt(((150000-100000)+1)+100000);
            //System.out.println("your Car = " + "$"+ price);
        }
        System.out.println("your Car = " + "$"+ price);
}}
