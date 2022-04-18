package test.java.interviewQuestions.fromInterview;

import java.util.*;

public class FrqStringInAnArray {
    //QUESTION: FIND THE FREQUENCY OF THE STRINGS THAT ARE IN AN ARRAY. RETURN TYPE HAS TO BE LIST**
    //String[] word = {"Java", "Java", "c#", "Python", "Python","c#","kemput"};
    public static void main(String[] args) {
        String[] word = {"Java", "Java", "c#", "Python", "Python","c#","kemput"};
        System.out.println(frqStringInAnArray(word));
        for(Map.Entry<String,Integer> each : frqStringInAnArray(word).entrySet()){
            System.out.println(each.getKey()+" = "+each.getValue());

        }

    }

    public static Map<String,Integer> frqStringInAnArray(String[] array){
        Map<String,Integer> frequencyOfString = new LinkedHashMap<>();
        for (String each1:array) {
            int count = 0;
            for (String each2:array) {
                if (each1.equals(each2)) {
                   count++;
                }
            }
            frequencyOfString.put(each1,count);
        }

        return frequencyOfString;
    }
}



/*
 public static Map<String, Integer> frequencyOfEachElem(String[] arr) {

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {

            int count = 0;

            for (String eachEl : arr) {
                if (each.equalsIgnoreCase(eachEl)) {
                    count++;
                }
            }
            result.put(each, count);
        }
        return result;
    }
 */

/*
public static void main(String[] args) {

        String[] word = {"Java", "Java", "c#", "Python", "Python", "c#", "Jewel"};
        List<String> list = new ArrayList<>(); //store here
        for (int j = 0; j < word.length; j++) { // assign different element to inner loop

            String element = word[j]; // "java"
            int frequency = 0;


            for (int i = 0; i < word.length; i++) { // inner loop finds the frequency
                if (word[i].equals(element)) {
                    frequency++;

                }

            }
            // list.add("" + word[j] + frequency);
            list.add("" + frequency);


        }
        System.out.println(list);
    }

}

output:
[2, 2, 2, 2, 2, 2, 1]
 */