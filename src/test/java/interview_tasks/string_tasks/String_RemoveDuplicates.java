package test.java.interview_tasks.string_tasks;

public class String_RemoveDuplicates {
     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
     public static void main(String[] args) {
          removeDup("AAABBBCCC");
     }
     public static void removeDup(String str){
          String result = "";
          for (int i = 0; i < str.length()-1; i++) {
               if (!result.contains(str.substring(i,i+1))) {
                   result+= str.substring(i,i+1);

               }
          }
          System.out.println(result);
     }
}
