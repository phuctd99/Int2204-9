/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
        Diagram diagramg = new Diagram();
        Layer lay1 = new Layer();
        Layer lay2 = new Layer();
        toaDo A = new toaDo(0, 0);
        toaDo B = new toaDo(0, 1);
        toaDo C = new toaDo(1, 1);
        toaDo D = new toaDo(1, 0);
        Circle cr = new Circle(2, A, "red", true);
        Circle cr0 = new Circle(2, A, "red", true);
        Rectangle rec = new Rectangle(A, B, C, D, "blue", true);
        Square sq = new Square(A, B, C, D, "yellow", true);
        Triangle tri = new Triangle(A, B, C, "green", true);
        lay1.getShapeArrayList().add(cr);
        lay1.getShapeArrayList().add(rec);
        lay1.getShapeArrayList().add(sq);
        lay1.getShapeArrayList().add(tri);
        lay1.getShapeArrayList().add(cr0);
        lay1.removeShape();
        
        
        lay2.getShapeArrayList().add(sq);
        lay2.getShapeArrayList().add(rec);

        diagramg.getLayerArrayList().add(lay1);
        diagramg.getLayerArrayList().add(lay2);
        diagramg.delete();
        lay1.delete();

        for (int i = 0; i < diagramg.getLayerArrayList().size(); i++) {
            for (int j = 0; j < diagramg.getLayerArrayList().get(i).getShapeArrayList().size(); j++)
                System.out.println(diagramg.getLayerArrayList().get(i).getShapeArrayList().get(j).toString());
        }
       diagramg.insertLayer();
       
    }
}
