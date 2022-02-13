package test.java.wrapperClass_Parsing;

public class task96 {
    //Write a program to output: 72 degree is equal to 22.22 celcius
    public static void main(String[] args) {

        String str="today weather is sunny and 72 degree. It is a perfect day to practice java.";
        int k = str.indexOf("72");
        String a = str.substring(k,k+2);
        int q = Integer.parseInt(a);
        System.out.println(q);
        System.out.println(q+" degree is equal to "+((q-32)*5/9)+" celcius");

    }
}
