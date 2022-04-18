package test.java.interview_tasks.string_tasks;

public class String_FrequencyOfCharacters {
     /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
     public static void main(String[] args) {


         String str = "AAABBCDDA";
         sort(str);
         String nonDup = "";
         String result = "";

         for (int i = 0; i < str.length(); i++) {
             if (!nonDup.contains(""+str.charAt(i))) {
                 nonDup+=str.charAt(i);
             }
         }

         for (int i = 0; i < nonDup.length(); i++) {
             int count=0;
             for (int j = 0; j < str.length(); j++) {
                 if (nonDup.charAt(i)==str.charAt(j)) {
                     count++;
                 }
             }
             result+=""+nonDup.charAt(i)+count;
         }

         System.out.println(result);
     }

     public static void sort( String str){
            char[] arr = str.toCharArray();

         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if (arr[i]>arr[j]) {
                     char temp = arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
         System.out.println(arr);
     }
}
