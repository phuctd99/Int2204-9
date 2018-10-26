
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class Layer extends JFrame{
    
    public Layer() {
         
        initUI();
    }
     
    private void initUI() {
        //Mới thêm
        MovingAdapter ma = new MovingAdapter();
 
        addMouseMotionListener(ma);
        addMouseListener(ma);
        addMouseWheelListener(new ScaleHandler());
        //end
        setTitle("Shape");
        setLayout(null);
        JPanel p = new JPanel();
        setSize(1000, 1000);
        p.setSize(1000, 1000);
        getContentPane().add(p);
//        Square sq = new Square();
//        sq.NhapThongTIn();
//        p.add(sq);
//        
//        p.add(new Square(350,100,50,RED));
//        p.add(new Circle(50, 80, 30,YELLOW));
//        p.add(new Hexagon(100, 100, 50, RED));
//        p.add(new Rectangle(50, 50, 80,20, PINK));
//        
//        p.add(new Triangle(50, 50, 145, 50, 50, 145, BLACK));
        
//        add(new Rectangle(10, 10, 10, 50, 50, 50, BLUE));
//        add(new Circle(50 , 50 , 100, PINK));

        Input();
        for(int i = 0; i < layer.size(); i++){
            p.add(layer.get(i));
        }
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // mới thêm
    class MovingAdapter extends MouseAdapter {
 
        private int x;
        private int y;
 
        @Override
        public void mousePressed(MouseEvent e) {
             
            x = e.getX();
            y = e.getY();
        }
 
        @Override
        public void mouseDragged(MouseEvent e) {
 
            doMove(e);
        }   
         
        private void doMove(MouseEvent e) {
             
            int dx = e.getX() - x;
            int dy = e.getY() - y;
            if (s1.isHit(x, y)) {
                 
                s1.addX(dx);
                s1.addY(dy);
                repaint();
            }
            if (s2.isHit(x, y)) {
                 
                s2.addX(dx);
                s2.addY(dy);
                repaint();
            }
            if (s3.isHit(x, y)) {
                 
                s3.addX(dx);
                s3.addY(dy);
                repaint();
            }
 
            if (s4.isHit(x, y)) {
                 
                s4.addX(dx);
                s4.addY(dy);
                repaint();
            }
            if (s5.isHit(x, y)) {
                 
                s5.addX(dx);
                s5.addY(dy);
                repaint();
            }
 
            x += dx;
            y += dy;            
        }
    }
    class ScaleHandler implements MouseWheelListener {
         
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
 
            doScale(e);
        }
         
        private void doScale(MouseWheelEvent e) {
             
            int x = e.getX();
            int y = e.getY();
 
            if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
                if (s1.isHit(x, y)) {                     
                    int amount =  (int)e.getWheelRotation() * 5;
                    s1.addWidth(amount);
                    s1.addHeight(amount);
                    repaint();
                }
                if (s2.isHit(x, y)) {                     
                    int amount =  (int)e.getWheelRotation() * 5;
                    s2.addWidth(amount);
                    s2.addHeight(amount);
                    repaint();
                }
//                if (s3.isHit(x, y)) {                     
//                    int amount =  (int)e.getWheelRotation() * 5;
//                    s3.addWidth(amount);
//                    s3.addHeight(amount);
//                    repaint();
//                }
                
                if (s4.isHit(x, y)) {                     
                    int amount =  (int)e.getWheelRotation() * 5;
                    s4.addWidth(amount);
                    s4.addHeight(amount);
                    repaint();
                }
                if (s5.isHit(x, y)) {                     
                    int amount =  (int)e.getWheelRotation() * 5;
                    s5.addWidth(amount);
                    s5.addHeight(amount);
                    repaint();
                }
 
                
            }            
        }
    }
    
    //end
    
    private ArrayList<Shape> layer = new ArrayList<>();
    private Shape s1 = new Rectangle();
    private Shape s2 = new Square();
    private Shape s3 = new Triangle();
    private Shape s4 = new Circle();
    private Shape s5 = new Hexagon();
    public ArrayList<Shape> Input() {
        System.out.println("Nhập số phần tử của Layer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Shape s;
        for (int i = 0; i < n; i++) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Hexagon");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    
                    s1.NhapThongTIn();
                    layer.add(s1);
                    break;
                case 2:
                    
                    s2.NhapThongTIn();
                    layer.add(s2);
                    break;
                case 3:
                    
                    s3.NhapThongTIn();
                    layer.add(s3);
                    break;
                case 4:
                    
                    s4.NhapThongTIn();
                    layer.add(s4);
                    break;
                case 5:
                    
                    s5.NhapThongTIn();
                    layer.add(s5);
                    break;
                default:
                    break;
            }
        }
        return layer;
    }
    public void Output(){
        for ( int i = 0; i < layer.size(); i++){
            System.out.println(layer.get(i).toString());
        }
    }
    public ArrayList<Shape> removeTriangle (){
        for( int i = 0; i < layer.size(); i++){
            if(layer.get(i) instanceof Triangle){
                layer.remove(i);
                i--;
                System.out.println("xóa thành công");
            }
        }
        return layer;
    }
    public ArrayList<Shape> removeCircle (){
        for( int i = 0; i < layer.size(); i++){
            if(layer.get(i) instanceof Circle){
                layer.remove(i);
                i--;
                System.out.println("xóa thành công");
            }
        }
        return layer;
    }

    public static void main(String[] args) {
        Layer listShape = new Layer();
//        listShape.removeTriangle();
//        listShape.Output();S
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                listShape.setVisible(true);
            }
        }); 
    }
}
