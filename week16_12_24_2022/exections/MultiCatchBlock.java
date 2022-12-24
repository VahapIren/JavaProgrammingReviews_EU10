package week16_12_24_2022.exections;

public class MultiCatchBlock {
    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){

        }

        try {

            //System.out.println(9/0);
            Integer.parseInt("123.");
        }catch (ArithmeticException e){
            System.out.println("You got the arithmetic exceeption");
        }catch (NumberFormatException e){
            System.out.println("You have a problem with your numbers");
        }catch (Exception e){
            System.out.println("I dont know your exception");
        }


    }
}
