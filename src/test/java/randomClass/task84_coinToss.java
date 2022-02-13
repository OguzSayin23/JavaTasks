package test.java.randomClass;

import java.util.Random;
import java.util.Scanner;

public class task84_coinToss {
    //Dr. Kimuta was so happy with the dice rolling simulator that you wrote for him, he has
    //asked you to write one more program. He would like a program that he can use to
    //simulate ten coin tosses, one after the after. Each time the program simulates a coin
    //toss, it should randomly display either “Heads” or “Tails”
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i <10 ; i++) {
            int toss = rd.nextInt(2);

            if (toss == 0) {
                System.out.println("Tails");
            }else{
                System.out.println("Heads");
            }
        }

    }
}
