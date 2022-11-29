package week09_11_05_2022;

public class Task2_PrimeNumber {
    public static void main(String[] args) {

      boolean result=isPrimeNumber(2);
        System.out.println(result);

    }

    public static boolean isPrimeNumber(int num) {
        boolean isPrime=true;
        if (num<2){
            isPrime=false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }


}
