/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Diagram diagram = new Diagram();

        diagram.getLayers().add(new Layer());
        diagram.getLayers().add(new Layer());
        Layer layer1 = diagram.getLayers().get(0);
        Layer layer2 = diagram.getLayers().get(1);
        Shape temp;
        temp = new Circle(1, 0, 0);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Circle(2, 0, 0);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Triangle(0, 0, 1, 1, 1, 0);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Triangle(0, 0, 1, 1, 2, 0);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Rectangle(1, 0, 1, 1, 0, 1);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Rectangle(4, 0, 4, 4, 0, 4);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Square(0, 0, 1, 1);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Square(4, 4, 0, 0);
        if (temp.check()) {
            layer1.getShapes().add(temp);
        }
        temp = new Circle(3, 0, 0);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Circle(4, 0, 0);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Triangle(0, 0, 1, 1, 2, 0);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Triangle(0, 0, 1, 1, 3, 0);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Rectangle(1, 0, 1, 1, 0, 1);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Rectangle(4, 0, 4, 4, 0, 4);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Square(0, 0, 1, 1);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }
        temp = new Square(4, 4, 0, 0);
        if (temp.check()) {
            layer2.getShapes().add(temp);
        }

        layer1.deletetriangle();
        diagram.deletecirle();

    }
}
