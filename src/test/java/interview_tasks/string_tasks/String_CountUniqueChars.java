package test.java.interview_tasks.string_tasks;

public class String_CountUniqueChars {
        /*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
     */
        public static void main(String[] args) {
            System.out.println(unique("kk"));
        }

        public static String unique(String str){
            String result = "";
            char[] ch = str.toCharArray();
            for (char each1:ch) {
                int count = 0;
                for (char each2:ch) {
                    if (each1 == each2) {
                        count++;
                    }
                }
                if (count == 1) {
                    result+=each1;
                }
            }
            if (result == "") {
                return "-1";
            }
            return result;
        }
}
