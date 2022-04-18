package test.java.interview_tasks.number_tasks;

import java.util.ArrayList;
import java.util.List;

public class Number_Armstrong {
       /*
    Write a method that can check if a number is Armstrong number
    1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
     */
       public static void main(String[] args) {
           System.out.println(armstrongNumber(1634));
       }

       public static boolean armstrongNumber(int i){
           int t = i;
           int count = 0;
           List<Integer> list = new ArrayList<>();
           while(i>=1){
               list.add(i%10);
                i = i/10;
                count++;
           }
           System.out.println(count);
           System.out.println(list);
           int sum = 0;
           for (Integer each:list) {
              sum += Math.pow(each,count);

           }
           System.out.println(sum);
           if (sum == t) {
               return true;
           }else{
               return false;
           }

       }
}
