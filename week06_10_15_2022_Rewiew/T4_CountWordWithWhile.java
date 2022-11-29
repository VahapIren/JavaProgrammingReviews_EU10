package week06_10_15_2022_Rewiew;

import java.util.Locale;

public class T4_CountWordWithWhile {
    public static void main(String[] args) {
        String str="Java is java in everywhere in Java";
        String word="Java";
        int counter=0;
        str=str.toLowerCase();
        word=word.toLowerCase();
        while (str.contains(word)){
            counter++;
            str=str.replaceFirst(word,"");
        }
        System.out.println(counter);
    }
}
