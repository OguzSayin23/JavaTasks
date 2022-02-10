package test.java.Loop;



public class task51_clock {
    /*
    Write a Java program to simulate a clock by using nested loop
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <=24 ; i++) {
            for (int j = 0; j <60 ; j++) {
                for (int k = 0; k <60 ; k++) {
                    System.out.println(i+":"+j+":"+k);
                    Thread.sleep(1000);
                }
            }
        }
    }
}
