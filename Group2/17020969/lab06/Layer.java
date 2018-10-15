import java.util.ArrayList;
import java.util.Scanner;
public class Layer{
    ArrayList <Shape> shape = new ArrayList<>();
    public  void NhapLayer() {
        System.out.println("Nhap phan tu Layer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("1. Rectangle"); // chon 1 de chon hinh chu nhat
        System.out.println("2. Square");    // chon 2 de chon hinh vuong
        System.out.println("3. Triangle");  // chon 3 de chon hinh tam giac
        System.out.println("4. Circle");    // chon4 de chon hinh tron
        
        for( int i = 0; i < n; i++) {
            System.out.println("Nhap lua chon: ");
            int chon = sc.nextInt();
            switch(chon) {
                case 1:
                    Shape s = new Rectangle();
                    shape.add(s);
                    break;
                case 2:
                    s = new Square();
                    shape.add(s);
                    break;
                case 3:
                    s = new Triangle();
                    shape.add(s);
                    break;
                case 4:
                    s = new Circle();
                    shape.add(s);
                    break;
                default: break;
            }
        }
    }
    // xoa hinh chu nhat
    public ArrayList <Shape> removeTriangle (){
        for( int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                i--;
            }
        }
        return shape;
    }
    // xoa hinh tron
    public ArrayList <Shape> removeCircle (){
        for( int i = 0; i < shape.size(); i++){
            // kiem tra phan tu nao la hinh tron thi thuc hien viec xoa
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                i--;
            }
        }
        return shape;
    }
}
