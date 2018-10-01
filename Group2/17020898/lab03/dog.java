package com.company;

public class dog {
    int age;
    String name;
    public dog(){
        age = 1;
        name = "John";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
