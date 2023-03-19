package week21_01_28_2023;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<Person> contacts=new ArrayList<>();
    public void addContact(Person person){
        contacts.add(person);
    }

    public void deleteContact(String email){
        contacts.removeIf(p->p.email.equalsIgnoreCase(email));
    }

    public void showAllContact(){
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }

    }

    public void updateContact(Person person){
        for (Person each : contacts) {
            if(each.name.equalsIgnoreCase(person.name)){
                each.email=person.email;
                each.phone= person.phone;
            }
        }

    }


}
