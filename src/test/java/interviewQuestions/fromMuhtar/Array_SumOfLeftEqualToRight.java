package test.java.interviewQuestions.fromMuhtar;

public class Array_SumOfLeftEqualToRight {
    /*
    Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.
    For example :
            Given [4, 9, 1, 3, 6, 4]
            your function should give item 1, because 4+9 = 3+6+4
     */
    public static void main(String[] args) {
        int[] array = {10, 4, 9, 1, 3, 6, 4, 1, 9};
        System.out.println((SumOfLeftEqualToRight(array)));
    }

    public static int SumOfLeftEqualToRight(int[] array){

        int num = 0;
        for (int i = 1; i < array.length-1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i ; j++) {
                sumLeft +=array[j];
            }
            for (int j = i+1; j < array.length ; j++) {
                sumRight+=array[j];
            }
            if (sumLeft == sumRight) {
                num = array[i];
            }
            System.out.println("sumLeft = " + sumLeft);
            System.out.println("sumRight = " + sumRight);
        }
        return num;
    }
}
