package test.java.interviewQuestions;

import java.util.Arrays;

public class removeDuplicates {

    //    Write a function that can remove the duplicates from an array of integers
    public static void main(String[] args) {
        String str = "aabbbccdeeefgghhh1118888888";
        System.out.println(removeDuplicate(str));
    }

    public static String removeDuplicate(String str){
        String str2 = "";
        String[] arr = new String[str.length()];
        arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[i]="";

                }
            }
        }
        for (String each: arr) {
            str2+=each;
        }
        return str2;
    }

}
