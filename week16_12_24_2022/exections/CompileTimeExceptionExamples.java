package week16_12_24_2022.exections;

public class CompileTimeExceptionExamples {
    public static void main(String[] args) {
        System.out.println("Adam");
        waitFor(3);
        System.out.println("Ersin");

    }

    public static void waitFor(int i) {
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {

        }
    }
}
