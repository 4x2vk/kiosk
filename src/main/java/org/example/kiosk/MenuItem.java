package org.example.kiosk;

public class MenuItem {

    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String toString() {
        return String.format(" %-14s | W %.1f | %s", name, price, description);
    }
}
