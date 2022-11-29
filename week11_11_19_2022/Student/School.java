package week11_11_19_2022.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class School {
    /*
 2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter
the return the list of students if the starts with "A"
     */
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        Student student1=new Student("Osman",'M','A', LocalDate.of(2000,1,1),111);
        Student student2=new Student("Erdem",'M','B', LocalDate.of(1999,1,1),112);
        Student student3=new Student("Veli",'M','A', LocalDate.of(2000,1,1),113);
        Student student4=new Student("Cevriye",'F','C', LocalDate.of(2000,1,1),114);
        Student student5=new Student("Aygun",'F','D', LocalDate.of(2000,1,1),115);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        ArrayList<Student> result=getStudentsNameStarsWithA(students);
        System.out.println(result);

        ArrayList<Student> result1=getCUpperGrade(students);
        System.out.println(result1.size());


    }

    public static ArrayList<Student> getCUpperGrade(ArrayList<Student> students) {
        ArrayList<Student> result=new ArrayList<>();
        for (Student each : students) {
            if (each.grade<'C')
                result.add(each);
        }
        return result;
    }


    public static ArrayList<Student> getStudentsNameStarsWithA(ArrayList<Student> students) {
        ArrayList<Student> result=new ArrayList<>();
        for (Student student : students) {
            if (student.name.startsWith("A"))
                result.add(student);
        }
        return result;
    }
}
