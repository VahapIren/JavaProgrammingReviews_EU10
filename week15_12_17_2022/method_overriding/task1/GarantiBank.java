package week15_12_17_2022.method_overriding.task1;

public class GarantiBank extends Bank{
    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(calculate());
    }

    private int calculate(){
        return   getCapital() * 8 / 100;
    }
}
