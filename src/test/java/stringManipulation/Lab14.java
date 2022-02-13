package test.java.stringManipulation;

public class Lab14 {
    //Given a string, return true if it ends in "ly".
    //endsLy("oddly") →true
    //endsLy("y") →false
    //endsLy("oddy") →false
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    public static boolean endsLy(String str){
        if(str.length()>1 && str.substring(str.length()-2).equals("ly")){
            return true;
        }else {
            return false;
        }

    }
}
