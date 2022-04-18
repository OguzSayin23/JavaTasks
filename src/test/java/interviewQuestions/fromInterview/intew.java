package test.java.interviewQuestions.fromInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class intew {

    /*
    consequently process 1,2,3 gives error. Find error elements.
    String[] logs = {"A:1",
                    "A:1",
                    "A:2",
                    "A:3",
                    "A:1",
                    "B:1",
                    "B:1",
                    "B:2",
                    "B:3",
                    "A:3",
                    "C:3",
                    "C:2",
                    "C:1",
                    "B:1",
                    "C:1"
            };
            */
    public static void main(String[] args) {

        String[] logs = {"A:1","A:1","A:2","A:3","A:1",
                "B:1","B:1","B:2","B:3",
                "A:3",
                "C:3","C:2","C:1",
                "B:1",
                "C:1" };

        String processA="", processB="", processC = "";
        Map<String,String> map = new LinkedHashMap<>();
        for (String each:logs) {
            if (each.startsWith("A")) {
                processA+=each.charAt(2);
                map.put("A",processA);

            }else if (each.startsWith("B")) {
                processB+=each.charAt(2);
                map.put("B",processB);

            }else if (each.startsWith("C")) {
                processC+=each.charAt(2);
                map.put("C",processC);
            }
        }
        for (Map.Entry<String,String> each : map.entrySet()){
            if (each.getValue().contains("123")) {
                System.out.println(each.getKey() +"-->ERROR");
            }
        }


    }
}

/*
// will create 3 Strings to store Button sequence
            String u1="", u2="", u3="";
            //Will start a llop to store my sequences for each user
            for (String each : logs) {
//  If current value ends with 1 than will store it to String for user 1 sequence
                if (each.endsWith("1")) u1 += ""+each.charAt(0);
                if (each.endsWith("2")) u2 += ""+each.charAt(0);
                if (each.endsWith("3")) u3 += ""+each.charAt(0);
            }
            // Will create a map for storing all the logs divided by user
            Map<Integer, String> logsMap=new HashMap<>();
            // Putting each users logs to map
            logsMap.put(1, u1);
            logsMap.put(2, u2);
            logsMap.put(3, u3);
            // Will start entrySet loop for my map. To check if we have ABC pattern
            // And if there is a ppatern then will print out the user
            for (Map.Entry<Integer, String> entry : logsMap.entrySet()) {
                if (entry.getValue().contains("ABC")) {
                    System.out.println("User "+entry.getKey()+" Experienced error");
                }
   }
 */