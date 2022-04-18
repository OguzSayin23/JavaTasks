package test.java.interviewQuestions.fromMuhtar;

public class String_IndexOfFirstUniqueChar {
     /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */
     public static void main(String[] args) {
         String str = "palalotopot";
         System.out.println(indexOfFirstUniqueChar(str));
     }
     public static int indexOfFirstUniqueChar( String S){

         String unq = "";
         for (int i = 0; i < S.length(); i++) {
             int count = 0;
             for (int j = 0; j < S.length(); j++) {
                 if (S.charAt(i) == S.charAt(j)) {
                     count++;
                 }
             }
             if (count == 1) {
                 return i;
             }
         }
         return -1;
     }
}
