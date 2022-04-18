package test.java.interviewQuestions.fromMuhtar;

public class Number_DivideWithoutDivision {
      /*
    Write a method that can divide two numbers without using division operator
     */
      public static void main(String[] args) {
            System.out.println(DivideWithoutDivision(3, 15));
      }
      public static int DivideWithoutDivision(int a,int b){
            int count = 0;
            if (a > b) {
                  while (a>0){
                        a = a - b ;
                        count++;
                  }
            }else {
                  while (b>0){
                        b = b - a ;
                        count++;
                  }

            }
            return  count;
      }

}
