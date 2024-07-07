package src.set.Research.Contacts;

import java.util.HashSet;
import java.util.Set;

public class BookContact {

    private Set<Contact> contacts = new HashSet<>();

    public void addContact(String name, int phoneNumber){
        contacts.add(new Contact(name, phoneNumber));
    }

    public void showContacts(){
        System.out.println(contacts);
    }

    public Set<Contact> researchByName(String name){
        Set<Contact> contactByName = new HashSet<>();

        for (Contact c : contacts) {
            if (c.getName().equals(name)){
                contactByName.add(c);
            }
        }

        return contactByName;
    }

    public void updatePhoneNumber(String name, int phoneNumber){
        for (Contact c : contacts) {
            if (c.getName().equals(name)){
                c.setPhoneNumber(phoneNumber);

                System.out.println("Contato atualizado com sucesso!");
            }
        }
    }

}
