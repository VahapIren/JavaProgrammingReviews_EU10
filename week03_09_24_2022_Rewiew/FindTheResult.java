package week03_09_24_2022_Rewiew;

public class FindTheResult {
    public static void main(String[] args) {
        int a=9;
        if(a%3==0&&a%5==0){
            a+=50;
            System.out.println("a = " + a);
        } else if (a%3==0) {
            a+=20;
            System.out.println("a = " + a);
        } else if (a%5==0) {
            a+=25;
            System.out.println("a = " + a);
        }
    }
}
