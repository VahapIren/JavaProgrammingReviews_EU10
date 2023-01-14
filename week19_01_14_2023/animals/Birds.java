package week19_01_14_2023.animals;

public class Birds extends Animals{
    @Override
    public void move() {
        System.out.println("Birds are flying");
    }
    public void hunt(){
        System.out.println("Birds are eating insects");
    }
}
