package test.java.Loop;

public class task53 {
    /*
    Write a program using while loop, that calculates the sum of the even numbers between
0 and 100
     */
    public static void main(String[] args) {
        int i = 1;
        int sumEven=0;
        while (i<100){
            if (i %2==0) {
                sumEven+=i;
            }
            i++;
        }
        System.out.println("sumEven = " + sumEven);
    }
}
