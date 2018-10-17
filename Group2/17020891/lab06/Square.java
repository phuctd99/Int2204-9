package com.company;

public class Square extends Retangle {

    //constructor
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(int x, int y, String color, double side) {
        super(x, y, color, side, side);
    }

    //getter & setter

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
