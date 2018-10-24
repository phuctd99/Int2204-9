import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Paint extends JComponent {
    private Point startDrag, endDrag;
    private Shape temp;
    private ArrayList<Layer> listLayer = new ArrayList<>();
    private Layer defaultLayer = new Layer();
    private Layer rectangleLayer = new Layer();
    private Layer squareLayer = new Layer();
    private Layer circletLayer = new Layer();
    private Layer triangleLayer = new Layer();
    private Layer hexagonLayer = new Layer();
    private ArrayList<Shape> listShape = new ArrayList<>();
    private ArrayList<Shape> listShape1 = new ArrayList<>();
    private ArrayList<Shape> listShape2 = new ArrayList<>();
    private ArrayList<Shape> listShape3 = new ArrayList<>();
    private ArrayList<Shape> listShape4 = new ArrayList<>();
    private ArrayList<Shape> listShape5 = new ArrayList<>();
    private Point []arr = new Point[3];
    private int check = 0;
    public Paint() {
        defaultLayer.setListShape(listShape);
        rectangleLayer.setListShape(listShape1);
        squareLayer.setListShape(listShape2);
        circletLayer.setListShape(listShape3);
        triangleLayer.setListShape(listShape4);
        hexagonLayer.setListShape(listShape5);
        listLayer.add(defaultLayer);
        listLayer.add(rectangleLayer);
        listLayer.add(squareLayer);
        listLayer.add(circletLayer);
        listLayer.add(triangleLayer);
        listLayer.add(hexagonLayer);
        Diagram.listLayer = listLayer;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startDrag = new Point(e.getX(), e.getY());
                endDrag = startDrag;
                if (Diagram.selection.equals("Move")) {
                    for (int i = Diagram.listLayer.get(0).getListShape().size() - 1; i >= 0; i--) {
                        Shape shape = Diagram.listLayer.get(0).getListShape().get(i);
                        if(shape.contains(startDrag)) {
                            temp = shape;
                            Diagram.listLayer.get(0).getListShape().remove(shape);
                            break;
                        }
                    }
                }
                else if(Diagram.selection.equals("Delete")) {
                    for (int i = 0; i < Diagram.listLayer.size(); i++) {
                        for (int j = Diagram.listLayer.get(i).getListShape().size() - 1; j >= 0; j--) {
                            if (Diagram.listLayer.get(i).getListShape().get(j).contains(startDrag)) {
                                temp = Diagram.listLayer.get(i).getListShape().get(j);
                                Diagram.listLayer.get(i).getListShape().remove(j);
                                repaint();
                                return;
                            }
                        }
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                Point p = new Point(e.getX(), e.getY());
                if (null != Diagram.selection) {
                    switch (Diagram.selection) {
                        case "Rectangle": {
                            Rectangle rectangle = new Rectangle(startDrag, Math.abs(startDrag.x - p.x), Math.abs(startDrag.y - p.y));
                            Diagram.listLayer.get(0).getListShape().add(rectangle);
                            break;
                        }
                        case  "Circle": {
                            Circle circle = new Circle(startDrag, Math.abs(startDrag.x - p.x));
                            Diagram.listLayer.get(0).getListShape().add(circle);
                            break;
                        }
                        case  "Square": {
                            Square square = new Square(startDrag, Math.abs(startDrag.x - p.x), Math.abs(startDrag.x - p.x));
                            Diagram.listLayer.get(0).getListShape().add(square);
                            break;
                        }
                        case "Triangle": {
                            if (check != 2 ) {
                                arr[check] = p;
                                check++;
                            }
                            else if(check == 2) {
                                arr[check] = p;
                                check = 0;
                                Triangle triangle = new Triangle(arr[0], arr[1], arr[2]);
                                Diagram.listLayer.get(0).getListShape().add(triangle);
                            }
                            break;
                        }
                        case "Move": {
                            if (temp.contains(startDrag)) {
                                temp.move(startDrag, p);
                                Diagram.listLayer.get(0).getListShape().add(temp);
                            }
                            break;
                        }
                        case "Fill": {
                            for (int i = 0; i <  Diagram.listLayer.get(0).getListShape().size(); i++) {
                                Shape shape = Diagram.listLayer.get(0).getListShape().get(i);
                                if (shape.contains(startDrag)) {
                                    shape.setColor(Diagram.selectionColor);
                                    break;
                                }
                            }
                        }
                        default:
                            break;
                    }
                }
                startDrag = null;
                endDrag = null;
                repaint();
            }


        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                endDrag = new Point(e.getX(), e.getY());
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        for (int i = 0; i < Diagram.listLayer.get(0).getListShape().size(); i++) {
            if (Diagram.listLayer.get(0).isVisible() == true)
                Diagram.listLayer.get(0).getListShape().get(i).draw(g);
        }
        if (startDrag != null && endDrag != null) {
            if (null != Diagram.selection) {
                switch (Diagram.selection) {
                    case "Rectangle": {
                        Rectangle rectangle = new Rectangle(startDrag, Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));
                        rectangle.draw(g);
                        break;
                    }
                    case "Circle": {
                        Circle circle = new Circle(startDrag, Math.abs(startDrag.x - endDrag.x));
                        circle.draw(g);
                        break;
                    }
                    case "Square": {
                        Square square = new Square(startDrag, Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.x - endDrag.x));
                        square.draw(g);
                        break;
                    }
                    case "Move": {
                        if (temp instanceof Rectangle) {
                            Rectangle r = (Rectangle) temp;
                            if (r.contains(startDrag)) {
                                graphics2D.drawRect(r.getPoint().x, r.getPoint().y, r.getWidth(), r.getHeight());
                            }
                        }
                    }

                    default:
                        break;
                }
            }
        }
    }
    public void deleteClone() {
        for (int i = listLayer.get(0).getListShape().size() - 1; i >=1 ;i --) {
            for (int j = i -1; j >= 0; j--) {
                if (listLayer.get(0).getListShape().get(i) instanceof Rectangle && listLayer.get(0).getListShape().get(j) instanceof Rectangle) {
                    if (((Rectangle) listLayer.get(0).getListShape().get(i)).getPoint() == ((Rectangle) listLayer.get(0).getListShape().get(j)).getPoint() &&
                            ((Rectangle) listLayer.get(0).getListShape().get(i)).getWidth() == ((Rectangle) listLayer.get(0).getListShape().get(j)).getWidth()
                    && ((Rectangle) listLayer.get(0).getListShape().get(i)).getHeight() == ((Rectangle) listLayer.get(0).getListShape().get(j)).getHeight()) {
                        listLayer.get(0).getListShape().remove(i);
                        break;
                    }

                }
                else if (listLayer.get(0).getListShape().get(i) instanceof Square && listLayer.get(0).getListShape().get(j) instanceof Square) {
                    if (((Square) listLayer.get(0).getListShape().get(i)).getPoint() == ((Square) listLayer.get(0).getListShape().get(j)).getPoint() &&
                            ((Square) listLayer.get(0).getListShape().get(i)).getHeight() == ((Square) listLayer.get(0).getListShape().get(j)) .getHeight()) {
                        listLayer.get(0).getListShape().remove(i);
                        break;
                    }
                }
                else if (listLayer.get(0).getListShape().get(i) instanceof Circle && listLayer.get(0).getListShape().get(j) instanceof Circle) {
                    if (((Circle) listLayer.get(0).getListShape().get(i)).getPoint() == ((Square) listLayer.get(0).getListShape().get(j)).getPoint() &&
                            ((Circle) listLayer.get(0).getListShape().get(i)).getRadius() == ((Circle) listLayer.get(0).getListShape().get(i)).getRadius()) {
                        listLayer.get(0).getListShape().remove(i);
                        break;
                    }
                }
                else if (listLayer.get(0).getListShape().get(i) instanceof Triangle && listLayer.get(0).getListShape().get(j) instanceof Triangle) {
                    if (((Triangle) listLayer.get(0).getListShape().get(i)).getP1().x == ((Triangle) listLayer.get(0).getListShape().get(j)).getP1().x &&
                            ((Triangle) listLayer.get(0).getListShape().get(i)).getP1().y == ((Triangle) listLayer.get(0).getListShape().get(j)).getP1().y &&
                            ((Triangle) listLayer.get(0).getListShape().get(i)).getP2().x == ((Triangle) listLayer.get(0).getListShape().get(j)).getP2().x &&
                            ((Triangle) listLayer.get(0).getListShape().get(i)).getP2().y == ((Triangle) listLayer.get(0).getListShape().get(j)).getP2().y &&
                            ((Triangle) listLayer.get(0).getListShape().get(i)).getP3().x == ((Triangle) listLayer.get(0).getListShape().get(j)).getP3().x &&
                            ((Triangle) listLayer.get(0).getListShape().get(i)).getP3().y == ((Triangle) listLayer.get(0).getListShape().get(j)).getP3().y
                    ) {
                        listLayer.get(0).getListShape().remove(i);
                        break;
                    }

                }
//                else if (listLayer.get(0).getListShape().get(i) instanceof Hexagon && listLayer.get(0).getListShape().get(j) instanceof Hexagon) {
//
//                }
            }
        }
    }
    public void classify() {
        for (int i = 0; i < listLayer.get(0).getListShape().size(); i++) {
            if (listLayer.get(0).getListShape().get(i) instanceof Rectangle)
                listLayer.get(1).getListShape().add(listLayer.get(0).getListShape().get(i));
            else if (listLayer.get(0).getListShape().get(i) instanceof Square)
                listLayer.get(2).getListShape().add(listLayer.get(0).getListShape().get(i));
            else if (listLayer.get(0).getListShape().get(i) instanceof Circle)
                listLayer.get(3).getListShape().add(listLayer.get(0).getListShape().get(i));
            else if (listLayer.get(0).getListShape().get(i) instanceof Triangle)
                listLayer.get(4).getListShape().add(listLayer.get(0).getListShape().get(i));
            else if (listLayer.get(0).getListShape().get(i) instanceof Hexagon)
                listLayer.get(5).getListShape().add(listLayer.get(0).getListShape().get(i));
        }
    }
}
