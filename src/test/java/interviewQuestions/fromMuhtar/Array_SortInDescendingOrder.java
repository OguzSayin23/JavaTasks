package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Array_SortInDescendingOrder {
     /*
        Write a return method that can sort an int array in descending order without using the sort method
     */
     public static void main(String[] args) {
          int[] array = {7,0, 8, 3,8,45, 7, 9, 0, 100};
          System.out.println(Arrays.toString(sortDesc(array)));
     }

     public static int[] sortDesc(int[] array){
          for (int i = 0; i < array.length; i++) {
               for (int j = 0; j < array.length; j++) {
                    if (array[j]>array[i]) {
                         Integer dummy = array[i];
                         array[i] = array[j];
                         array[j] = dummy;
                    }
               }
          }
          return array;
     }
}
