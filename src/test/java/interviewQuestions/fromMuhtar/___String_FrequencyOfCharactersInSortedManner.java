package test.java.interviewQuestions.fromMuhtar;

import java.util.Map;
import java.util.TreeMap;

public class ___String_FrequencyOfCharactersInSortedManner {

       /*
    Return the frequency of each character in the given string in Sorted manner
        Ex:
            Input: DDDAACCCCCCB
            Output: A2B1C6D3
     */

    public static void main(String[] args) {
        String str = "DDDAACCCCCCB";
        str = sort(str);
        str = frequencyOfChar(str);
        System.out.println("str = " + str);

        System.out.println(frequencyOfCharactersInSortedManner("kkkk2CCCTqqqqIIIOp111"));

    }

    public static String frequencyOfCharactersInSortedManner(String str){
        //str = sort(str);
        //return frequencyOfChar(str);
        String result = "";
        TreeMap<String,Integer> map = new TreeMap<>();

        for (String each:str.split("")) {
            if (map.containsKey(each)) {
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        for (Map.Entry<String,Integer> each: map.entrySet()) {
            result = result + each.getKey() + each.getValue();
        }
        return result;
    }

    public static String frequencyOfChar(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!result.contains(""+str.charAt(i)) ) {
                result+=str.charAt(i)+""+count;
                str = str.replaceFirst(""+str.charAt(i),"");
            }
        }
        return result;
    }


    public static String sort(String str){
        String sort = "";
        while (str.length()>0){
            int min = Integer.MAX_VALUE ;
            String dmmy = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < min) {
                    min = str.charAt(i);
                    dmmy = ""+str.charAt(i);
                }
            }
            sort = sort + dmmy;
            str = str.replaceFirst(dmmy,"");
        }
        return sort;
    }
}
