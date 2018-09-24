package com.company;

class Plant {
    private String name;
    private String environment;
    private Double heightAverage;
    //constructor
    public Plant(String name, String environment, Double heightAverage) {
        this.name = name;
        this.environment = environment;
        this.heightAverage = heightAverage;
    }
    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setHeightAverage(Double heightAverage) {
        this.heightAverage = heightAverage;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getEnvironment() {
        return environment;
    }

    public Double getHeightAverage() {
        return heightAverage;
    }
    //toString

    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", environment='" + environment + '\'' +
                ", heightAverage=" + heightAverage +
                '}';
    }
}