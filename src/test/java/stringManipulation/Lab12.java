package test.java.stringManipulation;

public class Lab12 {
    //Return true if the string "cat" and "dog" appear the same number of times in the given
    //string.
    //catDog("catdog") →true
    //catDog("catcat") →false
    //catDog("1cat1cadodog") →true
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str){

        int k = str.length();
        int cat = 0;
        int dog = 0;

        for (int i = 0; i <k-2 ; i++) {
            if(str.substring(i,i+3).equals("cat")){
                cat++;
            }else if(str.substring(i,i+3).equals("dog")){
                dog++;
            }
        }
        if (dog == cat) {
            return true;
        }else{
            return false;
        }
    }
}
