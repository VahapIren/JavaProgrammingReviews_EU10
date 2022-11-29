package week10_11_12_2022;

import java.util.Arrays;

public class Task2_FourOrLess {
    /*Given an Array of Strings, go through and read only Strings that are 4 characters or less.

    Take those Strings and put them into a different Array

    Ex:

    Input:
            “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”

    Output:
            [ tree, loop, cat ]*/

    public static void main(String[] args) {
        String[] words = {"apples", "tree", "loop", "cat", "animal", "shortcut"};

        String[] result = fourOrLess(words);
        System.out.println(Arrays.toString(result));


    }

    private static String[] fourOrLess(String[] words) {
        int number = findTheNumberOfWordsLesThanFour(words);
        String[] array = new String[number];
        int i = 0;
        for (String word : words) {
            if (word.length() <= 4)
                array[i++] = word;
        }
        return array;
    }
        private static int findTheNumberOfWordsLesThanFour (String[]words){
            int count = 0;
            for (String word : words) {
                if (word.length() <= 4)
                    count++;
            }
            return count;
        }
    }

