package test.java.interviewQuestions.fromMuhtar;

import java.util.ArrayList;
import java.util.Arrays;

public class String_RemoveExtraSpaces {
     /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java
     */
     public static void main(String[] args) {
         String str = "  Hello world      I      love      Java    ";
         System.out.println(removeExtraSpaces(str));
     }

     public static String removeExtraSpaces(String str){
        str = str.trim();
        String str1 = "";
        String[] array = str.split(" ");
        int count=0;
         ArrayList<String> list = new ArrayList<>();
         for (String each:array) {
             if (!each.isEmpty()) {
                 str1+=each+ " ";

             }
         }


            return  str1;
     }

}