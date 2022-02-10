package test.java.methods;

public class task67 {
    //Write a method that accepts 2  numbers and return if they have the same last digit.
    //Sample Output
    //lastDigit(7,17) - >true
    //lastDigit(6,17) - >false
    //lastDigit(3,113) - >true
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 173));
    }

    public static boolean lastDigit(int a, int b){

        if (a%10 == b%10) {
            return true;
        }else{
            return false;
        }
    }
}
