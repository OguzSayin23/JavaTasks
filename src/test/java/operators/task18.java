package test.java.operators;

public class task18 {
    public static void main(String[] args) {
        int x = 2;
        int y = x++;
        System.out.println("y = " + y);
        System.out.println(x++);
        System.out.println(--x);

        x=8;
        y=x--;
        System.out.println(y);



    }
}
