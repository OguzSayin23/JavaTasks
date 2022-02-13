package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Array_MoveAllZerosToEnd {
    /*
    write a program that can move all the zeros to the end of an array
     */
    public static void main(String[] args) {
        int[] arr = {45,0,8,3,0,0,7,9};
        System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));
    }

    public static int[] moveAllZerosToEnd(int[] array){
        //int[] arr = new int[array.length];

        for (int i = 0;i< array.length;i++) {
            if (array[i] == 0) {
                for (int j = i+1; j < array.length ; j++) {
                    if (array[j]!=0) {
                        array[i]=array[j];
                        array[j]=0;
                        break;
                    }
                }
            }

        }
        return array;
    }

}
