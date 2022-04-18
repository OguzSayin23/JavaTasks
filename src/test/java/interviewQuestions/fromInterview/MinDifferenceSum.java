package test.java.interviewQuestions.fromInterview;

import java.util.*;

public class MinDifferenceSum {
    //Given an array n integer, rearrange them so that the absolute differences of all adjacent elements
    //is minimized. Then compute the sum of those absolute differences

    public static void main(String[] args) {
        Integer[] arr = {1,3,3,2,4};
        System.out.println(minDiff(arr));
    }
     public static int minDiff(Integer[] arr){
         List<Integer> list = new ArrayList<>(Arrays.asList(arr));
         Collections.sort(list);
         int sum = 0;
         for (int i = 0; i < list.size()-1; i++) {
             sum+=Math.abs(list.get(i)- list.get(i+1));
         }
         return sum;
     }


}
