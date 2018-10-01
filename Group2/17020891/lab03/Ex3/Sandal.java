package com.company;

public class Sandal {
    String name;
    double price;
    String origin;
    //constructor
    public Sandal(String name, double price, String origin) {
        this.name = name;
        this.price = price;
        this.origin = origin;
    }
    //setter
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    //getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }

    //toString
    public String toString() {
        return "Sandal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}';
    }
}
