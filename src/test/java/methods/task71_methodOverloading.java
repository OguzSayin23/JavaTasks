package test.java.methods;

public class task71_methodOverloading {
    //Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
    //Feet is the first parameter, inches is the second parameter.
    //ØYou should validate that the first parameter feet is >=0, and second parameter inches is
    //>=0 and <=12. Return -1 from the method if either of the above is not true.
    //ØIf the parameters are valid, then calculate how many centimeters comprise the feet and
    //inches passed to this method and return that value.

    //ØCreate a second method of the same name but with only one parameter inches is the
    //parameter and validate it >=0, return -1 if it is not true. But if it is valid, then calculate how
    //many feet are in the inches.
    //ØCall the other overloaded method passing the correct feet and inches calculated so that it
    //can calculate correctly.
    //ØHints : Use double for your number datatypes
    //1 inch = 2.54cm and 1 ft =12 inches

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(1,3);

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet=0;
        double inch=0;
        if (inches>=0) {
            feet=(int)inches/12;
            inch=inches%12;
            System.out.println(inches+ " inches are equal to "+feet+" feets and "+inch+ " inches");
            return calcFeetAndInchesToCentimeters(feet,inch);
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        double cm=0;
        if (feet >=0 && inch>=0 && inch<=12) {
            cm=(feet*12+inch)*2.54;
            System.out.println(feet+" feet and "+inch+" inches are equal to "+cm+ " centimeters" );
            return cm;
        }else{
            return -1;
        }
    }

}
