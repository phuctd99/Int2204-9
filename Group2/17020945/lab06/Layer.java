
import java.util.ArrayList;
import java.util.Scanner;

public class Layer{
	ArrayList<Shape> shapes = new ArrayList<>();

	public  void NhapLayer() {
		System.out.println("nhap so phan tu cua Layer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("nhap lua chon hinh ban muon them:");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Triangle");
		System.out.println("4. Rectangle");
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(a==1){
				Shape c = new Circle();
				shapes.add(c);
			}
			if(a==2){
				Shape s = new Square();
				shapes.add(s);
			}
			if(a==3){
				Shape t = new Triangle();
				shapes.add(t);
			}
			if(a==4){
				Shape r = new Rectangle();
				shapes.add(r);
			}
		}
	}
	public ArrayList<Shape> removeTriangle (){
		for(int i = 0; i < shapes.size(); i++){
			if(shapes.get(i) instanceof Triangle){
				shapes.remove(i);
				i--;
			}
		}
		return shapes;
	}
	public ArrayList<Shape> removeCircle (){
		for(int i = 0; i < shapes.size(); i++){
			if(shapes.get(i) instanceof Circle){
				shapes.remove(i);
				i--;
			}
		}
		return shapes;
	}
}
