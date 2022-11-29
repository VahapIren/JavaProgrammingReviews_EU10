package week08_10_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        int[] arrayName={1,2,3,4,5,6};

        int[] array=new int[10];
        array[0]=10;
        array[1]=10;
        array[2]=10;
        array[3]=10;
        array[4]=10;
        array[5]=10;
        array[6]=10;
        array[7]=10;
        array[8]=10;
        array[9]=10;

        System.out.println(Arrays.toString(array));
        char[] letters={'B','S','D','Y'};
        System.out.println(Arrays.toString(letters));
        System.out.println("Vahap");
        System.out.println(letters[1]);
        System.out.println(letters[0]);
        System.out.println(letters[3]);

        int[] numbers={2,3,1,10,5};
        int z=5;

        for (int i=5;i>0;i--){
            z+=i;
        }
        System.out.println(z);
        String str="batch 21";
        str.trim();
        boolean A=str.isEmpty();
        System.out.println(A);
        String ta="A ";
        ta=ta.concat("B ");
        String tb="C ";
        ta=ta+tb;
        ta.replace("C","D");
        ta=ta+tb;
        System.out.println(ta);
        int d=str.indexOf(" ");
        System.out.println(d);
        int Z=str.trim().length();
        System.out.println(Z);
        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2 is:"+s1==s2);





    }
}
