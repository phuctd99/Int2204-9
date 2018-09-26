package com.company;

class Flower {
    private String name;
    private String environment;
    private Double heightAverage;
    private String color;
    //constructor
    public Flower(String name, String environment, Double heightAverage, String color) {
        this.name = name;
        this.environment = environment;
        this.heightAverage = heightAverage;
        this.color = color;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setHeightAverage(Double heightAverage) {
        this.heightAverage = heightAverage;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //getter
    public String getName() {
        return name;
    }

    public Double getHeightAverage() {
        return heightAverage;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getColor() {
        return color;
    }

    //toString
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", environment='" + environment + '\'' +
                ", heightAverage=" + heightAverage +
                ", color='" + color + '\'' +
                '}';
    }
}
