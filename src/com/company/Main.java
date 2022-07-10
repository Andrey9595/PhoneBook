package com.company;

public class Main {
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {

        phoneBook.addNewGroup("Друзья");
        phoneBook.addNewGroup("Работа");

        System.out.println("Список групп:");
        for (String s : phoneBook.getGroups()) {
            System.out.println(s);
        }
        System.out.println();

        Contact contact1 = new Contact("Andrey", "+7 999 888 77 76");
        Contact contact2 = new Contact("Sergey", "555 05 03");
        Contact contact3 = new Contact("Mr x", "+7 495 666 33 22");
        Contact contact4 = new Contact("Roman", "+7 987 42 72");

        phoneBook.addContactToGroup("Друзья", contact1);
        phoneBook.addContactToGroup("Друзья", contact2);
        phoneBook.addContactToGroup("Друзья", contact3);
        phoneBook.addContactToGroup("Работа", contact2);
        phoneBook.addContactToGroup("Работа", contact4);

        System.out.println("Список контактов группы 'Друзья':");
        for (Contact c : phoneBook.getContacts("Друзья")) {
            System.out.println(c.getName());
        }
        System.out.println();

        phoneBook.findContactByPhone("+7 917 555 66 33");
        phoneBook.findContactByPhone("+7 999 888 77");
    }
}
