package test.java.interviewQuestions;

public class fibonacciSeries {
    public static void main(String[] args) {
        int count = 10;
        int a=0;
        int b=1;
        for (int i = 0; i < count ; i++) {
            System.out.println(b);
            int c=a+b;
            a=b;
            b=c;

        }

    }
}
