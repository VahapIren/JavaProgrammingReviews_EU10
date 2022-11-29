package week10_11_12_2022;

import java.util.Arrays;

public class Task4_HidePasswords {
    public static void main(String[] args) {
        /*
        Task 4 : Hide Passwords

                    Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
                    
                    Ex:
                    
                    Input:
                    {"one", "hi", "hold}
                    
                    Output:
                    [ ***, **, **** ]
         */
        String [] arr={"one","hi","hold"};
        String [] result=hidePassword(arr);

        System.out.println(Arrays.toString(result));
    }

    public static String[] hidePassword(String[] arr) {

        String [] results =new String[arr.length];
        int index=0;
        for (String each : arr) {
            String result=convertLettersToStars(each);   //convert letters to stars
            results[index++]=result;
            System.out.println(Arrays.toString(results));
        }
        return results;
    }

    public static String convertLettersToStars(String s) {

        String temp="";
        for (int i = 0; i < s.length(); i++) {
            temp+="*";

        }
        return temp;
    }
}
