
import java.util.ArrayList;
import java.util.Scanner;

public class Layer{
    private ArrayList<Shape> layer = new ArrayList<>();

    public ArrayList<Shape> Input() {
        System.out.println("Nhập số phần tử của Layer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        Shape s;
        for (int i = 0; i < n; i++) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^");
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
        listShape.Input();
        listShape.removeTriangle();
        listShape.Output();
    }
}
