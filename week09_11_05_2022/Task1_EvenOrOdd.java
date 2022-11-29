package week09_11_05_2022;

public class Task1_EvenOrOdd {
    public static void main(String[] args) {

        System.out.println(checkNumberEvenOrOdd(5));
        System.out.println(checkNumberEvenOrOdd(10));
    }
    public static String  checkNumberEvenOrOdd(int num){
        String result="";
        if (num%2==0){
            result=num+" is Even";
        }else {
            result=num+" is Odd";
        }
        return result;
    }
}
