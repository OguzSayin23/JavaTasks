package test.java.Array;

public class task90 {
    //Create a car array that holds 6 car names inside
    //ØCheck if your array has the car name “Honda”
    //ØIf it is , print “ I found your car Honda in this array”
    //ØIf it is not, print “ I could not find your car Honda in this array”

    public static void main(String[] args) {
        String[] arr = {"BMW","Mercedes","Acura","Ford","Toyota","Honda"};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "Honda") {
                count++;
            }
        }
        if (count>=1) {
            System.out.println("I found your car Honda in this array");
        }else{
            System.out.println("I could not find your car Honda in this array");
        }
    }
}
