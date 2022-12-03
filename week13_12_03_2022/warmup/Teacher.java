package week13_12_03_2022.warmup;

import java.time.LocalDate;

public class Teacher {
    /*
    Task 1 :



     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object


    2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
     */

    public String name,lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;

    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, long id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        int curretYear=LocalDate.now().getYear();
        age=curretYear-dateOfBirth.getYear();
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
