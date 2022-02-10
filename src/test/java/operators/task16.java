package test.java.operators;

public class task16 {
    /*
    Write a Java program that displays the area and perimeter of a circle that has a radius of
5.5 using the following formulas:
perimeter = 2 * radius * 𝜋
area = radius * radius * 𝜋
     */
    public static void main(String[] args) {
        int radius = 45;
        double perimeter = 2*radius*Math.PI;
        double area = Math.pow(radius,2)*Math.PI;
        System.out.println("perimeter = "+Math.round(perimeter));
        System.out.println("area = " + Math.round(area));
    }
}
