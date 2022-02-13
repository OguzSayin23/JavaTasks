package test.java.Array;

public class task92 {
    //Write a Java program to store numbers 1 to 10 in an array using data instantiation. Then write a
    //for loop to multiply each member of above array by 19, this way you will get table of 19 stored
    //in the above array. Finally write another for loop to print all the array elements.
    //ØYou should get the following output:
    //19
    //38
    //57
    //76
    //95
    //114
    //133
    //152
    //171
    //190
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int[] arr19 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr19[i]=arr[i]*19;
            System.out.println(arr19[i]);
        }

    }
}
