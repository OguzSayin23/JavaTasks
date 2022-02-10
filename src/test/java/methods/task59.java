package test.java.methods;

public class task59 {
    //Write a method that accepts number of hours and hourly pay and show your pay for
    //those hours in the console.
    public static void main(String[] args) {
        hourlyPay(10,25);

    }

    public static void hourlyPay(int hour,int pay){
        System.out.println("hourly pay = $"+ pay*hour);
    }
}
