package week16_12_24_2022.exections;

import week15_12_17_2022.method_overriding.task3.Employee;

public class RunTimeExceptionsExamples {
    static Employee employee;
    public static void main(String[] args) {
 //Arithmetic Exceptions

        for (int i = 5; i >=1 ; i--) {
            System.out.println(60/i); //java.lang.ArithmeticException
        }
 //NullPointerException

        //System.out.println(employee.salary()); //java.lang.NullPointerException
                                                //if you want to reach object fields oe methods you have to initialize it

 //NumberFormatException
        String str="Adam 123.";
        //String s=str.substring(str.indexOf(" ")+1);
        //System.out.println(Integer.parseInt(s));

//ArrayIndexOutOfException

        int[] array={1,2,3,4};
        //System.out.println(array[3]); //java.lang.ArrayIndexOutOfBoundsException

//StringIndexOutOfException

        //StringIndexOutOfBoundsException
        String name="Adam";

        //  System.out.println(name.charAt(4)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 4






    }
}
