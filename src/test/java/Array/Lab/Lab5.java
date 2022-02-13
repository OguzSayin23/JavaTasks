package test.java.Array.Lab;

import java.util.Arrays;

public class Lab5 {
    //Write a method that accepts an array and prints an array with the elements "rotated
    //left”
    //int[] x = {1,2,3};  = > [2,3,1]
    //int[] y = {17,12,10,8}; = > [12,10,8,17]
    //int[] a = {7,0,0}; = > [0,0,7]
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y = {17,12,10,8};
        int[] a = {7,0,0};
        System.out.println(Arrays.toString(rotateArray(y)));
    }

    public static int[] rotateArray(int[] array){
        int[] rotateArray = new int[array.length];
        for (int i = 0,j = array.length-1 ;i < array.length; i++, j--) {
            rotateArray[i] = array[j];
        }
        return rotateArray;
    }
}
