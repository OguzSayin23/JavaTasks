package test.java.interviewQuestions;

public class Factorial {
    //  Write a return method that returns the factorial number of any given number
    //        Ex:
    //                Input: 5
    //                outPut: 120
    //                because 5 * 4 * 3 * 2 * 1 = 120
    public static void main(String[] args) {
        //System.out.println(factorialNumber(5));


    }
    public static int factorialNumber(int num){
        int result =1;
        for (int i = num; i >0 ; i--) {
            result=result*i;
        }
        return result;
    }




}
