package test.java.wrapperClass_Parsing;

public class task97 {
    //Write a method that returns : Welcome to core Java

    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' '){
                s+=str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
