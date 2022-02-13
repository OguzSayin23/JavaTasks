package test.java.Array;

import java.util.Scanner;

public class task87 {
    //Create an array that holds the days
    //User should be able to enter the day index and output should be:
    //“Today is Monday”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number:");
        int dayNum = sc.nextInt();

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wed";
        days[3] = "Thu";
        days[4] = "Fri";
        days[5] = "Sat";
        days[6] = "Sun";
        sc.close();
        System.out.println("Today is "+days[dayNum-1]);
    }
}
