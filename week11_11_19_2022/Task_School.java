package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_School {
    public static void main(String[] args) {

        Task_Student student1=new Task_Student("Aygun",'F',"05.09.1977",45,11,'A');
        Task_Student student2=new Task_Student("Aybars",'M',"05.09.1970",52,12,'B');
        Task_Student student3=new Task_Student("Taygun",'M',"05.09.1980",42,13,'B');
        Task_Student student4=new Task_Student("Saygun",'M',"05.09.1990",32,14,'C');
        Task_Student student5=new Task_Student("Atike",'F',"05.09.1995",27,15,'A');

        ArrayList<Task_Student> list=new ArrayList<>();
        list.addAll(Arrays.asList(student1,student2,student3,student4,student5));
        System.out.println(list);
        System.out.println("studentList(list) = " + studentList(list));

    }
    public static ArrayList<Task_Student> studentList(ArrayList<Task_Student> list){
        ArrayList<Task_Student> studList=new ArrayList<>(list);
        studList.removeIf(p->!p.name.startsWith("A"));
        return studList;
    }
}
