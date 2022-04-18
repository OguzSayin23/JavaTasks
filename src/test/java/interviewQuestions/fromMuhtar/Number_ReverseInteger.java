package test.java.interviewQuestions.fromMuhtar;

public class Number_ReverseInteger {
    public static void main(String[] args) {
        reverseInteger(1231001);
    }
    public static void reverseInteger(int a){
        int rev = 0;
        while (a>0){
            int k = a % 10;
            a = (a - k) / 10;
            rev = rev * 10 + k;
        }
        System.out.println("rev = " + rev);
    }
}
