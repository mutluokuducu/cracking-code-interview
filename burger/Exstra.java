package com.burger;

public class Exstra {
    private String name;
    private double price;

    public Exstra() {
    }

    public Exstra(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  double exTotalPrice(){
        double total=0;
        return total+=getPrice();
    }
}
