package week09_11_05_2022;

import java.util.Scanner;

public class Task7_in1020 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        boolean result=in1020(scan.nextInt(),scan.nextInt());
        System.out.println(result);
    }

    public static boolean in1020(int num, int num1) {
        boolean isTrue=(num>=10&&num<=20)||(num1>=10&&num1<=20);
        return isTrue;
    }


}
