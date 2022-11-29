package week12_11_16_2022.statics;

public class EatingCake {
    public static void main(String[] args) {

        //EatCake.eatCake(1);
        //EatCake.eatCake(2);
        //EatCake.eatCake(1);

        EatCake person1 = new EatCake();
        EatCake person2 = new EatCake();
        EatCake person3 = new EatCake();

        person1.eatCake(1); //9
        person2.eatCake(1); //8
        person3.eatCake(1); //7

    }
}
