package test.java.interviewQuestions.fromMuhtar;

public class Number_ArmstrongNumber {
       /*
    Write a method that can check if a number is Armstrong number
     */
       public static void main(String[] args) {
              System.out.println(ArmstrongNumber(371));
       }
       public static boolean ArmstrongNumber(int num){
              int arm = 0;
              boolean flag = false;
              int num1 = num;
              while (num>=1){
                     int k = num%10;
                     num = num/10;
                     arm+=Math.pow(k,3);
              }
              if (num1 == arm) {
                  flag=true;
              }
             return flag;
       }
}
