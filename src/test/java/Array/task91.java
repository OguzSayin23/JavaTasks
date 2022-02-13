package test.java.Array;

import java.util.Random;

public class task91 {
    //Create an array with 10 elements
    //ØInitialize each array element with random values between 0 and 100 but less than 100
    //ØPrint each array element
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+", ");
        }
    }
}
