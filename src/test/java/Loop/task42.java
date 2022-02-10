package test.java.Loop;

public class task42 {
    /*
    Write a program that displays sum of even and odd numbers between 1 and 100
excluding 100
     */
    public static void main(String[] args) {
        int sumEven=0, sumOdd=0;

        for(int i=1;i<100;i++){
            if(i%2==0){
                sumEven+=i;
            }else{
                sumOdd+=i;
            }
        }
        System.out.println("sum of even number: "+sumEven);
        System.out.println("sum of odd number: "+sumOdd);
    }
}
