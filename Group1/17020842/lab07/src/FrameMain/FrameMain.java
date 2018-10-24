package FrameMain;


import Shapes.Circle;
import Shapes.Hexagon;
import Shapes.Layer;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import location.Location2D;

public class FrameMain extends JPanel {

    @SuppressWarnings("FieldMayBeFinal")
    private Triangle myTri = new Triangle(new Location2D(50, 280), new Location2D(50, 350), new Location2D(150, 340),
            Color.red, true);

    @SuppressWarnings("FieldMayBeFinal")
    private Circle myCir = new Circle(50, new Location2D(280, 280), Color.black, true);

    @SuppressWarnings("FieldMayBeFinal")
    private Rectangle myRect = new Rectangle(new Location2D(50, 50), 60, 40, Color.blue, true);

    @SuppressWarnings("FieldMayBeFinal")
    private Square mySq = new Square(new Location2D(150, 50), 80, 80, Color.MAGENTA, true);

    @SuppressWarnings("FieldMayBeFinal")
    private Hexagon myHex = new Hexagon(new Location2D(400, 400), 50, Color.ORANGE, true);

    // khởi tạo một list gồm các hình
    @SuppressWarnings("FieldMayBeFinal")
    private Layer mylayer = new Layer(true);

    MovingAdapter ma = new MovingAdapter();

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameMain() {
        addMouseMotionListener(ma);
        addMouseListener(ma);
        addMouseWheelListener(new ScaleHandler());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // vẽ các hình trong danh sách
        for (int i = 0; i < mylayer.shapes.size(); i++) {
            if (mylayer.shapes.get(i) instanceof Triangle) {
                myTri = ((Triangle) mylayer.shapes.get(i));
            } else if (mylayer.shapes.get(i) instanceof Circle) {
                myCir = ((Circle) mylayer.shapes.get(i));
            } else if (mylayer.shapes.get(i) instanceof Rectangle) {
                myRect = ((Rectangle) mylayer.shapes.get(i));
            } else if (mylayer.shapes.get(i) instanceof Square) {
                mySq = ((Square) mylayer.shapes.get(i));
            } else if (mylayer.shapes.get(i) instanceof Hexagon) {
                myHex = ((Hexagon) mylayer.shapes.get(i));
            }
        }
        myHex.draw(g);
        myTri.draw(g);
        mySq.draw(g);
        myRect.draw(g);
        myCir.draw(g);

    }

    // class sử lí sự kiện click chuột
    class MovingAdapter extends MouseAdapter {

        private int x;
        private int y;

        // lấy ra tọa độ khi click chuột
        @Override
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }

