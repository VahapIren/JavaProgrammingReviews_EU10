package week21_01_28_2023;

public class Itemm {
    String name;
    double price;

    public Itemm(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String toString() {

        return name+" $"+price;
    }
}
