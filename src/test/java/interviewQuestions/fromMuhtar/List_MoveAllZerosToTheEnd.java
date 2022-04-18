package test.java.interviewQuestions.fromMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {
     /*
    write a program that can move all the zeros to the end of the List of integers
     */
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(Arrays.asList(0,1,5,0,85,0,0,0,14,26,100));
         System.out.println(moveAllZerosToTheEnd(list));

     }

     public static List<Integer> moveAllZerosToTheEnd(List<Integer> list){
         int a = list.size();
         list.removeAll(Arrays.asList(0));
         int b = list.size();
          for (int i = 0; i < a - b; i++) {
               list.add(0);
          }
          return list;
     }














//     public static List<Integer> MoveAllZerosToTheEnd(List<Integer> list){
//         int orgSize = list.size();
//         list.removeAll(Arrays.asList(0));
//         int size = list.size();
//         for (int i = 0; i < orgSize-size; i++) {
//             list.add(0);
//
//         }
//         return list;
//     }
}
