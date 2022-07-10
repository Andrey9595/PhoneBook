package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, List<Contact>> groups = new HashMap<>();

    public void addNewGroup(String name) {
        List<Contact> contacts = new ArrayList<>();
        this.groups.put(name, contacts);
    }

    public void addContactToGroup(String groupName, Contact contact) {
        this.groups.get(groupName).add(contact);
    }

    public String[] getGroups() {
        return groups.keySet().toArray(new String[0]);
    }

    public Contact[] getContacts(String group) {
        return groups.get(group).toArray(new Contact[0]);
    }

    public void findContactByPhone(String phone) {
        System.out.println("Поиск контакта по номеру: " + phone);
        for (List<Contact> contacts : this.groups.values()) {
            for (Contact contact : contacts) {
                if (contact.getPhone().contains(phone.replaceAll("\\s+", ""))) {
                    System.out.println(contact + "\n");
                    return;
                }
            }
        }
    }
}
