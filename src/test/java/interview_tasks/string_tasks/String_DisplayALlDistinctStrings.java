package test.java.interview_tasks.string_tasks;

import java.util.HashSet;
import java.util.Set;

public class String_DisplayALlDistinctStrings {
       /*
   Display the Distinct Substring in a String
    Given a string, display all distinct substrings of the given string.
    Examples:
        Input : abcd
        Output : abcd abc ab a bcd bc b cd c d
        Input : aaa
        Output : aaa aa a aa a a
     */
       public static void main(String[] args) {
              displayALlDistinctStrings("abcd");
       }
       public static void displayALlDistinctStrings(String str){
              Set<String> dis = new HashSet<>();
              for (int i = 0; i < str.length(); i++) {
                     for (int j = str.length()-1; j >= i ; j--) {
                           dis.add(str.substring(i,j+1));
                     }
              }
              System.out.println(dis);
       }
}
