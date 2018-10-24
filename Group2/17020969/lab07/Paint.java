import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Paint extends JPanel implements ActionListener {
    static Scanner scan = new Scanner(System.in);
    // thuoc tinh cho Hexagon
    int dai = 90;
    VeHinh p4 = new VeHinh(170, 100);
    VeHinh p5 = new VeHinh((p4.x + dai), p4.y);
    VeHinh p6 = new VeHinh(p4.x + 3 * dai / 2, (int) (p4.y + Math.sqrt(3) * dai / 2));
    VeHinh p7 = new VeHinh(p4.x + dai, (int) (p4.y + Math.sqrt(3) * dai));
    VeHinh p8 = new VeHinh(p4.x, (int) (p4.y + Math.sqrt(3) * dai));
    VeHinh p9 = new VeHinh(p4.x - dai / 2, (int) (p4.y + Math.sqrt(3) * dai / 2));
    
    // thuoc tinh cho Triangle
    VeHinh p1 = new VeHinh(50, 50);
    VeHinh p2 = new VeHinh(150, 50);
    VeHinh p3 = new VeHinh(50, 200);

    // Khoi tao hinh
    Rectangle rectangle = new Rectangle(60, 90, 250, 250, Color.BLUE);
    Circle circle = new Circle(40, 200, 80, Color.RED);
    Circle circle1 = new Circle(40, 200, 80, Color.RED);
    Circle circle2 = new Circle(20, 100, 80, Color.RED);
    Square square = new Square(60, 30, 30, Color.GRAY);
    Triangle triangle = new Triangle(p1, p2, p3, Color.DARK_GRAY);
    Hexagon hexagon = new Hexagon(p4, p5, p6, p7, p8, p9, Color.MAGENTA);

    // Khởi tạo thoi gian
    Timer timer;
    public static Layer layer = new Layer(true);
    public static Layer layer1 = new Layer(true);
    ArrayList<Shape> list = new ArrayList<>();
    public static Diagram diagram = new Diagram();

    public Paint() {
        this.setFocusable(true);
        timer = new Timer(50, this);
        timer.start();
        layer.shape.add(rectangle);
        layer.shape.add(square);
        layer.shape.add(circle);
        layer.shape.add(triangle);
        layer.shape.add(hexagon);
        layer.shape.add(circle1);
        layer.shape.add(circle2);
        layer.xoaCircleTrungNhau();
        diagram.layer.add(layer);
        diagram.circleToLayer(list);
        for (int i = 0; i < list.size(); i++) {
            layer1.shape.add(list.get(i));
        }
        diagram.layer.add(layer1);
        System.out.println(list.size());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, testmain.WIDTH, testmain.HEIGHT);
        if (diagram.layer.get(1).visible == true) {
            for (int i = 0; i < diagram.layer.get(1).shape.size(); i++) {
                diagram.layer.get(1).shape.get(i).paint(g);
            }
        }
    }
    // Lua chon hinh muon chuyen
    static int a;
    public static void seLect() {
        a = scan.nextInt();
    }
    // Up date cac hinh de di chuyen
    public void update() {
        switch (a) {
            case 1:
                rectangle.update();
                break;
            case 2:
                square.update();
                break;
            case 3:
                triangle.update();
                break;
            case 4:
                circle2.update();
                break;
            case 5:
                hexagon.update();
                break;
            case 6: {
                rectangle.update();
                circle2.update();
                square.update();
                triangle.update();
                hexagon.update();
                break;
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        update();
    }
}