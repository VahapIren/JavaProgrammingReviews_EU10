package week06_10_15_2022_Rewiew;

public class T2_CountWords {
    public static void main(String[] args) {

        String str="Java is java in everywhere in Java";
        int counter=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                counter++;

            }
        }
        System.out.println(counter+1);

    }
}
