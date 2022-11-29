package week11_11_19_2022;

public class Task_Student {
    /*
    . create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students
as parameter the return the list of students if the name start with "A"
     */

    public String name;
    public char gender;
    public String dataOfBirth;
    public int age,studentID;
    public char grade;

    public Task_Student(String name, char gender, String dataOfBirth, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.dataOfBirth = dataOfBirth;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Task_Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
