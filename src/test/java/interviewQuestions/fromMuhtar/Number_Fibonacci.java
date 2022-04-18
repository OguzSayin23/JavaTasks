package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Number_Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(10)));
    }

    public static int[] fibonacci(int a){
        int[] array = new int[a];
        array[0] = 1;
        array[1] = 1;
        for (int j = 2; j < a; j++) {
            array[j] = array[j-1]+array[j-2];
        }
        return  array;
    }
}
