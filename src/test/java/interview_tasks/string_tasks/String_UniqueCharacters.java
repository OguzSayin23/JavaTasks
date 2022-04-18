package test.java.interview_tasks.string_tasks;

public class String_UniqueCharacters {
     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
     public static void main(String[] args) {
         System.out.println(uniqueChar("AA1ABBBCCCDEF"));
     }
     public static String uniqueChar(String str){
         String unique = "";
         char arr[] = str.toCharArray();
         for (char ch1:arr) {
             int count = 0;
             for (char ch2:arr) {
                 if (ch1 == ch2){
                     count++;
                 }
             }
             if (count == 1) {
                 unique+=ch1;
             }
         }
         return unique;
     }
}
