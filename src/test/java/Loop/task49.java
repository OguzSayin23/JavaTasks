package test.java.Loop;

public class task49 {
    /*
    Write a Java program to create a stair step pattern
 #
  #
    #
      #
        #
          #
     */
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j == i) {
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
