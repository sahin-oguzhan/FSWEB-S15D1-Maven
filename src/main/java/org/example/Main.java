package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grocery grocery = new Grocery();
        grocery.startGrocery();
        System.out.println("***************");
        MobilePhone phone = new MobilePhone("555-1234", new ArrayList<>());

        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", "16180339");

        phone.addNewContact(bob);
        phone.addNewContact(alice);
        phone.printContact();

    }
}
