package week15_12_17_2022.method_overriding.task2;

public class Bird extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("Birds are flying");
    }
}
