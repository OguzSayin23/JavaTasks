package test.java.interview_tasks.string_tasks;

import java.util.Arrays;

public class String_Anagram {
      /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */
      public static void main(String[] args) {
          String str1 = "abc";
          String str2 = "acb";

          char[] c1 = str1.toCharArray();
          char[] c2 = str2.toCharArray();
          Arrays.sort(c1);
          Arrays.sort(c2);
          String a1="" ,a2 = "";
          for (char each:c1) {
              a1+=each;
          }
          for (char each:c2) {
              a2+=each;
          }

          System.out.println(a1.equals(a2));


      }
}
