package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Array_reverse {
    /*
    write a function that can reverse an array
     */
    public static void main(String[] args) {
        int[] array = {45, 8, 3,8,7, 7, 9, 0, 0, 0};
        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] array){
        int[] reverseArray = new int[array.length];
        for (int i = 0,j= array.length-1; i < array.length; i++,j--) {
            reverseArray[i]=array[j];
        }
        return reverseArray;
    }
}
