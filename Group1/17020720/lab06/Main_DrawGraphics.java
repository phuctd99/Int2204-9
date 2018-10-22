package DrawGraphics;

import BaiTapTuan6.Main;

import javax.swing.*;
import java.awt.*;

public class Main_DrawGraphics extends JFrame {
    Diagram diagram = new Diagram();
    Layer layerCircle = new Layer();
    Layer layerRectangle = new Layer();
    Layer layerSquare = new Layer();

    public Main_DrawGraphics() {
        initUI();
    }

    private void initUI() {
        Diagram rectangle2 = new Rectangle(Color.GREEN, true, "Rectangle", 100, 70, 250, 150);
        diagram.listDiagram.add(rectangle2);
        Diagram circle1 = new Circle(Color.RED, true, "Circle", 130, 300, 50);
        diagram.listDiagram.add(circle1);
        Diagram circle2 = new Circle(Color.YELLOW, true, "Circle", 20, 30, 50);
        diagram.listDiagram.add(circle2);
        Diagram square1 = new Square(Color.YELLOW, true, "Square", 500, 700, 100, 50);
        diagram.listDiagram.add(square1);
        Diagram rectangle1 = new Rectangle(Color.BLUE, true, "Rectangle", 100, 70, 160, 150);
        diagram.listDiagram.add(rectangle1);

        for(int i = 0; i < diagram.listDiagram.size(); i++){
            if(diagram.listDiagram.get(i).getName().equals("Circle")){
                layerCircle.listDiagram.add(diagram.listDiagram.get(i));
            }else if(diagram.listDiagram.get(i).getName().equals("Rectangle")){
                layerRectangle.listDiagram.add(diagram.listDiagram.get(i));
            }else{
                layerSquare.listDiagram.add(diagram.listDiagram.get(i));
            }
        }

//        for(int i = 0; i < layerCircle.listDiagram.size() - 1; i++){
//            for (int j = i + 1; j < layerCircle.listDiagram.size(); j++){
//                if((layerCircle.listDiagram.get(i).getX() == layerCircle.listDiagram.get(j).getX()) &&
//                        (layerCircle.listDiagram.get(i).getY() == layerCircle.listDiagram.get(j).getY()) &&
//                        (layerCircle.listDiagram.get(i).get == layerCircle.listDiagram.get(j).getX()))
//            }
//        }

        for(int i = 0; i < layerRectangle.listDiagram.size() - 1; i++){
            for (int j = i + 1; j < layerRectangle.listDiagram.size(); j++){
                if((layerRectangle.listDiagram.get(i).getX() == layerRectangle.listDiagram.get(j).getX()) &&
                        (layerRectangle.listDiagram.get(i).getY() == layerRectangle.listDiagram.get(j).getY()) &&
                        (layerRectangle.listDiagram.get(i).getWidth() == layerCircle.listDiagram.get(j).getWidth())&&
                        (layerRectangle.listDiagram.get(i).getHeight() == layerCircle.listDiagram.get(j).getHeight()));
            }
        }

        System.out.println("Layer Rectangle: ");
        for(int i = 0; i < layerRectangle.listDiagram.size(); i++){
            System.out.println(layerRectangle.listDiagram.get(i));
        }


//        add(rectangle2);
//        add(square1);
//        add(rectangle1);
        add(circle2);
        setTitle("Tuan 7");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main_DrawGraphics main = new Main_DrawGraphics();
                main.setVisible(true);
            }
        });
    }



}
