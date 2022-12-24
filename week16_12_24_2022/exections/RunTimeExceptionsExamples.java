package week16_12_24_2022.exections;

import week15_12_17_2022.method_overriding.task3.Employee;

public class RunTimeExceptionsExamples {
    static Employee employee;
    public static void main(String[] args) {
 //Arithmetic Exceptions

        try {
            for (int i = 5; i >=0 ; i--) {
                System.out.println(60/i); //java.lang.ArithmeticException
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //  e.printStackTrace();
        }
        //NullPointerException

        try {
            System.out.println(employee.salary()); //java.lang.NullPointerException
        } catch (Exception e) {
            e.printStackTrace();
        }
        //if you want to reach object fields oe methods you have to initialize it

 //NumberFormatException
        String str="Adam 123.";
        String s=str.substring(str.indexOf(" ")+1);
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

//ArrayIndexOutOfException

        int[] array={1,2,3,4};
        try {
            System.out.println(array[6]); //java.lang.ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//StringIndexOutOfException

        //StringIndexOutOfBoundsException
        String name="Adam";

        try {
            //TODO I will find the solution later lets skip it

            System.out.println(name.charAt(4)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 4
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
