package test.java.ifStatement;

import java.util.Scanner;

public class task34 {
    /*
    The marks obtained by a student in 3 different subjects are input by the user. Your
program should calculate the average of subjects. The student gets a grade as per the
following rules:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score = sc.nextInt();

        if(score>0&&score<60) {
            System.out.println("Grade F");
        }else if(score>=60&&score<70) {
            System.out.println("Grade D");
        }else if(score>=70&&score<80) {
            System.out.println("Grade C");
        }else if(score>=80&&score<90) {
            System.out.println("Grade B");
        }else if(score>=90&&score<=100) {
            System.out.println("Grade A");
        }
    }
}
