package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {
      /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */
      public static void main(String[] args) {
            System.out.println(same("abc", "cab"));
            System.out.println(same1("abc", "cab"));
            System.out.println(same("abc", "abb"));
            System.out.println(same1("abc", "abb"));

      }

      public static boolean same(String str1, String str2){
            boolean flag = false;
            for (int i = 0; i < str1.length(); i++) {
                  int count=0;
                  for (int j = 0; j < str2.length(); j++) {
                        if (str1.charAt(i)==str2.charAt(j)) {
                              count++;
                        }
                  }
                  if(str1.charAt(i)!=str2.charAt(i) && count==1){
                        flag =true;
                  }
            }return flag;
      }

      //solution 2
      public static boolean same1(String str1, String str2){
            str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
            str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

            return str1.equals(str2);

      }

}
