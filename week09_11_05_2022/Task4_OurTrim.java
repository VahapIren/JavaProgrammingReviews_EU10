package week09_11_05_2022;

public class Task4_OurTrim {
    public static void main(String[] args) {

    String result=ourTrim("   Hello  ");
        System.out.println(result);
    }

    private static String  ourTrim(String str) {
        String dummy="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch==' ')
                continue;

            dummy+=ch;
        }
        return dummy;
    }

}
