package week13_12_03_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList<Teacher> teachers=new ArrayList<>();
    static {

        Teacher teacher1=new Teacher("Muhtar","Abc",'M', LocalDate.of(1987,1,1),1L);
        Teacher teacher2=new Teacher("Gurhan","Abc",'M', LocalDate.of(1977,1,1),2L);
        Teacher teacher3=new Teacher("Asyun","Abc",'F', LocalDate.of(1967,1,1),3L);
        Teacher teacher4=new Teacher("Mike","Abc",'M', LocalDate.of(1970,1,1),4L);
        Teacher teacher5=new Teacher("Saim","Abc",'M', LocalDate.of(1989,1,1),5L);
        Teacher teacher6=new Teacher("Asya","Abc",'F', LocalDate.of(1998,1,1),6L);

        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6));

    }
    public static void main(String[] args) {

        System.out.println(teachers);
        ArrayList<Teacher> result=getTeacherNameStartWith("M");
        System.out.println(result);

        ArrayList<Teacher> female=getTeacherByGender('F');
        System.out.println(female);

        ArrayList<Teacher> small=getTeacherAgeSmaller30();
        System.out.println(small);

        ArrayList<Teacher> birthYear=getBirthYear1967();
        System.out.println(birthYear);
    }

    public static ArrayList<Teacher> getBirthYear1967() {
        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.dateOfBirth.getYear()==1967){
                result.add(teacher);
            }
        }
        return result;
    }

    public static ArrayList<Teacher> getTeacherAgeSmaller30() {
        ArrayList<Teacher > result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.age<30){
                result.add(teacher);
            }
        }
        return result;
    }

    public static ArrayList<Teacher> getTeacherByGender(char gender) {
        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if(teacher.gender==gender){
                result.add(teacher);
            }
        }
        return result;
    }

    public static ArrayList<Teacher> getTeacherNameStartWith(String prefix) {

        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if(teacher.name.startsWith(prefix)){
                result.add(teacher);
            }
        }
        return result;

    }



}
