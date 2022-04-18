package test.java.interviewQuestions.fromMuhtar;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ___String_FrequencyOfCharacters {
/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "AAABBCDD";

        String[] arr = str.split("");
        Map<String,Integer> emp = new LinkedHashMap<>();
        for (String each1:arr) {
            int count = 0;
            for (String each2:arr) {
                if (each1.equals(each2)) {
                    count++;
                }
            }
            emp.put(each1,count);
        }
        for (Map.Entry<String,Integer> each : emp.entrySet()){
            System.out.print(each.getKey()+each.getValue());
        }
    }











//    public static String FrequencyOfChars(String str){
//
//        String nonDup = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (!nonDup.contains(""+str.charAt(i))) {
//                nonDup+=""+str.charAt(i);
//            }
//        }
//        String result ="";
//        for (int i = 0; i < nonDup.length(); i++) {
//            int count =0;
//            for (int j = 0; j < str.length(); j++) {
//                if (nonDup.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//                result+=""+ nonDup.charAt(i)+ "" + count;
//        }
//        return result;
//    }
//
//    // solution 2
//    public static String frequencyOfChars(String str){
//    String nonDup = "";
//    String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (!nonDup.contains(""+str.charAt(i))) {
//                nonDup+=""+str.charAt(i);
//            }
//        }
//
//        for (int i = 0; i < nonDup.length(); i++) {
//            int num = Collections.frequency(Arrays.asList(str.split("")),""+nonDup.charAt(i));
//            result+= nonDup.charAt(i)+""+num;
//;        }
//        return result;
//
//
//
//    }
}
