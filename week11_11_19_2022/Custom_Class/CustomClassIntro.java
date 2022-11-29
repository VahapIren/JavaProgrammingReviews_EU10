package week11_11_19_2022.Custom_Class;

public class CustomClassIntro {
    public static void main(String[] args) {

        //how to create an object

        //Class Name referance=new constructor

        SecondClass secondClass=new SecondClass();
        FirstClass firstObject=new FirstClass(4,"Hello",secondClass);

        //how to get attributes
        System.out.println(firstObject.a);
        System.out.println(firstObject.b);

    }
}
