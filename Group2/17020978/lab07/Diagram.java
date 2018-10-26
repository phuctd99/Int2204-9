import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class Diagram extends JPanel {

         Layer layer1 = new Layer();

         int[] xPoint= {300,400,200};
         int[] yPoint= {300,450,450};

        public void removecircle()
        {
                for(int i=0; i<layer1.layer.size(); i++)
                {
                    if(layer1.layer.get(i) instanceof Circle)
                    {
                        layer1.layer.remove(i);
                        i--;
                    }
                }
        }

        public void paintComponent(Graphics graphics)
        {
            //draw rectangle
            super.paintComponent(graphics);
            graphics.setColor(Color.blue);

            Circle circle = new Circle(1,1,100,"black", true);
            graphics.drawOval(circle.getX(),circle.getY(),(int)circle.getRadius()*2,(int)circle.getRadius()*2);
//            graphics.drawRect(300,1,100,40);
//            graphics.fillRect(50,50,70,40);
//
//            //draw cicrle
//            graphics.drawOval(100,100,30,30);
//            graphics.fillOval(140,140,30,40);
//
//            //draw square
//            graphics.fillRect(200,200,50,50);

            //graphics.fillPolygon(xPoint,yPoint,3);

            Triangle triangle = new Triangle(1,1,300,400,200,300,450,450,"blue",true);
            graphics.drawPolygon(triangle.getxPoint(),triangle.getyPoint(),3);


            Rectangle rectangle = new Rectangle(300,100,120,150,"blue",true);
            graphics.drawRect(rectangle.getX(),rectangle.getY(),rectangle.getWidth(),rectangle.getLength());

            Square square = new Square(500,200,200,"blue",true);
            graphics.drawRect(square.getX(),square.getY(),square.getSide(),square.getSide());

            Hexagon hexagon = new Hexagon(300,300,100,"blue",true);
            Polygon p = new Polygon();
            for(int i=2; i<=8; i++)
            {
                p.addPoint( (int)(300 + hexagon.getRadius() * Math.cos( i * 2 * Math.PI / 6)),
                        (int)(300 + hexagon.getRadius() * Math.sin( i *2 * Math.PI /6)));
            }
            graphics.drawPolygon(p);
        }

        public void vehinh()
        {
            Diagram diagram = new Diagram();
            JFrame frame = new JFrame();


            frame.setTitle("Shape");
            frame.setLocationRelativeTo(null);
            frame.setSize(400,300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.add(diagram);
        }
}
