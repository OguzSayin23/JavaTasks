package test.java.interviewQuestions.fromMuhtar;

public class Number_PrimeNumber {
    /*
        Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(2));
    }
    public static boolean checkPrimeNumber(int a){
        boolean prime = false;
        int count = 0;
        if (a == 1) {
            prime = false;
        }else if (a > 1) {
            for (int i = 2; i < a ; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                prime = true;
            }
        }

        return prime;
    }
}
