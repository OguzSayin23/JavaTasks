package test.java.methods;

public class task62_greatestNumber {
    //Write a method that accepts 3 numbers and displays the greatest one in the console.
    //Sample Output:
    //calculateGreatest(5,2,3)  -- >5

    public static void main(String[] args) {
        greatestNumber(15,35,987);
    }

    public static void greatestNumber(int a, int b, int c){
        if(a>b&&a>c){
            System.out.println("The greatest number is: "+a);
        }else if(b>c){
            System.out.println("The greatest number is: "+b);
        }else{
            System.out.println("The greatest number is: "+c);
        }
    }
}
