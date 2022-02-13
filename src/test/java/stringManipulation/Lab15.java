package test.java.stringManipulation;

public class Lab15 {
    //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
    //with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    //hasBad("badxx") →true
    //hasBad("xbadxx") →true
    //hasBad("xxbadxx") →false
    public static void main(String[] args) {
        System.out.println(hasBad("bax"));
        System.out.println(hasBad("bad"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }
    public static boolean hasBad(String str){

        if (str.length()<=2) {
            return false;
        }else if (str.length() == 3 && str.substring(0,3).equals("bad")) {
            return true;
        }else if(str.length()>3 && (str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad"))){
            return true;
        }else {
            return false;
        }
    }
}
