package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Array_MergeTwoArrays {
    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        int arr1[] = {1,5,9,88,125};
        int arr2[] = {789,741,753,0,1};
        int[] arr3 = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = arr1.length,j=0; i < arr3.length ; i++,j++) {
            arr3[i]=arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
