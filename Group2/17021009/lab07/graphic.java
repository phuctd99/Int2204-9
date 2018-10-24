package Tuan7;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//vẽ hình
public class graphic extends JFrame {
    //khởi tạo các hình để vẽ
    public diagram diagram = new diagram(600, 600);
    public shape circle = new circle("RED", true, new point(50, 50), 50, true);
    public shape rect = new rectangle("PINK", false, new point(50, 250), new point(190,300), true);
    public shape square = new square("BLUE", false, new point(200,60), new point(270,130), true);
    public shape triangle = new triangle("YELLOW", true, new point(300,300), new point(450,300), new point(340,390), true);
    public shape hexagon = new hexagon("GREEN", true, new point(150, 150), new point(200, 150), new point(230, 170),
            new point(200, 190), new point(150, 190), new point(120, 170), true);


    //set JFrame
    public graphic() {
        setTitle("Drawing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(diagram.getWidth(), diagram.getHeight());
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setBackground(Color.GREEN);
        setVisible(true);
    }

    public static void main(String[] args) {
        // run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new graphic();
            }
        });
    }

    //vẽ hình
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D draw = (Graphics2D) g;

        // render cho ảnh mịn hơn
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        draw.setRenderingHints(rh);

        // bắt đầu vẽ
        //vẽ hình tròn
        if( circle.isVisible()) {
            if( circle.isFilled()) {
                draw.setColor(Color.RED);
                draw.fillArc(((circle) circle).getCenter().getX(),((circle) circle).getCenter().getY(),((circle) circle).getRadius(),
                        ((circle) circle).getRadius(),0,360);
            }
            else {
                draw.setColor(Color.RED);
                draw.drawArc(((circle) circle).getCenter().getX(),((circle) circle).getCenter().getY(),((circle) circle).getRadius(),
                        ((circle) circle).getRadius(),0,360);
            }
        }


        //vẽ hình chữ nhật
        if( rect.isVisible()) {
            if(rect.isFilled()) {
                draw.setColor(Color.PINK);
                draw.fillRect(((rectangle) rect).getBot_right().getX(), ((rectangle) rect).getBot_right().getY(),
                        ((rectangle) rect).getWidth(), ((rectangle) rect).getHeight());
            }
            else {
                draw.setColor(Color.PINK);
                draw.drawRect(((rectangle) rect).getBot_right().getX(), ((rectangle) rect).getBot_right().getY(),
                        ((rectangle) rect).getWidth(), ((rectangle) rect).getHeight());
            }
        }

        //ve hinh vuong
        if( square.isVisible()) {
            if(square.isFilled()) {
                draw.setColor(Color.BLUE);
                draw.fillRect(((square) square).getBot_right().getX(), ((square) square).getBot_right().getY(),
                        ((square) square).getWidth(), ((square) square).getWidth());
            }
            else {
                draw.setColor(Color.BLUE);
                draw.drawRect(((square) square).getBot_right().getX(), ((square) square).getBot_right().getY(),
                        ((square) square).getWidth(), ((square) square).getWidth());
            }
        }

        //ve hinh tam giac
        draw.drawPolyline(new int[] {((triangle) triangle).getXOfP1(), ((triangle) triangle).getXOfP2(), ((triangle) triangle).getXOfP3(), ((triangle) triangle).getXOfP1()},
                new int[]{ ((triangle) triangle).getYOfP1(), ((triangle) triangle).getYOfP2(), ((triangle) triangle).getYOfP3(), ((triangle) triangle).getYOfP1()} , 4);
        if( triangle.isVisible()) {
            if(triangle.isFilled()) {
                draw.setColor(Color.YELLOW);
                draw.fillPolygon(new int[] {((triangle) triangle).getXOfP1(), ((triangle) triangle).getXOfP2(), ((triangle) triangle).getXOfP3(), ((triangle) triangle).getXOfP1()},
                        new int[]{ ((triangle) triangle).getYOfP1(), ((triangle) triangle).getYOfP2(), ((triangle) triangle).getYOfP3(), ((triangle) triangle).getYOfP1()} , 4);
            }
            else {
                draw.setColor(Color.YELLOW);
                draw.drawPolyline(new int[] {((triangle) triangle).getXOfP1(), ((triangle) triangle).getXOfP2(), ((triangle) triangle).getXOfP3(), ((triangle) triangle).getXOfP1()},
                        new int[]{ ((triangle) triangle).getYOfP1(), ((triangle) triangle).getYOfP2(), ((triangle) triangle).getYOfP3(), ((triangle) triangle).getYOfP1()} , 4);
            }
        }

        //vẽ hình lục giác
        if( hexagon.isVisible()) {
            if(hexagon.isFilled()) {
                draw.setColor(Color.GREEN);
                draw.fillPolygon(new int[] {((hexagon) hexagon).getXOfP1(), ((hexagon) hexagon).getXOfP2(), ((hexagon) hexagon).getXOfP3(), ((hexagon) hexagon).getXOfP4(),
                                ((hexagon) hexagon).getXOfP5(), ((hexagon) hexagon).getXOfP6(), ((hexagon) hexagon).getXOfP1()},
                        new int[] {((hexagon) hexagon).getYOfP1(), ((hexagon) hexagon).getYOfP2(), ((hexagon) hexagon).getYOfP3(), ((hexagon) hexagon).getYOfP4(),
                                ((hexagon) hexagon).getYOfP5(), ((hexagon) hexagon).getYOfP6(), ((hexagon) hexagon).getYOfP1()},
                        7);
            }
            else {
                draw.setColor(Color.GREEN);
                draw.drawPolyline(new int[] {((hexagon) hexagon).getXOfP1(), ((hexagon) hexagon).getXOfP2(), ((hexagon) hexagon).getXOfP3(), ((hexagon) hexagon).getXOfP4(),
                                ((hexagon) hexagon).getXOfP5(), ((hexagon) hexagon).getXOfP6(), ((hexagon) hexagon).getXOfP1()},
                        new int[] {((hexagon) hexagon).getYOfP1(), ((hexagon) hexagon).getYOfP2(), ((hexagon) hexagon).getYOfP3(), ((hexagon) hexagon).getYOfP4(),
                                ((hexagon) hexagon).getYOfP5(), ((hexagon) hexagon).getYOfP6(), ((hexagon) hexagon).getYOfP1()},
                        7);
            }
        }

    }



}
