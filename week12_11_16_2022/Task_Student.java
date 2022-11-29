package week12_11_16_2022;

public class Task_Student {
    /*
    Class Name: Student

            instance variables:
                    name, age, batchNumber

            static variables :
                    school

            1st constructor: initializes the name ONLY

            2nd constructor: initializes name & age
                        (MUST use constructor call to set the name)

            3rd Constructor: initializes name, age ,batchNumber
                        (MUST use constructor call to set the name & age)


            instance methods: toString()
     */

    public String name;
    public int age;
    public int batchNumber;

    public static String school;

    public Task_Student(String name) {
        this.name = name;
    }

    public Task_Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Task_Student(String name, int age, int batchNumber) {
        this(name,age);
        this.batchNumber = batchNumber;
    }

    public String toString() {
        return "Task_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
