package week10_11_12_2022;

import java.util.Arrays;

public class Task6_Fibonacci {
    /*
    Task 6 :  Fibonacci

                Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

                Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- Yuo will put that numbers into the array then you will return it
     */
    public static void main(String[] args) {
        print();

        int input=8;

        for (int i = 1; i <= 8; i++) {
            int numbers=fibNumbers(i);
            System.out.print(numbers);
        }
        System.out.println();
        int[] result1=fibNumbersArray(input);
        System.out.println(Arrays.toString(result1));

        
        


    }

    public static int fibNumbers(int input) {

        int f1=1,f2=1,f3;
        int[] array=new int[8];
        array[0]=f1;
        array[1]=f2;

        for (int i = 2; i < input; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            array[i]=f3;
        }
        return array[input-1];




    }

    public static int[] fibNumbersArray(int input){
        int f1=1,f2=1,f3;
        int[] array=new int[input];
        array[0]=f1;
        array[1]=f2;

        for (int i = 2; i < input; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            array[i]=f3;
        }
        return array;
    }

    public static void print() {
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21");
    }
}
