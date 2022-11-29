package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("London");  //returns boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        // how to print Arraylist

        //for Arrays ==>Arrays.toString(array)

        System.out.println("cities = " + cities);

        //how to add element at any index

        cities.add(0,"Vienna");
        System.out.println("cities = " + cities);

        //how to get element
        System.out.println(cities.get(0));

        //how to update your element
        cities.set(2,"New York");  //we changed Paris with New York
        cities.set(3,"Ankara");
        System.out.println("---------------------------------------");
        System.out.println("cities = " + cities);

        //how to learn position of the element or index of element
        System.out.println(cities.indexOf("New York"));  //2
        System.out.println(cities.indexOf("Paris"));   //if it isnt exist you will get -1
        System.out.println(cities.indexOf("New"));  //also -1

        //lastIndexOf()
        System.out.println(cities.lastIndexOf("London"));

        cities.add("London");
        System.out.println("cities.indexOf(\"London\") = " + cities.indexOf("London"));
        System.out.println("cities.lastIndexOf() = " + cities.lastIndexOf("London"));
        System.out.println("-----------------------------------");


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.indexOf(1));//0
        System.out.println(numbers.lastIndexOf(1));//8

        //how to remove an element
        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);
        System.out.println(numbers1);
        numbers1.remove(1);
        System.out.println(numbers1);

        Integer b=4;
        numbers1.remove(b);// it will remove element
        System.out.println(numbers1);

        numbers1.remove(new Integer(5));
        System.out.println(numbers1);

        //bulk operators
        //addAll

        ArrayList<String > names=new ArrayList<>();
        names.addAll(Arrays.asList("Mesut","Mustafa","Osman","Seyma"));

        //removeAll
        //retainAll

        //removeIf()

        System.out.println("------------------------------------------------------");

        System.out.println(numbers);
/*
        for (Integer number : numbers) {
            if (number<3)
                numbers.remove(number);
        }
        System.out.println(numbers);
 */
        numbers.removeIf(k->k<3);
        System.out.println(numbers);

        ArrayList<Integer> numbers3=new ArrayList<>(Arrays.asList(1,2,3,4,5));




    }
}
