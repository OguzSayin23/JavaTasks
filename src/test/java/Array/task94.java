package test.java.Array;

public class task94 {
    public static void main(String[] args) {
        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

        String[] arr1 = info1.split("xxx");
        String[] arr2 = info2.split("xxx");

        String password = arr1[1]+arr2[1];
        System.out.println("password = " + password);
    }
}
