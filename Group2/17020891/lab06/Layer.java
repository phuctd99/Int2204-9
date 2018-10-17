package com.company;

import java.util.ArrayList;

import java.util.List;

public class Layer {
    private String name;
    private List<Shape> listShape;

    //constructor
    public Layer(String name) {
        this.listShape = new ArrayList<>();
        this.name = name;
    }

    //methods
    public void addShape(Shape shape) {
        this.listShape.add(shape);
    }

    public void removeAllTriangle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
                i--;
            }

        }
    }

    public void removeAllCircle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                listShape.remove(i);
                i--;
            }
        }
    }

    public void showAllShapes() {
        System.out.println(this);
        for (Shape shape : this.listShape) {
            System.out.println(shape);
        }
    }

    @Override
    public String toString() {
        return "Layer: " + name;
    }
}
