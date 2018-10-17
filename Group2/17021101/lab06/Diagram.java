package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Diagram {
    private Layer layer;
    public Diagram(Layer layer) {
        this.layer = layer;
    }
    public void removeCircle() {
        for(int i = 0; i < layer.shapes.size(); i++) {
            if (layer.shapes.get(i) instanceof Circle) {
                layer.shapes.remove(i);
                i--;
            }
        }
    }
    public void print () {
        layer.print();
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle= new Circle();
        Triangle triangle =  new Triangle();
        ArrayList <Shape> shapes = new ArrayList<>();
        int n=1;
        Scanner s =new Scanner(System.in);
        while (n!=0){
        System.out.println("nhap layer");
        System.out.println("nhap 1 neu chon Rectangle");
        System.out.println("nhap 2 neu chon Square");
        System.out.println("nhap 3 neu chon Circle");
        System.out.println("nhap 4 neu chon Triangle");
        n=s.nextInt();
        if(n==1){
            rectangle.nhapDuLieu();
            shapes.add(rectangle);
        }
        if(n==2){
            square.nhapDuLieu();
            shapes.add(square);
        }
        if(n==3){
            circle.nhapDuLieu();
            shapes.add(circle);
        }
        if(n==4){
            triangle.nhapDuLieu();
            shapes.add(triangle);
        }
        }
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());
        Layer layer = new Layer(shapes);
        layer.print();
        System.out.println("-------------------------------------------------------------------------------------");
        layer.removeTriangle();
        layer.print();
        System.out.println("-------------------------------------------------------------------------------------");
        Diagram diagram = new Diagram(layer);
        diagram.print();
        diagram.removeCircle();
        System.out.println("--------------------------------------------------------------------------------------");
        diagram.print();
    }
}
