package test.java.Array;

import java.util.Random;
import java.util.Scanner;

public class task {
    //Write a RainFall class that stores the total rainfall for each of 12 months into an array of
    //doubles. The program should have methods that return the following:
    //- total rainfall for the year
    //- the average monthly rainfall
    //- the month with the most rain
    //- the month with the least rain
    //Input Validation: Do not accept negative numbers
    //for the monthly rainfall figures.

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        double total = 0;
        double avg = 0;
        double max = 0;
        double min = 10;

        String[] months = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i]+":");
            double input = sc.nextDouble();
            total+=input;
            avg = total/i+1;
            if (input>max) {
                max = input;
            }
            if (input<min) {
                min = input;
            }
        }
        System.out.println("total:"+ total);

        System.out.println("the average monthly rainfall:"+ avg);
        System.out.println("the max:"+ max);
        System.out.println("the min:"+ min);

    }
}
