package test.java.interviewQuestions;

public class Palindrome {
    //Write a method that accepts a string
    //and returns true if the string is
    //palindrome.
    public static void main(String[] args) {
        isPalindrome("topspot");
        isPalindrome("tops");
    }

    public static void isPalindrome(String str){
        boolean flag = false;
        for (int i = 0, j = str.length()-1; i < str.length(); i++, j--) {
            if(str.charAt(i)==str.charAt(j)){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
