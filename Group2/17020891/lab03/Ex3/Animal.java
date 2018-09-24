package com.company;

class Animal {
    private String name;
    private String environment;
    private String makeNoise;
    private String food;
    //constructor
    public Animal(String name, String environment, String makeNoise, String food) {
        this.name = name;
        this.environment = environment;
        this.makeNoise = makeNoise;
        this.food = food;
    }
    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
    }

    public void setFood(String food) {
        this.food = food;
    }
    //getter

    public String getName() {
        return name;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getFood() {
        return food;
    }

    public String getMakeNoise() {
        return makeNoise;
    }
    //toString
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", environment='" + environment + '\'' +
                ", makeNoise='" + makeNoise + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}