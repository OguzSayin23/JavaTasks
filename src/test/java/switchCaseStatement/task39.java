package test.java.switchCaseStatement;

import java.util.Scanner;

public class task39 {
    /*
    Write a program to display traffic light colors using following logic:
if code (R/r)-->"Red"
if code (O/o)-->"Orange"
if code (G/g)-->"Green"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic lights color :");
        String light = sc.nextLine();

        switch(light){
            case "O": case"o":
                System.out.println("Orange_ get ready");
                break;
            case "R": case "r":
                System.out.println("Red_stop");
                break;
            case "G": case "g":
                System.out.println("Green_pass");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
