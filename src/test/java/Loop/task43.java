package test.java.Loop;

public class task43 {
    /*
    Write a Java Program to print the following table.
     */
    public static void main(String[] args) {
        System.out.println("Number      "+"Number Square");

        for(int i=1;i<=10;i++){
            int k=Math.multiplyExact(i,i);
            System.out.println(i+"           "+k);

        }
    }
}
