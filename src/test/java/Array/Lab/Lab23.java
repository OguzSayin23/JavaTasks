package test.java.Array.Lab;

import java.util.Arrays;

public class Lab23 {
    //Write a method that accepts a number and create and prints a new array of length
    //number, containing the numbers 0,1,2,...number-1.
    //fizzArray(4) →[0, 1, 2, 3]
    //fizzArray(1) →[0]
    //fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(10)));
    }

    public static int[] fizzArray(int num){
        int[] fizz = new int[num];
        for (int i = 0; i < num; i++) {
            fizz[i] = i;
        }
        return fizz;
    }
}
