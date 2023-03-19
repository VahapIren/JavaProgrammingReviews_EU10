package week21_01_28_2023;

public class Person {

    public String name;
    public String email;
    public long phone;

    public Person(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
