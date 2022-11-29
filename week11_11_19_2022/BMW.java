package week11_11_19_2022;

import java.time.LocalDate;

public class BMW {
    /*
    Create a class for BMW
            - Create these variables in the class:
                 - brand,model,color (String),      // BMW,x5,White
                - price,mileage (double)           // 20000,10000
                - year (int)                       // 2015
                - DOfB(LocalDate)                   // 2015,5,20


        - Create these methods :
            - setInfo() (Or we can use constructor)
                - parameters: all atributes
                - returns: void
                - action: assigns necessary attributes for instance variables.

        - getBrandName()
             no parameters, returns the brand variable

        - toString()   generate the toString method as shown in class.

        - Create a class MainClass for BMW

        - Create BMW  objects, call the getBrandName and get methods of the objects
            - Create an Arraylist to recall ALL BMW that were build before 2017
            - Create an Arraylist to recall ALL BMW i8 that were build before 2016
     */

    public String brand,model,color;
    public double price,mileage;
    public int year;
    public String  DOfB;
    public static String brandd="BMW";

    public BMW(String brand, String model, String color, double price, double mileage, int year, String DOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.year = year;
        this.DOfB = DOfB;
    }

    public  String getBrandName(){
        return brand;
    }

    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", mileage= miles" + mileage +
                ", year=" + year +
                ", DOfB=" + DOfB +
                '}';
    }
}
