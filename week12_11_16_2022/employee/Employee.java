package week12_11_16_2022.employee;

public class Employee {
    public String name;
    public int id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
    /*We can overload toString method but we must call
    this one like other methods
    public String toString(String name) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }

     */

}
