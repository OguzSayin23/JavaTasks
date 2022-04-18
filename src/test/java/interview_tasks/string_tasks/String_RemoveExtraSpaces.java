package test.java.interview_tasks.string_tasks;

public class String_RemoveExtraSpaces {
     /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java
     */
     public static void main(String[] args) {
         removeExtraSpaces("  Hello world      I      love      Java    ");
     }

     public static void removeExtraSpaces(String str){
          str = str.trim();
          String result = "";
          String[] arr = str.split(" ");
          for (String each:arr) {
               if (!each.isEmpty()) {
                    result = result + " "+ each;
               }
          }
          System.out.println(result);
     }

}
