package week12_11_16_2022.student;

public class Student {
    public String name;
    public int age;
    public long batchNumber;

    public static String school="Cydeo";

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);     //this.name = name;
        this.age = age;
    }

    public Student(String name, int age, long batchNumber) {
        this(name, age);
        this.batchNumber = batchNumber;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", school=" + school +
                '}';
    }
}
