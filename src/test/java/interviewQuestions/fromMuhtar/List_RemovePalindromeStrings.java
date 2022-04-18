package test.java.interviewQuestions.fromMuhtar;

import test.java.interviewQuestions.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class List_RemovePalindromeStrings {
    /*
        remove palindrome strings from a List of String
    */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("ama", "Johoj", "Eric", "John", "Ericire", "Ahmed"));
        System.out.println(RemovePalindromeStrings(list));
    }
    public static List<String> RemovePalindromeStrings(List<String> list){
        list.removeIf(a ->Palindrome.isPalindrome(a));
        return list;

    }



}
