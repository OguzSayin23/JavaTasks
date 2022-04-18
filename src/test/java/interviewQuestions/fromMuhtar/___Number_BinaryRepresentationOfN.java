package test.java.interviewQuestions.fromMuhtar;

public class ___Number_BinaryRepresentationOfN {
     /*
    return the number of '1's in the binary representation of n for any integer n, where n > 0
    Example:
        for n=6 the binary representation is '110' and the number of '1's in that representation is 2
     */
     public static void main(String[] args) {
          System.out.println(binaryRepresentationOfN(15));
     }

     public static String binaryRepresentationOfN(int n){
          String result = "";
          while (n>0){
               if (n%2==0) {
                    result = 0+ result;

               }else if (n %2 ==1) {
                    result = 1+ result;

               }
               n=n/2;
          }
          return  result;
     }















//     public static String binaryRep(int n){
//          String s = "";
//          while (n>0){
//               if (n % 2 == 1) {
//                    s = 1 + s;
//               } else if(n % 2 == 0){
//                    s = 0 + s;
//               }
//               n = n/2;
//          }
//          return s;
//     }


}
