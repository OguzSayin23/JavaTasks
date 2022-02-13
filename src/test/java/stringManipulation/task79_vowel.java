package test.java.stringManipulation;

public class task79_vowel {
    //Write a program to print only vowel (a,e,o,i,u) in given string
    //String word = "CybertekSchool";
    //Output: e,e,o,o
    public static void main(String[] args) {
        String word = "CybertekSchool";
        String output = "";
        int count = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'o'||word.charAt(i) == 'i'||word.charAt(i) == 'u') {
                output+=word.charAt(i);

            }
        }
        String output2 = "";
        int k = output.length();
        for (int i = 0; i < k; i++) {
            if(i<k-1){
                output2= output.charAt(i)+",";System.out.print(output2);
            }else if(i==k-1){
                output2= output.charAt(i)+"";System.out.print(output2);
            }



        }

    }
}
