package com.company;

public class Contact {
    private final String name;
    private final String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name +
                "\nНомер телефона: " + this.phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
