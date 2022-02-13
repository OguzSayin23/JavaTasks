package test.java.Array;

import java.util.Scanner;

public class task86 {
    //Create an array that holds 12 months names
    //User should be able to enter month index and output should be:
    //“The month name is <MonthName>”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int monthNum = sc.nextInt();

        String[] monthName = new String[12];
        monthName[0]="Jan";
        monthName[1]="Feb";
        monthName[2]="March";
        monthName[3]="Apr";
        monthName[4]="May";
        monthName[5]="June";
        monthName[6]="July";
        monthName[7]="Aug";
        monthName[8]="Sep";
        monthName[9]="Oct";
        monthName[10]="Nov";
        monthName[11]="Dec";

        System.out.println("monthName is " + monthName[monthNum]);

    }

    public static void findMonth(){
        int monthNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        monthNum = sc.nextInt();

        switch (monthNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("wrong month number");
        }

    }
}
