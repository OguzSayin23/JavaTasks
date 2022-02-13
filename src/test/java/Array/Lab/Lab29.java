package test.java.Array.Lab;

import java.util.Arrays;

public class Lab29 {
    //Write a function that accepts and array. For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.
    //int[] x = {2,10,3,4,20,5};
    //System.out.println(Arrays.toString(tenRun(x))); // [2, 10, 10, 10, 20, 20]
    //int[] y = {10,1,20,2};
    //System.out.println(Arrays.toString(tenRun(y))); // [10, 10, 20, 20]
    public static void main(String[] args) {
        int[] x = {2,10,3,4,20,5};
        System.out.println(Arrays.toString(tenRun(x)));

    }
    public static int[] tenRun(int[] array){
        for (int i = 0; i < array.length; i++) {

            if (array[i]%10 == 0) {

                for (int j = i; j < array.length; j++) {

                    if (array[j]%10 != 0) {
                        array[j]=array[i];
                    }else if(array[j]%10 == 0){
                        i=j;
                    }
                }
            }
        }
        return array;
    }
}
