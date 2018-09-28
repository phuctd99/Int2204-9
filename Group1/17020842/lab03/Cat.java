/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author CACLV
 */
public class Cat {
    private String name;
    private double weight; // cân nặng
    private String furColor; // màu lông

    // contructor vs hai tham số truyền vào là hai thuộc tính của đt
    public Cat(String name, double weight, String furColor) {
        this.name = name;
        this.weight = weight;
        this.furColor = furColor;
    }
    

    
    // các phương thức get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    // phương thức mô tả tiếng mèo kêu
    public String makeNoise() {
        return "Meow!";
    }
    
    // in ra các thông tin của đối tượng
    public void showInfor() {
        System.out.println("name: " + this.getName());
        System.out.println("Coat color: " + this.getFurColor());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Noise: " + this.makeNoise());
    }
    
    public static void main(String[] args) {
        // in ra thông tin của 1 con mèo
        new Cat("jerry", 2.3, "grey").showInfor();
    }
    
}
