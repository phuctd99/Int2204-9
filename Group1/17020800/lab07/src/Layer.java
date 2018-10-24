
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layer extends JFrame{
    
    public Layer() {
         
        initUI();
    }
     
    private void initUI() {
         
        setTitle("Rotation");
        setLayout(null);
        JPanel p = new JPanel();
        setSize(500, 500);
        p.setSize(500, 500);
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
    
    
    
    
    
    private ArrayList<Shape> layer = new ArrayList<>();

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
                    s = new Rectangle();
                    s.NhapThongTIn();
                    layer.add(s);
                    break;
                case 2:
                    s = new Square();
                    s.NhapThongTIn();
                    layer.add(s);
                    break;
                case 3:
                    s = new Triangle();
                    s.NhapThongTIn();
                    layer.add(s);
                    break;
                case 4:
                    s = new Circle();
                    s.NhapThongTIn();
                    layer.add(s);
                    break;
                case 5:
                    s = new Hexagon();
                    s.NhapThongTIn();
                    layer.add(s);
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
