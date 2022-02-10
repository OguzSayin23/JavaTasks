package test.java.methods;

public class task61_ageCalculator {

//    Write a method that accepts birthyear and displays the age in the console.
//    Sample output:
//    calculateAge(2000) -- > 18
    public static void main(String[] args) {
        ageCalculator(1982);
    }

    public static void ageCalculator(int birthYear){
        System.out.println("you are "+(2022-birthYear)+" years old");
    }
}
