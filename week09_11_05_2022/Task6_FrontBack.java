package week09_11_05_2022;

public class Task6_FrontBack {
    public static void main(String[] args) {

    String result=frontBack("aasde");
        System.out.println(result);
    }

    public static String frontBack(String code) {
        String result="";
        if (code.length()==1)
            return code;

        result=code.charAt(code.length()-1)+code.substring(1,code.length()-1)+code.charAt(0);
        return result;
    }


}
