package test.java.methods;

public class task63_celciusConverter {
    //Write a function that accepts Fahrenheit and displays the Celcius in the console.
    //Sample Output:
    //calculateCelcius(32)  -- > 0
    //calculateCelcius(50)  -->  10
    public static void main(String[] args) {
        converter(38);
        converter(32);
        converter(50);
    }

    public static void converter(int fahrenheit){
        double cel = (double)(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+" F is equal to " + cel + " celcius");
    }

    }
//}
