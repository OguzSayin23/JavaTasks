package test.java.interview_tasks.string_tasks;

public class String_FirstUniqueCharacter {
      /*
    write a program that can return the first non-repeated character from a string
     */
      public static void main(String[] args) {
          firstUniqueCharacter("as1dasdwwwqr");
      }
      public static void firstUniqueCharacter(String str){

         for (int i = 0; i < str.length(); i++) {
              int count = 0;
              for (int j = 0; j < str.length(); j++) {
                  if (str.charAt(i)==str.charAt(j)) {
                      count++;
                  }
              }
              if (count == 1) {
                  System.out.println(str.charAt(i));
                  break ;
              }
          }
      }
}
