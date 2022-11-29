package week10_11_12_2022;

import java.util.Arrays;

public class Task3_Solution2 {
    public static void main(String[] args) {

        String[] array={"123", "134", "513"};
        int[] result=new int[array.length];
        int index=0;

        for (String each : array) {   //get each string
            System.out.println(each);
            String [] eachDigit=each.split("");  //get each digit

            int total=0;
            for (String s : eachDigit) {
                int i=Integer.parseInt(s);
                total+=i;
            }
            System.out.println(Arrays.toString(eachDigit));
            System.out.println(total);
            result[index++]=total;
        }
        System.out.println(Arrays.toString(result));



    }
}
