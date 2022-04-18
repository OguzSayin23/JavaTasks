package test.java.interview_tasks.string_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_CountOfRepeatedChars {
     /*
        Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa -->  a2b1c3d2a4
     */
     public static void main(String[] args) {
         String str = "aabcccddaaaa";
         String result = "";
         String temp = str.substring(0,1);
         int count = 0;
         for (int i = 0; i < str.length(); i++) {
             if (temp.equals(str.substring(i,i+1))) {
                 count++;
             }else{
                 result+=temp+count;
                 temp = str.substring(i,i+1);
                 count  =1;
             }
         }
         result+=temp+count;
         System.out.println(result);
     }
}
