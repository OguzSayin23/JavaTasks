package test.java.interviewQuestions.fromMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_RemoveNameAhmed {
     /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
     public static void main(String[] args) {
         List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "John", "Eric", "Ahmed"));
         System.out.println(RemoveNameAhmed(list));
     }

     public static List<String> RemoveNameAhmed(List<String> list){
         list.removeAll(Arrays.asList("Ahmed"));
         return list;
     }
}
