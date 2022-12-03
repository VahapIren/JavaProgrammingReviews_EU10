package week13_12_03_2022.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student=new Student();
        student.setName("Adam");
        student.setAge(12);

        System.out.println(student);

        System.out.println(student.getName());
        System.out.println(student.getAge());


    }
}
