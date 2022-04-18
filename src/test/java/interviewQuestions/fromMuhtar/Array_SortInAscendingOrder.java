package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Array_SortInAscendingOrder {
    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */
    public static void main(String[] args) {
        int[] array = {7,0, 8, 3,8,45, 7, 9, 0, 100};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array){

        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length; i++) {
                if (array[j] < array[i] ) {
                    Integer k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                }
            }
        }
        return array;
    }
}
