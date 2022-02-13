package test.java.stringManipulation;

public class task78_numberOfChar {
    //Write a program to count the number of occurrences for specific char
    //String word = "abcabqcabc”
    //Number of a in this string is: 3
    public static void main(String[] args) {
        String word = "abcabqcabc";
        char s = 'q';
        int count = 0 ;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==s) {
                count++;
            }
        }
        System.out.println("Number of "+s+" in this string is: " + count);
    }
}
