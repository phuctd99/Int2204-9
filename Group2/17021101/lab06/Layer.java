package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Layer {
    protected ArrayList <Shape> shapes = new ArrayList<Shape>();

    public Layer() {}

    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void removeTriangle () {
        for(int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void print () {
        for(int i=0;i<shapes.size();i++) {
            shapes.get(i).cout();
        }
    }
}