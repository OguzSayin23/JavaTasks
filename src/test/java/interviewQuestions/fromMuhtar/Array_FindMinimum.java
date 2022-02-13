package test.java.interviewQuestions.fromMuhtar;

public class Array_FindMinimum {
    /*
    Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int each: arr) {
            if (each<min) {
                min = each;
            }
        }
        return min;
    }
}
