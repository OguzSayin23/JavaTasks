package test.java.interview_tasks.array_tasks;

import java.util.HashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement {
        /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */
        public static void main(String[] args) {
            String[] testArray = {"Apple","Banana","Apple","Cherry"};
            FrequencyOfEachElement(testArray);
        }
        public static void FrequencyOfEachElement(String[] str){
            Map<String,Integer> element = new HashMap<>();
            for (String each:str) {
                int count = 0;
                for (String each1:str) {
                    if (each == each1) {
                        count++;
                    }
                }
                element.put(each,count);
            }
            for (Map.Entry<String,Integer> entry : element.entrySet()) {
                System.out.println(entry);
            }

        }
}
