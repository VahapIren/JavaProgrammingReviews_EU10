package week19_01_14_2023.animals;

public class ZooPolymorphism {
    public static void main(String[] args) {
        Animals animal=new Birds();
        animal.move();

        animal=new Cows();
        animal.move();

        animal=new Fish();
        animal.move();
        System.out.println("==============================");

        Animals animal1=new Birds();
        ((Birds)animal1).hunt();
    }
}
