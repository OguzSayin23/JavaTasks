package test.java.interview_tasks.array_tasks;

public class Array_FirstUniqueElement {
        /*
    write a program that can find the first duplicated element from the array
     */
        public static void main(String[] args) {
            int[] arr = {8, 7, 2, 5, 3, 1, 2, 7};
            System.out.println(firstDuplicated(arr));
        }

        public static int  firstDuplicated(int[] array){
            int firstDup = 0;

            for (int i = 0; i < array.length; i++) {
                int frq = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i]==array[j]) {
                        frq++;
                    }
                }
                if (frq > 1) {
                    firstDup = array[i];
                }
            }
            return firstDup;
        }

}
