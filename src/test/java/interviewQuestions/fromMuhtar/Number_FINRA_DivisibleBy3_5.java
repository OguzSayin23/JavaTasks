package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;

public class Number_FINRA_DivisibleBy3_5 {
     /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
     public static void main(String[] args) {
          System.out.println(FINRA(30,60));
     }
     public static String FINRA(int a, int b){
          String[] finra = new String[b-a+1];
          for (int i = 0; i <b-a+1 ; i++) {
               finra[i] = ""+(a+i);
               if (Integer.parseInt(finra[i])%3==0 && Integer.parseInt(finra[i])%5!=0) {
                    finra[i] = "FIN";
               }else if (Integer.parseInt(finra[i])%3!=0 && Integer.parseInt(finra[i])%5==0) {
                    finra[i] = "RA";
               }else if (Integer.parseInt(finra[i])%3==0 && Integer.parseInt(finra[i])%5==0) {
                    finra[i] = "FINRA";
               }

          }
          return Arrays.toString(finra);
     }
}
