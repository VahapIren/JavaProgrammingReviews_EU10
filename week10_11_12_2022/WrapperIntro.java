package week10_11_12_2022;

public class WrapperIntro {
    public static void main(String[] args) {

        //class of primitive data types
        int a=2;
        Integer b=122;
        Integer c=new Integer(12);
        String number1="100";
        String number2="200";
        String result=number1+number2;
        int result1=Integer.parseInt(number1);
        int result2=Integer.parseInt(number2);
        System.out.println(result1+result2);
        // what is the difference with parseInt() and valueOf()
        //valueOf() returns an Object (Wrapper class)
        //parseInt() returns primitive data type

        int i=Integer.parseInt("123");
        Integer integer=Integer.valueOf("123");
        System.out.println("i = " + i);
        System.out.println("integer = " + integer);

        //autoboxing primitive----->object(wrapper class)
        //unboxing object(wrapper)--->primitive

        Integer integer2=12;
        int i2=integer2;  //unboxing object(wrapper)--->primitive






    }
}
