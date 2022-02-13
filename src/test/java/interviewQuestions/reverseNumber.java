package test.java.interviewQuestions;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int num){
        int result = 0;
        if(num<10&&num>0){
            return num;
        }
            while (num!=0){
               result = result*10 + num%10;

               num = num/10;

        }
        return result;
    }

}
