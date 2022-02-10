package test.java.methods;

public class task66_distanceCal {
    //The distance a vehicle travels can be calculated as follows:
    //Distance = Speed * Time
    //Write a method named distance that accepts a vehicle’s speed and time as arguments,
    //and return the distance the vehicle has traveled.
    public static void main(String[] args) {
        System.out.println(distance(66,15));
    }

    public static int distance(int speed, int time){
        int distance = speed*time;
        return distance;
    }
}
