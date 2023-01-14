package week18_01_07_2023.exception;

public class CustomExceptionExample {
    public static void main(String[] args) {
        //Arithmetic Exception

        try {

            System.out.println(3/0);
        }catch (Exception e){
            //  throw new CustomArithmeticException();
            throw new CustomArithmeticException("you have an error");

        }





    }
}
