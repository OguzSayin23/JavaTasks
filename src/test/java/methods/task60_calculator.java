package test.java.methods;

public class task60_calculator {
    //Write a method that accepts 3 parameters:
    //1- number
    //2- number
    //3- operator(-,+,*,/)
    //Sample output:
    //calculator(6,3, “+”)   -- > 9
    //calculator(6,3, “-”)   -- >  3
    //calculator(6,3, “*”)   -- > 18
    //calculator(6,3, “/”)   -- > 2
    public static void main(String[] args) {
        calculator(15,5,"/");
    }

    public static void calculator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
