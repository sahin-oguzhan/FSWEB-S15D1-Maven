package org.example.mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobilePhone {

    String myNumber;
    List<Contact> myContacts = new ArrayList<>();

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact item) {
        for (Contact contact : myContacts) {
            if (contact.equals(item)) {
                return false;
            }
        }
        myContacts.add(item);
        return true;
    }

    public boolean removeContact(Contact item) {
        for (Contact contact : myContacts) {
            if (contact.equals(item)) {
                myContacts.remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(Contact oldItem, Contact newItem) {
        for (Contact contact : myContacts) {
            if (contact.equals(oldItem) && !myContacts.contains(newItem)) {
                removeContact(oldItem);
                addNewContact(newItem);
                return true;
            }
        }
        return false;
    }

    public int findContact(Contact item) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (item.equals(myContacts.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int findContact(String item) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String item) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(item)) {
                return contact;
            }
        }
        return null;
    }

    public void printContact() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i+1) + "." + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}

