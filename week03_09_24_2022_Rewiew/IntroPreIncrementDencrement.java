package week03_09_24_2022_Rewiew;

public class IntroPreIncrementDencrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println("a = " + a);
        System.out.println(++a);
        System.out.println(a++);
        int x=10;
        int number=x++ + 100;
        System.out.println("number = " + number);
        number=++x+100;
        System.out.println("number = " + number);
    }
}
