package week21_01_28_2023;

public class PhoneBookMain {
    public static void main(String[] args) {

        Person person1=new Person("alice", "alice@gmail.com",1234512345);
        Person person2=new Person("mary", "mary@gmail.com",1234500012);
        Person person3=new Person("hanna", "hanna@gmail.com",1234512000);

        PhoneBook phoneBook1=new PhoneBook();
        phoneBook1.addContact(person1);
        phoneBook1.addContact(person2);
        phoneBook1.addContact(person3);

        phoneBook1.showAllContact();

        phoneBook1.deleteContact("alice@gmail.com");

        phoneBook1.showAllContact();

        Person person=new Person("hanna", "hanna33@gmail.com",1004512000);

        phoneBook1.updateContact(person);
        System.out.println("-------------------------------------------------------");
        phoneBook1.showAllContact();





    }
}
