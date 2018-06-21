package com.burger;

public class Burger extends Exstra {
    private  String  name;
    private  String  breadType;
    private double price;

    public Burger(String name, String breadType, double price) {
        this.name = name;
        this.breadType = breadType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getPrice() {
        return price;
    }

    public double priceBurger(){
        double burgerTotal=0;
        burgerTotal+=price;
        return burgerTotal;
    }

    @Override
    public double exTotalPrice() {
        return super.exTotalPrice()+price;
    }


}
