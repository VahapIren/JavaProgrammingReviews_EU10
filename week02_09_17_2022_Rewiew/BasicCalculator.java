package week02_09_17_2022_Rewiew;

public class BasicCalculator {
    public static void main(String[] args) {
        /*
        3. Create a class named BasicCalculator. write a Java program to print the sum (addition),
        multiply, subtract, divide and remainder of two numbers.
         */
        double num1 =20;
        double num2 =6;
        double sum= num1 + num2;
        double subtract= num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
        double reminder= num1 % num2;

        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multıply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("reminder = " + reminder);


    }
}
