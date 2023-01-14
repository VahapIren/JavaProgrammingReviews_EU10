package week18_01_07_2023.exception;



public class DisadvantageOfThrows {
    public static void main(String[] args) throws InterruptedException {

        waitFor(3);
        sleep(4);
    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void methodB() throws InterruptedException{
        sleep(4);
    }
    private static void waitFor(int seconds) throws InterruptedException {
        sleep(seconds);
    }

    public static void methodA() throws InterruptedException{
        waitFor(4);
    }

}
