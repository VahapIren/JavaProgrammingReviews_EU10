package week06_10_15_2022_Rewiew;

public class T3_PrintWords {
    public static void main(String[] args) {
        String str="Java is java in everywhere in Java";
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' '){
                temp+=str.charAt(i);
            }
            if (str.charAt(i)==' '){
                System.out.println(temp);
                temp="";
            }
        }
        System.out.println(temp);


        
    }
}
