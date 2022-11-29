package week02_09_17_2022_Rewiew;

public class VariablesIntro {
    public static void main(String[] args) {
        int age=34;
        //byte myByte=129; we cant because byte is -128 to 127

        short myShort=12;
        long myLong=11112345677l; //if you want to int to long we need to put "l"
        //default data type for compiler is integer

        double myDouble=25.5;
        double myDouble1=25;//what is output 25.0
        System.out.println("myDouble1 = " + myDouble1);

        float myFloat=25f;
        float myFloat1=25F;
        float myFloat2=(float) 25;// 3 different way

        long l=20;
        int i= (int) l;//explicit casting -we have to say compiler l is int
        double d=l;//implicit casting done by compiler


        //implicit casting assinging small datatype to bigger one

         int a=20;
         long b=a;             //implicit casting


        // explicit casting assigning bigger datatype to smaller one
        a= (int) b;             //exlicit casting


        //addition
        /*
        number+number=number
        int+int=int
        int+double=double
        int+short=int

         */

        //Concatenation
        /*
        String+anything=>String
        123+Adam=123Adam
        12+13+Adam==>25Adam  Compiler proceed top to=> bottom and left to=> right
         */









    }
}
