package test.java.interviewQuestions.fromMuhtar;

public class String_ReverseSecondWord {
     /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */
     public static void main(String[] args) {
         String str = "I Love Java";

         System.out.println(withoutX2("xaxb"));
         //System.out.println(reverseSecondWord(str));
     }


    public static String withoutX2(String str) {


            if(str.charAt(0)=='x') {
                str = str.replace(str.charAt(0) + "", "");
            }
             if (str.charAt(1)=='x') {
                str = str.replace(str.charAt(1)+"","");
            }

        return str;
    }


     public static String reverseSecondWord(String str){
         String[] array = str.split(" ");
         String secondReverse = "";
         for (int i = array[1].length()-1; i >=0; i--) {
             secondReverse+=array[1].charAt(i);
         }
         return array[0]+" "+secondReverse+" "+array[2];

     }


}
