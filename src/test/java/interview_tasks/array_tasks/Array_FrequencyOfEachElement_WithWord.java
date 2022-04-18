package test.java.interview_tasks.array_tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Array_FrequencyOfEachElement_WithWord {
     /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five
     */
     public static void main(String[] args) {
         int[]arr = {3,1,2,3,4,2,1,3,2,2,2,4};
         String[] str = {"zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine", "ten", "more than ten"};

         Map<Integer,String> freq = new TreeMap<>();
         for (int each: arr) {
             int count = 0;
             for (int each1: arr) {
                 if (each==each1) {
                     count++;
                 }
             }
             if (count > 10) {
                 freq.put(each,str[11]);
             }else{
                 freq.put(each,str[count]);
             }
         }
         freq.forEach((k,v) -> System.out.println(k+" is "+v));

     }
}
