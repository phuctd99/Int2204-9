/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

public class Triangle extends Shape {
    private ToaDo td1;
    private ToaDo td2;
    private ToaDo td3;

    public Triangle() {}

    public Triangle(ToaDo td1, ToaDo td2, ToaDo td3) {
        super();
        this.td1 = td1;
        this.td2 = td2;
        this.td3 = td3;
    }

    public Triangle(String color, boolean filled, ToaDo td1, ToaDo td2, ToaDo td3) {
        super(color, filled);
        this.td1 = td1;
        this.td2 = td2;
        this.td3 = td3;
    }

    public ToaDo getP1() {
        return td1;
    }

    public void setP1(ToaDo td1) {
        this.td1 = td1;
    }

    public ToaDo getP2() {
        return td2;
    }

    public void setP2(ToaDo td2) {
        this.td2 = td2;
    }

    public ToaDo getP3() {
        return td3;
    }

    public void setP3(ToaDo td3) {
        this.td3 = td3;
    }

    public int getAre() {
        return Math.abs((td2.getX() - td1.getX()) * (td3.getY() - td1.getY()) - (td3.getX() - td1.getX()) * (td2.getY() - td1.getY()));
    }

    public double getPerimeter() {
        return Math.sqrt((td1.getX() - td2.getX()) * (td1.getX() - td2.getX()) + (td1.getY() - td2.getY()) * (td1.getY() - td2.getY()))
                + Math.sqrt((td1.getX() - td3.getX()) * (td1.getX() - td3.getX()) + (td1.getY() - td3.getY()) * (td1.getY() - td3.getY()))
                + Math.sqrt((td2.getX() - td3.getX()) * (td2.getX() - td3.getX()) + (td2.getY() - td3.getY()) * (td2.getY() - td3.getY()));
    }

    public void move(int x, int y) {
        td1.setX(td1.getX() + x);
        td1.setY(td1.getY() + y);
        td2.setX(td2.getX() + x);
        td2.setY(td2.getY() + y);
        td3.setX(td3.getX() + x);
        td3.setY(td3.getY() + y);
    }
}
