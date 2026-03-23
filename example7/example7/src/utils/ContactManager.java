package utils;

import java.util.HashMap;

public class ContactManager {
    private HashMap<String, Contact> contacts;
    public ContactManager () {
        contacts = new HashMap<>();
    }
    public void addContacts(Contact contact) {
        contacts.put(contact.getEmail(), contact);
    }
    public void removeContacts(String email) {
        contacts.remove(email);
    }
    public void showContacts() {
        for (Contact contact : contacts.values()) {
            System.out.println("------------------------------");
            contact.print();
        }
    }
    public void searchContacts(String email) {
        Contact findContact = contacts.get(email);
        findContact.print();
    }
}
