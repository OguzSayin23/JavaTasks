package test.java.interviewQuestions;

public class firstUniqueChar {
    /*
        write a program that can return the first non-repeated character from a string
         */
    public static void main(String[] args) {
       System.out.println(firstUniqueChar("asdasdavofvafvwq"));
        System.out.println(firstNonRepeatedChar("asdaosdavfvafvwq"));
    }

    public static char firstUniqueChar(String str){
        char flag =0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                flag =  str.charAt(i);
                break;
            }

        }
        return flag;
    }



    public static char firstNonRepeatedChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
}

