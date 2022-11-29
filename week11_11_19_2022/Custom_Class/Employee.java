package week11_11_19_2022.Custom_Class;

public class Employee {
    public String name;
    public char gender;
    public int employeeID;

    //in order to print attributes toString()


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", employeeID=" + employeeID +
                '}';
    }
}
