import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Hinh extends JPanel implements ActionListener {
    static Scanner scan = new Scanner(System.in);
    
// thuoc tinh cho Triangle
    PaintHinh p1 = new PaintHinh(50, 50);
    PaintHinh p2 = new PaintHinh(150, 50);
    PaintHinh p3 = new PaintHinh(50, 200);
    
    // thuoc tinh cho Hexagon
    int dai = 80;
    PaintHinh p4 = new PaintHinh(160, 100);
    PaintHinh p5 = new PaintHinh((p4.x + dai), p4.y);
    PaintHinh p6 = new PaintHinh(p4.x + 3 * dai / 2, (int) (p4.y + Math.sqrt(3) * dai / 2));
    PaintHinh p7 = new PaintHinh(p4.x + dai, (int) (p4.y + Math.sqrt(3) * dai));
    PaintHinh p8 = new PaintHinh(p4.x, (int) (p4.y + Math.sqrt(3) * dai));
    PaintHinh p9 = new PaintHinh(p4.x - dai / 2, (int) (p4.y + Math.sqrt(3) * dai / 2));

    // Khoi tao hinh
    Rectangle rectangle = new Rectangle(60, 90, 250, 250, Color.BLUE);
    
    Circle circle1 = new Circle(40, 500, 80, Color.RED);
    Square square = new Square(40, 30, 30, Color.PINK);
    Triangle triangle = new Triangle(p1, p2, p3, Color.DARK_GRAY);
    Hexagon hexagon = new Hexagon(p4, p5, p6, p7, p8, p9, Color.MAGENTA);
    Square square1 = new Square(100, 60, 60, Color.PINK);
 

    Timer time;
    public static Layer layer = new Layer(true);
    public static Layer layer1 = new Layer(true);
    ArrayList<Shape> list = new ArrayList<>();
    public static Diagram diagram = new Diagram();

    public Hinh() {
        this.setFocusable(true);
        time = new Timer(30, this);
        
        time.start();
        layer.shape.add(square);
        layer.shape.add(square1);
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
        g.fillRect(0, 0, test.WIDTH, test.HEIGHT);
        if (diagram.layer.get(1).visible == true) {
            for (int i = 0; i < diagram.layer.get(1).shape.size(); i++) {
                diagram.layer.get(1).shape.get(i).paint(g);
            }
        }
    }
    
    // Lua chon hinh muon chuyen
    static int c;
    
    public static void seLect() {
        c = scan.nextInt();
    }
    
    // Up date cac hinh de di chuyen
    public void update() {
        switch (c) {
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
                circle1.update();
                break;
            case 5:
                hexagon.update();
                break;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        update();
    }
}