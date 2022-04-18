package test.java.interviewQuestions.fromMuhtar;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicates {
      /*
    Write a function that can remove the duplicates from an array of integers
     */
      public static void main(String[] args) {
            int[] array = {45, 8, 3,8,7, 7, 9, 0, 0, 0};
            System.out.println(Arrays.toString(removeDuplicate(array)));

      }

      public static int[] removeDuplicate(int[] array){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int[] arr ;
            for (int each: array) {
                  if (!arrayList.contains(each)) {
                        arrayList.add(each);
                  }
            }
            arr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                  arr[i] = arrayList.get(i);
            }
            return arr;
      }

      //solution 2
      public static int[] removeDuplicates(int[] array){
            return Arrays.stream(array).distinct().toArray();
      }
}
