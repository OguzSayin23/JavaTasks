package test.java.ifStatement;

public class task25 {
    /*
    Write Java program that will accept three numbers and return the greatest number.
•Input:
Enter first number: 4
Enter second number: 8
Enter third number: 1
•Output:
The greatest number is: 8
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 1;

        if(a>b&&a>c){
            System.out.println("The greatest number is: "+a);
        }else if(b>c){
            System.out.println("The greatest number is: "+b);
        }else{
            System.out.println("The greatest number is: "+c);
        }
    }
}
