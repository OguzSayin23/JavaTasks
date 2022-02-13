package test.java.Array.Lab;

public class Lab19 {
    //Write a method that accepts an array and prints the total of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    //int[] x = {1,2,2} = > 5
    //int[] y = {1, 2, 2, 6, 99, 99, 7}  = > 5
    //int[] a = {1,1,6,7,2} = > 4
    //int[] b = {1,1,6,2} = > 2
    //int[] c = {1,2,2,6,99,99,7,3,4} = > 12
    public static void main(String[] args) {
        int[] c = {1,2,2,6,99,99,7,3,4};
        System.out.println(totalIgnoreSection(c));
    }
    public static int totalIgnoreSection(int[] array){
        int sum = 0;
        int ign1 = 0;
        int ign2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==6) {
               ign1 = i;
            }
            if (array[i] == 7) {
                ign2 = i;
            }
        }
        for (int i = 0; i < ign1; i++) {
            sum+=array[i];
        }
        for (int i = ign2+1; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
