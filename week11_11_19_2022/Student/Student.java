package week11_11_19_2022.Student;

import java.time.LocalDate;

public class Student {
       /*
    Task 4 :

1. create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter
the return the list of students if the name start with "A"
     */

    public String name;
    public char gender,grade;
    public LocalDate dateOfBirth;
    public int age,studentID;

    public Student(String name, char gender, char grade, LocalDate dateOfBirth,  int studentID) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();
        this.studentID = studentID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
