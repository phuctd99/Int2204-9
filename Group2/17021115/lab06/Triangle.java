/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

public class Triangle extends Shape {
    private ToaDo diemA;
    private ToaDo diemB;
    private ToaDo diemC;

    public Triangle() {}

    public Triangle(ToaDo diemA, ToaDo diemB, ToaDo diemC) {
        super();
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public Triangle(String color, boolean filled, ToaDo diemA, ToaDo diemB, ToaDo diemC) {
        super(color, filled);
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public ToaDo getP1() {
        return diemA;
    }

    public void setP1(ToaDo diemA) {
        this.diemA = diemA;
    }

    public ToaDo getP2() {
        return diemB;
    }

    public void setP2(ToaDo diemB) {
        this.diemB = diemB;
    }

    public ToaDo getP3() {
        return diemC;
    }

    public void setP3(ToaDo diemC) {
        this.diemC = diemC;
    }

    public int getArea() {
        return Math.abs((diemB.getX() - diemA.getX()) * (diemC.getY() - diemA.getY()) - (diemC.getX() - diemA.getX()) * (diemB.getY() - diemA.getY()));
    }

    public double getPerimeter() {
        return Math.sqrt((diemA.getX() - diemB.getX()) * (diemA.getX() - diemB.getX()) + (diemA.getY() - diemB.getY()) * (diemA.getY() - diemB.getY()))
                + Math.sqrt((diemA.getX() - diemC.getX()) * (diemA.getX() - diemC.getX()) + (diemA.getY() - diemC.getY()) * (diemA.getY() - diemC.getY()))
                + Math.sqrt((diemB.getX() - diemC.getX()) * (diemB.getX() - diemC.getX()) + (diemB.getY() - diemC.getY()) * (diemB.getY() - diemC.getY()));
    }

    public void move(int x, int y) {
        diemA.setX(diemA.getX() + x);
        diemA.setY(diemA.getY() + y);
        diemB.setX(diemB.getX() + x);
        diemB.setY(diemB.getY() + y);
        diemC.setX(diemC.getX() + x);
        diemC.setY(diemC.getY() + y);
    }
}