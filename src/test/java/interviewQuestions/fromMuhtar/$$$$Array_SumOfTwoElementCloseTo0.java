package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class $$$$Array_SumOfTwoElementCloseTo0 {
     /*
        return the sum of the two elements closest to zero
     */
     public static void main(String[] args) {
          int[] array = {7, 10, -4, 3, 8, 45, 7, 9, 450, 100};
          System.out.println((sumCloseZero(array)));
          //sumCloseZero(array);
     }
     public static int sumCloseZero(int[] array){
          //System.out.println(Arrays.stream(array).min().getAsInt());
          int k = 0;
          int close1 = Math.abs(Integer.MAX_VALUE);
          int close2 = Math.abs(Integer.MAX_VALUE);
          for (int i = 0; i < array.length; i++) {
               for (int j = i+1; j < array.length; j++) {

                    if (Math.abs(array[i]) < Math.abs(array[j]) && (Math.abs(array[i]) < close1)){
                         close1 = array[i];
                         //array[i] = Integer.MAX_VALUE;

                    }
//                    if ((Math.abs(array[i]) < Math.abs(array[j])) && Math.abs(array[i]) < Math.abs(close2)) {
//                         close2 = array[i];
//                    }
               }

          }
          System.out.println("close1 = " + close1);
          System.out.println("close2 = " + close2);
          return close1+close2;
     }
}
