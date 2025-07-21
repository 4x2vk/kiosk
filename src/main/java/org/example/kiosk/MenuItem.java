package org.example.kiosk;

public class MenuItem {

    private final String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    @Override
    public String toString() {
        return String.format(" %-14s | W %.1f | %s", name, price, description);
    }
// 아직 사용안 안한 getter setter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
