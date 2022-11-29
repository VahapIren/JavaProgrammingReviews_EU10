package week06_10_15_2022_Rewiew;

public class T1_CountSpecificWord {
    public static void main(String[] args) {
        String str="Java is java in everywhere in Java";
        String word="java";
        int counter=0;
        for (int i = 0; i <= str.length()-word.length(); i++) {
            String each=str.toLowerCase().substring(i,i+4);
            if (each.equalsIgnoreCase(word)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
