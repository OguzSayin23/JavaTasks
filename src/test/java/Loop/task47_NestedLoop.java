package test.java.Loop;

public class task47_NestedLoop {
    /*
    Write a Java program to create pattern
******
******
******
******
******
******
******
     */
    public static void main(String[] args) {
        int rows =7;
        int columbs=6;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=columbs; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
