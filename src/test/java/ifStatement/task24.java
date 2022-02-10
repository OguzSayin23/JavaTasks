package test.java.ifStatement;

public class task24 {
    /*
    Write a Java program:
1) Declare a variable and initialize user age.
2) Then the program will show if the user is eligible to vote. A Person who is eligible to
vote must be older than or equal to 18 years old.
Input: Enter your age :18
Output: You are eligible to vote
     */
    public static void main(String[] args) {
        int age = 18;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("Not eligible");
        }
    }
}
