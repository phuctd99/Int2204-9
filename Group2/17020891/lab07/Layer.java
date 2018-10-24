package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Layer extends JPanel {
    private String name;
    private List<Shape> listShape;

    //constructor
    //constructor
    public Layer(String name) {
        this.listShape = new ArrayList<>();
        this.name = name;
        setMaximumSize(new Dimension(400, 400));
        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BorderLayout());
    }


    //get List
    public List<Shape> getListShape() {
        return listShape;
    }

    //methods
    public void addShape(Shape shape) {
        this.listShape.add(shape);
        this.add(shape);
    }



    //draw all shape in layer
    public void paint(Graphics graphics) {
        for (int i = 0; i < listShape.size(); i++) {
            listShape.get(i).paint(graphics);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public int getNumberShape() {
        return listShape.size();
    }


    //count number of shapes in layer
    public int countRectangle() {
        int count = 0;
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Retangle) {
                count++;
            }
        }
        return count;
    }

    public int countSquare() {
        int count = 0;
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Square) {
                count++;
            }
        }
        return count;
    }

    public int countTriangle() {
        int count = 0;
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                count++;
            }
        }
        return count;
    }

    public int countCircle() {
        int count = 0;
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                count++;
            }
        }
        return count;
    }

    public int countHexagon() {
        int count = 0;
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Hexagon) {
                count++;
            }
        }
        return count;
    }

    //remove all shape with choosed type
    public void removeAllShapeInType(String type) {
        if (type.equals("Square")) {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Square) {
                    listShape.remove(i);
                }
            }
        } else if (type.equals("Retangle")) {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Retangle) {
                    listShape.remove(i);
                }
            }
        } else if (type.equals("Circle")) {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Circle) {
                    listShape.remove(i);
                }
            }
        } else if (type.equals("Triangle")) {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Triangle) {
                    listShape.remove(i);
                }
            }
        } else if (type.equals("Hexagon")) {
            for (int i = 0; i < listShape.size(); i++) {
                if (listShape.get(i) instanceof Hexagon) {
                    listShape.remove(i);
                }
            }
        }
    }




    public String[] toList() {
        String[] list = new String[listShape.size()];
        for (int i = 0; i < listShape.size(); i++) {
            list[i] = listShape.get(i).getName();

        }
        return list;
    }

    //remove duplicate shape in layer
    public void removeDuplicate() {
        for (int i = 0; i < listShape.size(); i++) {
            for (int j = i + 1; j < listShape.size() ; j++) {
                if (listShape.get(i).equals(listShape.get(j))) {
                    listShape.remove(j);
                    j--;
                }
            }
        }
    }

}
