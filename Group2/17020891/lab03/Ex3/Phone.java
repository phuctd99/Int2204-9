package com.company;

class Phone {
    String name;
    String id;
    double price;
    int memory;

    public Phone(String name, String id, double price, int memory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.memory = memory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMemory() {
        return memory;
    }

    public double getPrice() {
        return price;
    }
}
