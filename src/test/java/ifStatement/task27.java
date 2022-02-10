package test.java.ifStatement;

public class task27 {
    /*Write a Java program to implement following logic using if statement
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
3. if hour is greater than or equal to 3 pm, greet with Good Evening
     */
    public static void main(String[] args) {
        int hour = 12;
        String greet = "";

        if(hour<12){
            greet = "Good Morning";
        }else if(hour>=12||hour>15){
            greet = "Good Afternoon";
        }else if(hour>=15||hour<25){
            greet = "Good Evening";
        }
        System.out.println(greet);
    }
}
