package test.java.stringManipulation;

public class Lab11 {
    /*Return the number of times that the string "hi" appears anywhere in the given string.
    countHi("abc hi ho") →1
    countHi("ABChi hi") →2
    countHi("hihi") →2
    */
    public static void main(String[] args) {
        countHi("abc hi ho");
        countHi("ABChi hi");
    }

    public static void countHi(String str){
        int k = str.length();
        int count = 0;
        for (int i = 0; i < k-1; i++) {
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }

        }
        System.out.println(count);
    }
}
