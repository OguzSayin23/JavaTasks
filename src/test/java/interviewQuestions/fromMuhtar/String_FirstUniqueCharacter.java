package test.java.interviewQuestions.fromMuhtar;

public class String_FirstUniqueCharacter {
       /*
    write a program that can return the first non-repeated character from a string
     */
       public static void main(String[] args) {
           String str = "kkkk2CCCTqqqqIIIZp111";
           System.out.println("first unique char: " + FirstUniqueCharacter(str));
       }

       public static char FirstUniqueCharacter(String str){
           char unique = 0;
           for (int i = 0; i < str.length(); i++) {
               int count = 0;
               for (int j = 0; j < str.length(); j++) {
                   if (str.charAt(i) == str.charAt(j)) {
                       count++;
                   }
               }
               if (count == 1) {
                   unique = str.charAt(i);
                   break;
               }
           }
           return  unique;
       }
}
