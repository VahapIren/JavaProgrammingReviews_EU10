package week09_11_05_2022;

public class Task5_DifferenceWith21 {
    public static void main(String[] args) {

        int result1=diff21(19);
        System.out.println(result1);
        int result2=diff21(23);
        System.out.println(result2);
    }

    public static int diff21(int num) {
        int result;
        if (num<21)
            result=21-num;
        else
            result=2*(num-21);
        return result;

        //return (number<21)?21-num:(num-21)*2;

    }


}
