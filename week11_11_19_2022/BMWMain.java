package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class BMWMain {
    public static void main(String[] args) {

        BMW bmw1=new BMW("BMW","X5","White",20000,10000,2015,"2015-5-20");
        BMW bmw2=new BMW("BMW","X3","White",20000,10000,2017,"2015-5-20");
        BMW bmw3=new BMW("BMW","X5","White",22000,10000,2019,"2015-5-20");
        BMW bmw4=new BMW("BMW","X7","White",25000,10000,2020,"2015-5-20");
        BMW bmw5=new BMW("BMW","X5","White",20000,10000,2014,"2015-5-20");
        System.out.println(bmw1);
        ArrayList<BMW> list=new ArrayList<>();
        list.addAll(Arrays.asList(bmw1,bmw2,bmw3,bmw4,bmw5));
        System.out.println("bmw1.getBrandName() = " + bmw1.getBrandName());
        System.out.println("BMW.brandd = " + BMW.brandd);
        System.out.println(bmw1.brand);
        System.out.println("bmw1.brandd = " + bmw1.brandd);

        list.removeIf(p->p.year>=2017);
        System.out.println(list);



    }
}
