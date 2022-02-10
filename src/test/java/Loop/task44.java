package test.java.Loop;

public class task44 {
    /*
    Your friend Mike Smith just inherited a European sports car from his uncle. Mike lives in
the USA, and he is afraid he will get a speeding ticket because the car’s speedometer
indicates kilometers per hour(KPH). He has asked you to write a program that displays a
table of speeds in kilometers per hour with their values converted to miles per
hour(MPH). The formula for converting KPH to MPH is:
MPH = KPH * 0.6214
The table that your program displays should show speeds from 60 kilometers per hour
thru 130 kilometers per hour, in increments of 10, along with their values converted to
miles per hour. The table should look like something like this:
     */
    public static void main(String[] args) {
        System.out.println("KPH     MPH");
        for(int i=60;i<=130;i+=10){
            double k=i*0.6214;

            if(i>=100){
                System.out.println(i+"     "+k);
            }else{
                System.out.println(i+"      "+k);
            }
        }
    }
}
