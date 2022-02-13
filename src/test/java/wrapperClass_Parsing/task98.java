package test.java.wrapperClass_Parsing;

import java.util.Locale;

public class task98 {
    //Change the implementation of decodeTheCode(String) method such that on executing class,
    //following output is shown:
    //1 2 5 6
    //9 3 4
    public static void main(String[] args) {
        String str1="&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        String s = "";
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isAlphabetic(str1.charAt(i))||str1.charAt(i)==' ') {
                s+=str1.charAt(i);
            }
        }
        System.out.println(s);
        String[] arr = s.split(" ");
        String num ="";
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i].toLowerCase(Locale.ROOT)){
                case "zero":
                    num+="0 ";
                    break;
                case "one":
                    num+="1 ";
                    break;
                case "two":
                    num+="2 ";
                    break;
                case "three":
                    num+="3 ";
                    break;
                case "four":
                    num+="4 ";
                    break;
                case "five":
                    num+="5 ";
                    break;
                case "six":
                    num+="6 ";
                    break;
            }
        }
        System.out.println(num);

    }
}
