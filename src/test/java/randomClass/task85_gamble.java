package test.java.randomClass;

import java.util.Random;

public class task85_gamble {
    //Write a program that plays a simple dice game between the computer and the user. When the program runs,
    // a loop should repeat 10 times. Each iteration of the loop should do the following:
    //      Ø   Generate a random integer in the range of 1 thru 6. This is the value of the computer’s dice.
    //      Ø   Generate another random integer in the range of 1 thru 6. This is the valueof the user’s dice.
    //      Ø   The dice with the highest value wins. (In case of a tie, there is no winner)
    //As the loop iterates , the program should keep count of the number of times the computer wins,
    // and the number of times that the user wins. After the loop performs all of its iterations,
    // the program should display who was the grand winner, the computer or the user.
    public static void main(String[] args) {
        Random rd = new Random();
        int compWin = 0, userWin = 0;
        for (int i = 0; i < 10; i++) {
            int compDice = rd.nextInt(6)+1;
            int userDice = rd.nextInt(6)+1;
            System.out.println("compDice :"+compDice+", userDice :" + userDice);


            if (compDice > userDice) {
                compWin++;
            }else if(userDice>compDice){
                userWin++;
            }
        }
        System.out.println("compWin :" + compWin + ", userWin :"+userWin);
        if (userWin>compWin) {
            System.out.println("congragulations, you are grand winner");
        }else if (compWin > userWin) {
            System.out.println("computer is grandwinner");
        }else if (compWin == userWin) {
            System.out.println("fellowship continues");
        }


    }
}
