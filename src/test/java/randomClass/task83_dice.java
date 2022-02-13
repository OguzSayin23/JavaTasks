package test.java.randomClass;

import java.util.Random;
import java.util.Scanner;

public class task83_dice {
    //Dr. Kimuta teaches an introductory statics class and has asked you to write a program
    //that he can use in class to simulate the rolling dice. The program should randomly
    //generate two numbers in the range of 1 through  6 and display them. In your interview
    //with Dr. Kimura, you learn that he would like to use the program to simulate several
    //rolls of the dice, one after the other.

    public static void main(String[] args) {
        System.out.println("rolling the dice...");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Boolean dice = false;
        int dice1 = rd.nextInt(6)+1;
        int dice2 = rd.nextInt(6)+1;
        System.out.println("Their values are:" + dice1+", "+ dice2);
        do {
            System.out.print("Roll them again? (yes = y/Y):");
            String answer = sc.nextLine();

            if(answer.equalsIgnoreCase("y")){
                int dice3 = rd.nextInt(6)+1;
                int dice4 = rd.nextInt(6)+1;
                System.out.println("Their values are:" + dice3+", "+ dice4);
                //dice=true;
            }else if(answer.equalsIgnoreCase("N")){
                break;
                //dice = false;
            }else{
                System.out.print("bad answer, ");
            }
        }while(true);
    }
}
