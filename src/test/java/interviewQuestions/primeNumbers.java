package test.java.interviewQuestions;

import test.java.methods.task69_primeNumber;

public class primeNumbers {
    //find first n prime numbers

    public static void main(String[] args) {
        showPrimeNumbers(11);
    }

    public static void showPrimeNumbers(int n){
       outer: for (int i = 0; i <=n ; ) {
                for (int j = 2; j <Integer.MAX_VALUE ; j++) {
                     if(task69_primeNumber.isPrime(j)){
                         if(i<n-1){
                             System.out.print(j+", ");
                         }else if(i==n-1){
                             System.out.print(j);
                         }
                         i++;
                         if(i==n){
                         break outer;
                    }
                }
            }
        }
    }
}
