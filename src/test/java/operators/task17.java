package test.java.operators;

public class task17 {
    /*
    Write a Java program that calculates the average of 3 numbers.
     */
    public static void main(String[] args) {
        int a = 11;
        int b = 25;
        int c = 35;
        double avg = (a + b + c)/(double)3;
        System.out.println("average a,b,c = " + avg);

        int pies = 10, people = 4;
        double piesPerson=(double)pies/people;
        System.out.println(piesPerson);
    }
}
