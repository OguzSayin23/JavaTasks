package test.java.methods;

public class task68_retirement {
    //Write two methods:
    //1-calculateAge(yearBirth); and returns the age
    //2-yearsUntilRetirement(name,year); and displays in the console following:  “Mike retires
    //in 36 years”
    //Example: yearsUntilRetirement(“Mike”,1990);
    public static void main(String[] args) {
        yearsUntilRetirement("Oguz",1982);
    }

    public static void yearsUntilRetirement(String name, int year){
        int ret = 65-calculateAge(year);
        System.out.println(name+ " retires in "+ret+" years");
    }

    public static int calculateAge(int yearBirth){
        return 2022-yearBirth;
    }
}
