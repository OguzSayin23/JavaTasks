package test.java.stringManipulation;

import java.util.Scanner;

public class task77_emoji {
    //Create a emoji program:
    //1- Check if emoji has 2 characters. If it is not, print “invalid emoji”
    //2- Valid emojis:
    //Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful, Otherwise invalid
    //Starting with  ; = > ;) Wink, ;0 Surprised, Otherwise invalid

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter emoji:");
        String emoji = sc.nextLine();
        if (emoji.length()==2 && (emoji.charAt(0)==':'||emoji.charAt(0)==';')) {
            System.out.println("valid emoji");
        }else{
            System.out.println("invalid emoji");
        }

    }
}
