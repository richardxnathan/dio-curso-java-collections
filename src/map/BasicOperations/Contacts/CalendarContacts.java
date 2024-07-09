package src.map.BasicOperations.Contacts;

import java.util.HashMap;
import java.util.Map;

public class CalendarContacts {
    
    private Map<String, Integer> contacts = new HashMap<>();
    
    public void addContact(String name, Integer phoneNumber){
        contacts.put(name, phoneNumber);
    }
    
    public void removeContact(String name){
        contacts.remove(name);
    }
    
    public void showContacts(){
        System.out.println(contacts);
    }

    public Integer findContactByName(String name){
        Integer number = null;

        number = contacts.get(name);

        if (number == null){
            System.out.println("Contact not found.");
        }

        return number;
    }
    
}
