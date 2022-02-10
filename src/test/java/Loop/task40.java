package test.java.Loop;

import test.java.methods.task56_coverKM;

public class task40 {
    /*
    Write a program that displays all even numbers between 1-100 in same line
     */
    public static void main(String[] args) {
        for(int even=2;even<=100;even+=2){
            System.out.print( even+", ");
        }
        System.out.println();
        task56_coverKM.coverKm(80);
    }

}
