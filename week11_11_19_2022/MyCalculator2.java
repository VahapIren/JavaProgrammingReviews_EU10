package week11_11_19_2022;

public class MyCalculator2 {
    public int num1,num2;

    public void setInfo(int num1, int num2) {
        MyCalculator.plus(num1,num2);
    }

    public static void main(String[] args) {
        MyCalculator2 myCalculator2=new MyCalculator2();
        myCalculator2.setInfo(1,1);


    }
}
