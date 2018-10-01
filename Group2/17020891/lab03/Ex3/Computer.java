package com.company;

class Computer {
    private String name;
    private String id;
    private String CPU;
    private String memory;
    //constructor
    public Computer(String name, String id, String CPU, String memory) {
        this.name = name;
        this.id = id;
        this.CPU = CPU;
        this.memory = memory;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMemory() {
        return memory;
    }
    //toString
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
