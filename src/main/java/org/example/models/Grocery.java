package org.example.models;

import java.util.*;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void startGrocery() {

        int choice;
        do {
            System.out.println("Lütfen seçiminizi yapınız: " +
                    "\n 0- Çıkış " +
                    "\n 1- Ekleme" +
                    "\n 2- Çıkarma");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz:");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz:");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
            }
        }
        while (choice != 0);
        scanner.close();
    }

    public static void removeItems(String itemsToRemove) {
        String[] splitItems = itemsToRemove.split(",");
        for (String item : splitItems) {
            item = item.trim();
            if (checkItemsInList(item)) {
                groceryList.remove(item);
            } else {
                System.out.println(item + " Listede mevcut değil!");
            }
        }
        printSorted();
    }

    public static void addItems(String itemsToAdd) {
        String[] splitItems = itemsToAdd.split(",");
        for (String item : splitItems) {
            item = item.trim();
            if (checkItemsInList(item)) {
                System.out.println(item + " Listede mevcut!");
            } else {
                groceryList.add(item);
            }
        }
        printSorted();
    }

    public static boolean checkItemsInList(String item) {
        return groceryList.contains(item);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Mevcut ürün listesi: ");
        for (String grocery : groceryList) {
            System.out.println(grocery);
        }
    }
}
