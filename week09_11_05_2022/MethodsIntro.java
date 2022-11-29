package week09_11_05_2022;

public class MethodsIntro {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        System.out.println("--------------");

        printHello5Times();

        int result=sum(5,6);

        multiplyWith2AndPrint(result);

        System.out.println(sum(12,23));



    }

    public static void   multiplyWith2AndPrint(int result) {
        System.out.println(result*2);


    }

    public static void printHello5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }
}
