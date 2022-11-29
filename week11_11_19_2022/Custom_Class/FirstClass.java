package week11_11_19_2022.Custom_Class;

import java.util.ArrayList;

public class FirstClass {
    public int a;
    public String b;
    public SecondClass secondClass;
    public ArrayList<Integer> arrayList;

    public FirstClass(int a, String b, SecondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }

    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                '}';
    }


}
