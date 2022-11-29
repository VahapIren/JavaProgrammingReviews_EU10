package week12_11_16_2022;
class Student {
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



public class StudentObject {

        public static void main(String[] args) {

            week12_11_16_2022.student.Student student1=new week12_11_16_2022.student.Student("Adam");
            System.out.println(student1);
            student1.age=12;
            student1.batchNumber=34;

            System.out.println(student1);

        }
    }

