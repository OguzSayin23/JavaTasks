package test.java.interviewQuestions.fromMuhtar;

public class Number_SwapTwoNumbers {
     /*
    Swap two variable' values without using a third variable
     */
     public static void main(String[] args) {
          swap1(15,8);
     }

     public static void swap1(int a, int b){
          a = a+b;
          b = a-b;
          a = a-b;

          System.out.println("a = " + a);
          System.out.println("b = " + b);
     }
}




