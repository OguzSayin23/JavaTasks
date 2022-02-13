package test.java.Array.Lab;

import java.util.Arrays;

public class Lab14 {
    //Write a method that accepts 2 arrays and prints a new array containing all their
    //elements
    //int[] x = {1,2}    int[] y = {3,4}  = > [1,2,3,4]
    //int[] x = {4,4}    int[] y = {2,2}  = > [4,4,2,2]
    //int[] x = {9,2}    int[] y = {3,4}  = > [9,2,3,4]
    public static void main(String[] args) {
        int[] x = {1,2};
        int[] y = {3,4,6,9,15};
        combineArray(x,y);
    }

    public static void combineArray(int[] x, int[] y){
        int[] z = new int[x.length+y.length];
        for (int i = 0; i < x.length ; i++) {
            z[i] = x[i];
        }
        for (int j = x.length,i=0; j <(x.length+y.length) ; j++,i++) {
            z[j] = y[i];
        }
        System.out.println(Arrays.toString(z));
    }
}
