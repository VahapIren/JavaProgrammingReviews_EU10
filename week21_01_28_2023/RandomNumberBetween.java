package week21_01_28_2023;

import java.util.ArrayList;

public class RandomNumberBetween {

    public static void main(String[] args) {

        int[] numbers ={3,5,7,9,11,13,15,17,21};

        int total= (numbers.length+1)*((numbers[numbers.length-1]+numbers[0])/2);
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];

        }
        System.out.println((total - sum));

        System.out.println("--------------------------------------------------");

        String str="AAAABBBBBBBBBB";
        int countA=0;
        int countB=0;
        String[] arr =str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("A")){
                countA++;
            }else
                countB++;
        }
        int result=countA-countB;
        System.out.println(Math.abs(result));

        System.out.println("-----------------------------------------------");

        // generate random numbers within x to y
//        int max = 100;
//        int min = 25;
//        int range = max - min + 1;
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10;) {
            int rand = (int) (Math.random() * 12) + 1;

            if (!list.contains(rand)){
                list.add(rand);
                i++;
             }
        }
        // Output
        System.out.println(list);
    }


}
