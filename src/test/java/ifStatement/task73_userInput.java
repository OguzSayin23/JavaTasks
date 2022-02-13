package test.java.ifStatement;

import java.util.Scanner;

public class task73_userInput {
    //Write a guessing game where the user has to guess a secret number
    //between 1-20. After every guess, the program tells the user whether
    //their number was too large or too small. The program will keep asking
    //the user to enter the number until he finds the correct number.
    //When the correct answer is found, the program will display "Congrat,you got it"
    public static void main(String[] args) {
        int num = 15;
        Scanner sc = new Scanner(System.in);
        System.out.print("guess a secret number:");
        for (int i = 1; i <=5 ; i++) {
            int guess = sc.nextInt();
            if (guess>20||guess<0) {
                System.out.println("wrong number, please guess a number between 0 - 20. left " + (5-i) + " try");
            }else if(guess<num){
                System.out.println("number was too large, left " + (5-i) + " try");
            }else if(guess>num){
                System.out.println("number was too small, left " + (5-i) + " try");
            }else if(guess==num){
                System.out.println("YOU WIN");
            }
        }

    }
}
