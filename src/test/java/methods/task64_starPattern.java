package test.java.methods;

public class task64_starPattern {
    //Write a program that accepts a number and print the star patterns according to that number
    //Sample Output:
    //printPattern(5);
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        starPattern(5);
        starPattern(10);
    }

    public static void starPattern(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
