package test.java.Loop;

public class task50 {
    /*
    Write a Java program to create pattern
1
1   2
1   2   3
1   2   3   4
1   2   3   4   5
     */
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
