package test.java.stringManipulation;

public class task80 {
    //Write a method that accepts 2 strings(str1,str2)  and prints the position index of the str2
    //if str2 is existing in str1.If it doesn’t exist, print “not found”
    //checkedString(“Your order confirmation number is XYZ”,  “confirmation”) ;
    public static void main(String[] args) {
        String str1 = "Your order confirmation number is XYZ";
        String str2 = "confirmation";
        if(str1.contains(str2)){
            System.out.println(str1.indexOf(str2));
        }else{
            System.out.println("not found");
        }
    }
}
