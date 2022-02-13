package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Array_firstDuplicatedElement {
      /*
    write a program that can find the first duplicated element from the array
     */
      public static void main(String[] args) {
          String str = "a program that can find the first duplicated element from the array";

          str = str.replace(" ","");
          System.out.println("str = " + str);
          String[] arr = str.split("");
          System.out.println(Arrays.toString(arr));

          for (int i = 0; i < arr.length; i++) {
              int count= 0;
              for (String each: arr) {
                  if (arr[i].equals(each)) {
                      count++;
                  }
              }
                  if (count == 2) {
                      System.out.println(arr[i]);
                      break;
              }
          }
      }
}
