package test.java.interviewQuestions.fromMuhtar;

import java.util.ArrayList;
import java.util.Arrays;

public class String_PasswordValidation {
       /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns false
     */
       public static void main(String[] args) {
           System.out.println(passwordValidation("azwsx1*"));

       }
       public static boolean passwordValidation(String S) {
           boolean flag =false;
           boolean upperCase = S.matches("(.*[A-Z].*)");
           boolean lowerCase = S.matches("(.*[a-z].*)");
           boolean hasDigit = S.matches("(.*[0-9].*)");
           boolean specialChar = S.matches("(.*[!-/,:-@].*)");

           if (S.length() >= 6 && !S.contains(" ") && upperCase && lowerCase && hasDigit && specialChar) {
               flag = true;
           }



           return flag;
       }
}
