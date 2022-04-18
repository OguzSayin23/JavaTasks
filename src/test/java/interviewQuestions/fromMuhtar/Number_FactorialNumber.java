package test.java.interviewQuestions.fromMuhtar;

public class Number_FactorialNumber {
     /*
    Write a return method that returns the factorial number of any given number
        Ex:
                Input: 5
                outPut: 120
                because 5 * 4 * 3 * 2 * 1 = 120
     */
     public static void main(String[] args) {
         System.out.println(factorialNumber(5));
     }
     public static int factorialNumber(int a){
         int fac = 1;
         for (int i = a; i >0 ; i--) {
             fac = fac*i;
         }
         return fac;
     }
}
