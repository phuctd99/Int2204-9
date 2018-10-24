
import java.awt.Color;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Shape extends Component{

    protected Color color;

    protected int x;
    protected int y;

    public Shape() {
    }
    public Color chonMau(){
        System.out.println("0. Màu đỏ");
        System.out.println("1. Màu vàng");
        System.out.println("2. Màu xanh lá");
        System.out.println("3. Màu xanh dương");
        System.out.println("4. Màu đen");
        System.out.println("5. Màu hồng");
        System.out.println("6. Màu da cam");
        System.out.println("Khác. Màu xám");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch(i){
            case 0:
                return Color.RED;
            case 1:
                return Color.YELLOW;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.BLUE;
            case 4:
                return Color.BLACK;
            case 5:
                return Color.PINK;
            case 6:
                return Color.ORANGE;
        }
        return Color.GRAY;
    }
    public abstract void NhapThongTIn();
    public abstract int getArea();
    public abstract int getPerimeter();

    @Override
    public String toString() {
        return " color " + color + ", x = " + x + ", y = " + y ;
    }
}
