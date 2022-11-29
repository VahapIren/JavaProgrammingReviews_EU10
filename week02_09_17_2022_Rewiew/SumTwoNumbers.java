package week02_09_17_2022_Rewiew;

public class SumTwoNumbers {
    public static void main(String[] args) {
        int first = 10;//declare first number
        int second = 20;//declare second number
        int sum = first + second;//adding two variables and assing another variable

        System.out.println(sum);                   //sum.sout
        System.out.println("sum = " + sum);        //sum.soutv
        //firstnumber+secondnumber=sum(value)
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " + " + second + " = " + first + second);
        System.out.println(first + " + " + second + " = " + (first + second));

        int a = 30;
        String s = "30";
        String result = s + a;
        String result1 = s + a;


        System.out.println(s + a); //String+ int=>Concatenation


    }
}
