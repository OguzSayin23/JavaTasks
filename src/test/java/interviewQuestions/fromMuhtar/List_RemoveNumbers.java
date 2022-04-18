package test.java.interviewQuestions.fromMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNumbers {
     /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 55, 896, 963, 741, 122));
          System.out.println(removeNumbers(list));
     }
     public static List<Integer> removeNumbers(List<Integer> list){
          list.removeIf(a -> a>100);
          return list;
     }
}
