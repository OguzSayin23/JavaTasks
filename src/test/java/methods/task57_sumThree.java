package test.java.methods;

public class task57_sumThree {
    /*
    Write a method that calculates the sum of 3 numbers
     */
    public static void main(String[] args) {
        sumThree(5,78,963);
    }

    public static void sumThree(int a, int b, int c){
        double sum = (double)(a+b+c)/3;
        System.out.println("sum of three number = " + sum);
    }
}
