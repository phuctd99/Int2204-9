package com.company;

public class Square extends Retangle {

    //constructor
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    //getter & setter
    public double getSide() {
        return getWidth();
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
                "color = '" + this.getColor() + '\'' +
                ", filled = " + this.isFilled() +
                ", side = " + this.getSide() +
                '}';
    }
}
