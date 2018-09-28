/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CACLV
 */
public class Car {
    private String name ; // tên xe
    private String color ;// màu sắc
    private double speed; // tốc độ km/h
    private double price; // định giá $
    
    public Car() {
        this.speed = 0;
    }
    // contructor có tham số
    public Car(String name, String color, double speed, double price) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }
    
    
    // các phương thức get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // in ra thông tin của 1 chiếc xe
    public void showInfor(){
        System.out.println("name: " + this.getName());
        System.out.println("Color: " + this.getColor());
        System.out.println("Speed: " + this.getSpeed());
        System.out.println("Price: " + this.getPrice());
        System.out.println();
    }
    
    // trả về chiếc xe có tốc độ cao nhất
    public Car numberOneSpeed(List <Car> carList){
        Car car = new Car();
        int sizeCars = carList.size();
        for(Car ele : carList){
            if(car.speed < ele.speed) car = ele;
        }
        return car;
        
    }
    public static void main(String[] args) {
         // khai báo một mảng danh sách Car
        List <Car> carList = new ArrayList<>();
        
        // tạo danh sách cho mảng
        carList.add(new Car("aaaa", "red", 400, 1)); 
        carList.add(new Car("bbbb", "blue", 387, 0.8));
        carList.add(new Car("cccc", "black", 600, 5));
        carList.add(new Car("dddd", "white", 500, 1.5));
        
        // in ra thông tin chiếc xe đáng giá cho người mê tốc độ
        new Car().numberOneSpeed(carList).showInfor();
    }
    
}