        // giữ chuột và di chuyển hình , kiểm tra nếu tọa độ của chuột nằm trong phạm vi của hình thì hình di chuyển theo chuột
        @Override
        public void mouseDragged(MouseEvent e) {

            int dx = e.getX() - x;
            int dy = e.getY() - y;

            // di chuyển hình (bug: do dùng if else nên khi các hình trùng nhau thì sẽ ưu tiên theo thứ tự bên dưới)
            if (myRect.contain(x, y)) {
                myRect.getFirstD().setX(dx + myRect.getFirstD().getX());
                myRect.getFirstD().setY(dy + myRect.getFirstD().getY());

                if (myRect.getFirstD().getX() < 0) {
                    myRect.getFirstD().setX(0);
                } else if (myRect.getFirstD().getX() > 550) {
                    myRect.getFirstD().setX(550);
                }

                if (myRect.getFirstD().getY() < 0) {
                    myRect.getFirstD().setY(0);
                } else if (myRect.getFirstD().getY() > 550) {
                    myRect.getFirstD().setY(550);
                }

            } else if (myCir.contain(x, y)) {
                myCir.getCenterD().setX(dx + myCir.getCenterD().getX());
                myCir.getCenterD().setY(dy + myCir.getCenterD().getY());

                if (myCir.getCenterD().getX() < 0) {
                    myCir.getCenterD().setX(0);
                } else if (myCir.getCenterD().getX() > 600 - myCir.getRadius()) {
                    myCir.getCenterD().setX(600 - myCir.getRadius());
                }

                if (myCir.getCenterD().getY() < 0) {
                    myCir.getCenterD().setY(0);
                } else if (myCir.getCenterD().getY() > 600 - myCir.getRadius()) {
                    myCir.getCenterD().setY(600 - myCir.getRadius());
                }

            } else if (mySq.contain(x, y)) {
                mySq.getFirstD().setX(dx + mySq.getFirstD().getX());
                mySq.getFirstD().setY(dy + mySq.getFirstD().getY());

                if (mySq.getFirstD().getX() < 0) {
                    mySq.getFirstD().setX(0);
                } else if (mySq.getFirstD().getX() > 550) {
                    mySq.getFirstD().setX(550);
                }

                if (mySq.getFirstD().getY() < 0) {
                    mySq.getFirstD().setY(0);
                } else if (mySq.getFirstD().getY() > 550) {
                    mySq.getFirstD().setY(550);
                }
            } else if (myTri.contain(x, y)) {
                myTri.getFirstD().setX(dx + myTri.getFirstD().getX());
                myTri.getFirstD().setY(dy + myTri.getFirstD().getY());

                myTri.getSecondD().setX(dx + myTri.getSecondD().getX());
                myTri.getSecondD().setY(dy + myTri.getSecondD().getY());

                myTri.getThirdD().setX(dx + myTri.getThirdD().getX());
                myTri.getThirdD().setY(dy + myTri.getThirdD().getY());

                if (myTri.getFirstD().getX() < 0) {
                    myTri.getFirstD().setX(0);
                } else if (myTri.getFirstD().getX() > 600) {
                    myTri.getFirstD().setX(600);
                }

                if (myTri.getFirstD().getY() < 0) {
                    myTri.getFirstD().setY(0);
                } else if (myTri.getFirstD().getY() > 600) {
                    myTri.getFirstD().setY(600);
                }

                if (myTri.getSecondD().getX() < 0) {
                    myTri.getSecondD().setX(0);
                } else if (myTri.getSecondD().getX() > 600) {
                    myTri.getSecondD().setX(600);
                }

                if (myTri.getSecondD().getY() < 0) {
                    myTri.getSecondD().setY(0);
                } else if (myTri.getSecondD().getY() > 600) {
                    myTri.getSecondD().setY(600);
                }

                if (myTri.getThirdD().getX() < 0) {
                    myTri.getThirdD().setX(0);
                } else if (myTri.getThirdD().getX() > 600) {
                    myTri.getThirdD().setX(600);
                }

                if (myTri.getThirdD().getY() < 0) {
                    myTri.getThirdD().setY(0);
                } else if (myTri.getThirdD().getY() > 600) {
                    myTri.getThirdD().setY(600);
                }

            } else if (myHex.contain(x, y)) {
                myHex.getCenterD().setX(dx + myHex.getCenterD().getX());
                myHex.getCenterD().setY(dy + myHex.getCenterD().getY());

                if (myHex.getCenterD().getX() < 0) {
                    myHex.getCenterD().setX(0);
                } else if (myHex.getCenterD().getX() > 600 - myHex.getSide()) {
                    myHex.getCenterD().setX(600 - myHex.getSide());
                }

                if (myHex.getCenterD().getY() < 0) {
                    myHex.getCenterD().setY(0);
                } else if (myHex.getCenterD().getY() > 600 - myHex.getSide()) {
                    myHex.getCenterD().setY(600 - myHex.getSide());
                }
            }
            repaint();

            x += dx;
            y += dy;

        }
    }

    // class tăng kích thước hình bằng con lăn chuột 
    class ScaleHandler implements MouseWheelListener {

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

            int x = e.getX();
            int y = e.getY();

            if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {

                if (myRect.contain(x, y)) {
                    float amount = e.getWheelRotation() * 3f;
                    myRect.setWidth(myRect.getWidth() - (int) amount);
                    myRect.setLength(myRect.getLength() - (int) amount);
                } else if (mySq.contain(x, y)) {
                    float amount = e.getWheelRotation() * 3f;
                    mySq.setWidth(mySq.getWidth() - (int) amount);
                    mySq.setLength(mySq.getLength() - (int) amount);
                } else if (myCir.contain(x, y)) {
                    float amount = e.getWheelRotation() * 3f;
                    myCir.setRadius(myCir.getRadius() - (int) amount);
                } else if (myHex.contain(x, y)) {
                    float amount = e.getWheelRotation() * 3f;
                    myHex.setSide(myHex.getSide() - (int) amount);
                }
                repaint();

            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving and Scaling");
        FrameMain m = new FrameMain();

        m.setDoubleBuffered(true);
        frame.getContentPane().add(m);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
