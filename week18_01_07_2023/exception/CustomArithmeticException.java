package week18_01_07_2023.exception;

public class CustomArithmeticException extends RuntimeException{
    public CustomArithmeticException() {
        super("You have an error with divide with 0");
    }
    public CustomArithmeticException(String xxx) {
        super(xxx);
    }
}
