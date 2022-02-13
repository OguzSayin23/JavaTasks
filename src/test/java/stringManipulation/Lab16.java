package test.java.stringManipulation;

public class Lab16 {
    //Given a string, return a string length 2 made of its first 2 chars. If the string length is less
    //than 2, use '@' for the missing chars.
    //atFirst("hello") →"he"
    //atFirst("hi") →"hi"
    //atFirst("h") →"h@"
    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(" "));
    }

    public static String  atFirst(String str) {
        String retur = "";
        if (str.length() == 0) {
            retur= "@@";
        } else if (str.length() == 1) {
            retur= str + "@";
        } else if (str.length() >= 2) {
            retur= str.substring(0, 2);
        }
        return retur;
    }
}
