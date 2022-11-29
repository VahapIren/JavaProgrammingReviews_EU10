package week02_09_17_2022_Rewiew;

public class TemperatureConverter {
    public static void main(String[] args) {
        /*
        6. Create class named "TemperatureConverter" and make a main method

                        - Write a Java program to convert temperature from Fahrenheit to Celsius degree
                        - Input a degree in Fahrenheit: 212

                            Formula :         C = (5(F-32))/9

                            Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */
        double fah =212;
        double celcius =(5*(fah -32))/9;
        System.out.println( fah +" degree Fahrenheit is equal to " + celcius +" in Celcius");





    }
}
