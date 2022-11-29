package week10_11_12_2022;

public class Task1_FindTheSentence {

        /*Task 1 : Find the word

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        Write a method that returns : Welcome To Core Java*/

        public static void main(String[] args) {
            String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
            getSentence(str);

    }

    private static void getSentence(String str) {
            String temp="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch))
                temp+=' ';
            if (Character.isAlphabetic(ch))//isAlphabethic use english letter
                temp+=ch;                  //isLetter use for other all letter
        }
        System.out.println(temp);
    }
}
