package week15_12_17_2022.method_overriding.task2;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.move();

        Cow cow=new Cow();
        cow.move();

        Fish fish=new Fish();
        fish.move();
    }
}
