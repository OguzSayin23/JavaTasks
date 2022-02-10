package test.java.methods;

public class task58_greaterNumber {
    /*
    Write a method that shows the grater number from 2 numbers
     */
    public static void main(String[] args) {
        greaterNum(88,96);
        task57_sumThree.sumThree(78,1,2);
    }
    public static void greaterNum(int a, int b){
        if (a > b) {
            System.out.println("The Greater Number "+a);
        }else{
            System.out.println("The Greater Number " + b);
        }

    }
}
