package test.java.interviewQuestions.fromMuhtar;

public class Number_SumOfDigitOfInteger {
    /*
    write a function that can return the sum of digits of an integer Do not use any string manipulations
        Ex:
            input: 123
            output: 6
     */
    public static void main(String[] args) {
        int a = 123450000;
        int sum = 0;
        while (a>0){
            int k = a%10;
            a = (a-k)/10;
            sum+=k;
        }
        System.out.println("sum = " + sum);

    }
}
