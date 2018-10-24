/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import location.Location2D;

/**
 *
 * @author CACLV
 */
public class Layer extends JPanel {

    public ArrayList<Shape> shapes = new ArrayList<>();
    protected boolean visible;

    public void init() {
        Shape circle1 = new Circle(50, new Location2D(280, 280), Color.black, true);
        Shape triangle1 = new Triangle(new Location2D(50, 280), new Location2D(50, 350), new Location2D(150, 340),
                Color.red, true);
        Shape triangle2 = new Triangle(new Location2D(100, 50), new Location2D(100, 60), new Location2D(70, 100),
                Color.yellow, true);
        Shape rectangle = new Rectangle(new Location2D(50, 50), 60, 40, Color.blue, true);
        Shape square = new Square(new Location2D(150, 50), 80, 80, Color.MAGENTA, true);
        Shape circle2 = new Circle(0, new Location2D(30, 50), Color.yellow, true);
        Shape hexagon = new Hexagon(new Location2D(400, 400), 50, Color.ORANGE, true);

        shapes.add(circle1);
        shapes.add(square);
        shapes.add(triangle2);
        shapes.add(circle2);
        shapes.add(rectangle);
        shapes.add(triangle1);
        shapes.add(hexagon);
    }

    public void draw(Graphics g) {
        this.setBackground(Color.red);
        this.setSize(600, 600);
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                ((Triangle) shapes.get(i)).draw(g);
            } else if (shapes.get(i) instanceof Circle) {
                ((Circle) shapes.get(i)).draw(g);
            } else if (shapes.get(i) instanceof Rectangle) {
                ((Rectangle) shapes.get(i)).draw(g);
            } else if (shapes.get(i) instanceof Square) {
                ((Square) shapes.get(i)).draw(g);
            } else if (shapes.get(i) instanceof Hexagon) {
                ((Hexagon) shapes.get(i)).draw(g);
            }
            
        }
        
    }

    
    /*public void move(int x, int y, int dx, int dy) {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                ((Triangle) shapes.get(i)).move(x, y, dx, dy);
            } else if (shapes.get(i) instanceof Circle) {
                ((Circle) shapes.get(i)).move(x, y, dx, dy);
            } else if (shapes.get(i) instanceof Rectangle) {
                ((Rectangle) shapes.get(i)).move(x, y, dx, dy);
            } else if (shapes.get(i) instanceof Square) {
                ((Square) shapes.get(i)).move(x, y, dx, dy);
            } else if (shapes.get(i) instanceof Hexagon) {
                ((Hexagon) shapes.get(i)).move(x, y, dx, dy);
            }
            repaint();
        }
    }*/

    public void removeTriangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void removeCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    public void removeSameShapes() {
        for (int i = 0; i < shapes.size() - 1; i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).isSame(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }

    }

    public Layer(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public static void main01(String[] args) {
        JFrame jf = new JFrame("draw Layer");
        //Layer layer = new Layer();
        //jf.add(layer);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 400);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
