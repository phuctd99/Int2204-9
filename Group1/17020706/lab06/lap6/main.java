/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author DELL
 */
public class main {

    public static void main(String[] args) {

        Square square1 = new Square(5, "vang", true);
        Triangle triangle1 = new Triangle(2, 3, 4, "Blue", true);
        Layer layer1 = new Layer();
        layer1.shapes.add(square1);
        layer1.shapes.add(new Triangle(1, 2, 3, "Red", true));
        layer1.shapes.add(triangle1);
        layer1.shapes.add(new Triangle(0, 0, 0, "Black", true));
        System.out.println("Kích thước mảng layer 1: " + layer1.shapes.size());
        for (int i = 0; i < layer1.shapes.size(); i++) {
            System.out.println(layer1.shapes.get(i).getInfo());
        }
        Layer layer2 = new Layer();
        layer2.shapes.add(new Triangle(1, 2, 4, "Red", true));
        layer2.shapes.add(square1);
        layer2.shapes.add(new Circle(2, "Yellow", true));
        layer2.shapes.add(new Circle(5, "Pink", false));
        System.out.println("Kích thước mảng layer 2: " + layer2.shapes.size());
        for (int i = 0; i < layer2.shapes.size(); i++) {
            System.out.println(layer2.shapes.get(i).getInfo());
        }
        Diagram diagram1 = new Diagram();
        diagram1.layers.add(layer1);
        diagram1.layers.add(layer2);
        System.out.println(diagram1.layers.get(0).shapes.size() + diagram1.layers.get(1).shapes.size());

        layer1.removeTriangle();
        layer2.removeTriangle();
        diagram1.removeCircle();
        for (int i = 0; i < diagram1.layers.size(); i++) {
            for (int j = 0; j < diagram1.layers.get(i).shapes.size(); j++) {
                System.out.println(diagram1.layers.get(i).shapes.get(j).getInfo());
            }
        }
        new Draw();
    }

}
