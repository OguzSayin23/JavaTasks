package test.java.interviewQuestions;

public class frequencyOfCharacter {
    //Write function that can find the frequency of characters
    //            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacter("AAABBCDD"));
    }

    public static String frequencyOfCharacter(String str){
        String result = "";

        for (int i = 0; i < str.length() ; ) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            result+=str.charAt(i)+""+count;
            str = str.replace(""+str.charAt(i),"");
        }
        return result;
    }
}

