package test.java.interviewQuestions.fromMuhtar;

public class Array_FindMaximum {
     /*
        Write a function that can find the maximum number from an int Array
     */
     public static void main(String[] args) {

     }
     public static int findMax(int[] arr){
         int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]>max) {
                 max = arr[i];
             }
         }
         return  max;
     }
}
