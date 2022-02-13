package test.java.stringManipulation;

public class task81 {
    public static void main(String[] args) {
        //Write a method that accept the date with time and creates a timeStamp for your automation
        //report.
        String time= "10/10/2019 14:59:00";
        timeStamp(time);
    }

    public static void timeStamp(String time){
        System.out.println(time.replace("/","").replace(" ","").replace(":",""));
    }
}
