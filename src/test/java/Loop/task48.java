package test.java.Loop;

public class task48 {
    /*
    Write a Java program to create pattern
*
**
***
****
*****
******
*******
     */
    public static void main(String[] args) {
        int num = 11;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(":) ");

            }
            System.out.println("");

        }
    }
}
