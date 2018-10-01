package com.company;

class Fruit {
    private String name;
    private Double price;
    private String nutrition;
    //constructor
    public Fruit(String name, Double price, String nutrition) {
        this.name = name;
        this.price = price;
        this.nutrition = nutrition;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }
    //getter
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getNutrition() {
        return nutrition;
    }
    //toString
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nutrition='" + nutrition + '\'' +
                '}';
    }
}
