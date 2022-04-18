package test.java.interviewQuestions;

public class Palindrome {
    //Write a method that accepts a string
    //and returns true if the string is
    //palindrome.
    public static void main(String[] args) {
        System.out.println(isPalindrome("topsospoT"));
        System.out.println(isPalindrome("topos"));
    }

    public static boolean isPalindrome(String str){
        boolean flag = false;
        String reverse = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
           reverse+=str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)) {
            flag=true;
        }

        return flag;
    }
}
