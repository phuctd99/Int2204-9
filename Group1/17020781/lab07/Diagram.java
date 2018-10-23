import java.util.*;
import java.io.*;

class Diagram {
	public ArrayList<Layer> listLayer = new ArrayList<Layer>();
	private int numberLayer;			//Số lượng Layer hiện có 
	Diagram(){
		this.numberLayer = 0;
	}
	public int getNumberLayer(){
		return this.numberLayer;
	}
	public void createLayer(String nameLayer){
		Layer layerNew = new Layer();
		listLayer.add(layerNew);
		layerNew.setNameLayer(nameLayer);
		this.numberLayer++;
	}
	public void createLayer(ArrayList<Shape> listShape, String nameLayer){
		Layer layerNew = new Layer();
		listLayer.add(layerNew);
		layerNew.setNameLayer(nameLayer);
		this.numberLayer++;
		layerNew.setListShape(listShape);
	}
	public void deleteLayer(int num){
		for(int i = 0; i < this.numberLayer; ++i){
			listLayer.remove(i);
			numberLayer--;
			return;
		}
	}
	public Layer select(){
		Scanner input = new Scanner(System.in);
		System.out.print("Layer Number :");
		int select = input.nextInt();
		return listLayer.get(select - 1);
	}
	public void deleteCircle(){
		for(int i = 0; i < listLayer.size(); ++i){
			listLayer.get(i).deleteCircle();
		}
	}
	public void layerShapeSame(){      				//Hàm phân loại các hình theo hình dạng vào các Layer khác nhau 
		ArrayList<Shape> listTriangle = new ArrayList<>();
		ArrayList<Shape> listRectangle = new ArrayList<>();
		ArrayList<Shape> listSquare = new ArrayList<>();
		ArrayList<Shape> listCircle = new ArrayList<>();
		ArrayList<Shape> listHexagon= new ArrayList<>();

		for(int j = numberLayer - 1; j >= 0; --j){

			for(int i =0; i < listLayer.get(j).getListShape().size(); ++i){
				if(listLayer.get(j).getListShape().get(i) instanceof Circle){
					listCircle.add(listLayer.get(j).getListShape().get(i));
				}
				else if(listLayer.get(j).getListShape().get(i) instanceof Triangle){
					listTriangle.add(listLayer.get(j).getListShape().get(i));
				}
				else if(listLayer.get(j).getListShape().get(i) instanceof Rectangle){
                    if(listLayer.get(j).getListShape().get(i) instanceof Square){
						listSquare.add(listLayer.get(j).getListShape().get(i));
                        continue;
                    }
                    listRectangle.add(listLayer.get(j).getListShape().get(i));
				}
				
				else if(listLayer.get(j).getListShape().get(i) instanceof Hexagon){
					listHexagon.add(listLayer.get(j).getListShape().get(i));
				}
			}
			this.deleteLayer(j);
		}
		this.createLayer(listTriangle,"Triangle");
		this.createLayer(listRectangle,"Rectangle");
		this.createLayer(listSquare, "Square");
		this.createLayer(listCircle, "Circle");
		this.createLayer(listHexagon, "Hexagon");
	}
	public void menu(){
		boolean exit = false;
		while(!exit){
			System.out.println("1.Create a layer");		//Tạo 1 Layer mới
			System.out.println("2.Select a layer");		//Chọn 1 Layer để thao tác
			System.out.println("3.Delete Circle");		//Xóa tất cả các Circle 
			System.out.println("4.Sort All Shape");		//Phân loại các Shape vào các Layer khác nhau
			System.out.println("5.Print Shapes in all Layers");	//In ra thông tin của tất cả các layer và các shape chứa trong đó	
			System.out.println("6.Enable/Disable Layer"); //Cho phép Layer có được vẽ thêm hình lên không?
			System.out.println("7.Exit");	
			Scanner input = new Scanner(System.in);
			int select = input.nextInt();
			switch(select){
				case 1 :
                    Scanner input1 = new Scanner(System.in);
                    System.out.print("Nhập vào tên layer: ");
                    String nameLayer = input1.nextLine();
					this.createLayer(nameLayer);
					break;
				case 2 :
					Layer temp = new Layer();
					temp = this.select();
					System.out.println("Layer đang được chọn " + temp.getNameLayer());
					temp.menuShape();
					break;
				case 3 :
					this.deleteCircle();
					System.out.println("Đã xóa tất cả các hình tròn trong các layer");
					break;
				case 4 :
					this.layerShapeSame();
					System.out.println("Đã sắp xếp lại các hình giống nhau vào 1 layer --> phân loại thành công");
					break;
				case 5 :
					for(int i = 0; i < listLayer.size(); ++i){
                        System.out.println(listLayer.get(i).getNameLayer());
						listLayer.get(i).printAllShape();
					}
					break;
				case 6 :
					System.out.print("Layer number: ");
					Scanner input2 = new Scanner(System.in);
					int num = input2.nextInt();
                    num--;
					for (int i = 0;i < listLayer.size(); ++i) {
						if(listLayer.get(num).getVisitable()){
							listLayer.get(num).setVisitable(false);
							System.out.println("Không cho vẽ lên layer "+listLayer.get(num).getNameLayer());
						}
						else{
							listLayer.get(num).setVisitable(true);
							System.out.println("Cho phép vẽ lên layer "+listLayer.get(num).getNameLayer());
						}
						break;
					}
					break;
				default :
					exit = true;
					break;
			}
		}
		
	}
}

class Layer {
	public ArrayList<Shape> listShape = new ArrayList<>();
	protected boolean visitable;		//biến cho phép Layer có được vẽ hay không?
	protected String nameLayer;
	Layer(){
		this.visitable = true;
		this.nameLayer = "Noname";
	}
	public String getNameLayer(){
		return this.nameLayer;
	}
	public boolean getVisitable(){
		return this.visitable;
	}
	public ArrayList<Shape> getListShape(){
		return this.listShape;
	}
	public void setNameLayer(String nameLayer){
		this.nameLayer = nameLayer;
	}
	public void setVisitable(boolean visitable){
		this.visitable = visitable;
	}
	public void setListShape(ArrayList<Shape> listShape){
		this.listShape = listShape;
	}
	public void filled(Shape shape){			//Hàm tô màu cho 1 hình bất kỳ
		shape.setFilled();
	}
	public void createNewShape(){						//Hàm tạo 1 hình mới 
		boolean exit = false;	
		if(this.visitable){								
			exit = true;							//kiểm tra xem có vẽ được không
		}
        else{
            System.out.println("Không tạo được");
            return;
        }
		while(exit){
			System.out.println("Create : 1.Rectangle 2.Square 3.Triangle 4.Circle 5.Hexagon 6.Back");
			int temp;
			Scanner input = new Scanner(System.in);
			temp = input.nextInt();
			switch(temp){
				case 1 :
					Rectangle recNew = new Rectangle();	
                    listShape.add(recNew);
					break;
				case 2 :
					Square squNew = new Square();
                    listShape.add(squNew);
					break;
				case 3 :
					Triangle triNew = new Triangle();
                    listShape.add(triNew);
					break;
				case 4 :
					Circle cirNew = new Circle();
					listShape.add(cirNew);
					break;
				case 5 :
					Hexagon hexNew = new Hexagon();
					listShape.add(hexNew);
					break;
				case 6 :
					exit = false;
					break;
				default : 
					System.out.println("Không hình nào được tạo");
					break;
			}
		}
	}	
	public Shape selectShape(){					//Chọn 1 hình trong Layer để thao tác 
		Scanner input = new Scanner(System.in);
		System.out.print("Shape number :");
		int select = input.nextInt();
		return listShape.get(select - 1);
	}
	
	public void setSizeShape(Shape shape){		//Hàm set kích cỡ cho từng loại hình khác nhau
		if(shape instanceof Rectangle){
			if(shape instanceof Square){
				System.out.print("Size = ");
				Scanner input = new Scanner(System.in);
				double size = input.nextDouble();
				shape.setSize(size);
				return;
			}
			System.out.print("wight = ");
			Scanner input1 = new Scanner(System.in);
			double width = input1.nextDouble();
			System.out.print("lenght = ");
			Scanner input2 = new Scanner(System.in);
			double length = input2.nextDouble();
			shape.setSize(width, length);
		}
		else if(shape instanceof Triangle){
			System.out.print("height = ");
			Scanner input1 = new Scanner(System.in);
			double height = input1.nextDouble();
			System.out.print("base = ");
			Scanner input2 = new Scanner(System.in);
			double base = input2.nextDouble();
			System.out.print("angle = ");			
			Scanner input3 = new Scanner(System.in);
			double angle = input3.nextDouble();
			shape.setSize(height, base, angle);
		}
		else if(shape instanceof Circle){
			System.out.print("radio = ");
			Scanner input = new Scanner(System.in);
			double radio = input.nextDouble();
			shape.setSize(radio);
		}

	}
	public void move(Shape shape, int x, int y){
		shape.setPosition(x, y);
	}
	public void info(Shape shape){
		shape.toString1();
	}
	public boolean compare(Shape shape1, Shape shape2){			//Hàm so sánh tọa độ của 2 hình bất kỳ
            return shape1.x == shape2.x && shape1.y == shape2.y && shape1.rotate == shape2.rotate;
	}
	public void deleteRectangle(){
		for(int i =0; i < listShape.size(); ++i){
			if(listShape.get(i) instanceof Rectangle){
				listShape.remove(i);
			}
		}
	}
	public void deleteCircle(){
		for(int i =0; i < listShape.size(); ++i){
			if(listShape.get(i) instanceof Circle){
					listShape.remove(i);
			}
		}
	}

	public void deleteShapeSame(){                 //Hàm xóa những hình giống nhau cùng tọa độ
		for(int i = listShape.size(); i > 0; --i){
			for(int j = listShape.size() - 1; j > 0; --j){
				if(this.compare(listShape.get(i),listShape.get(j)) && instanceSame(listShape.get(i), listShape.get(j))){
					listShape.remove(j);
				}
			}
		}
	}
	public boolean instanceSame(Shape shape1, Shape shape2){		//Hàm xác định 2 hình bất kì có cùng hình dạng hay không ?
		if(shape1 instanceof Rectangle && shape2 instanceof Rectangle){
			return true;
		}
		if(shape1 instanceof Triangle && shape2 instanceof Triangle){
			return true;
		}
		if(shape1 instanceof Circle && shape2 instanceof Circle){
			return true;
		}
		if(shape1 instanceof Square && shape2 instanceof Square){
			return true;
		}
		return shape1 instanceof Hexagon && shape2 instanceof Hexagon;
	}
	public void toStringNameLayer(){
		System.out.println(this.nameLayer);
	}
	public void printAllShape(){
		for(int i = 0; i < this.listShape.size(); ++i){
			this.listShape.get(i).toString1();
		}
	}
	public void menuShape(){
		boolean exit = false;
		while(!exit){
			System.out.println("1.Create");				//Tạo Shape mới
			System.out.println("2.Fill");				//Tô màu cho Shape
			System.out.println("3.Set size");			//Set size cho shape
			System.out.println("4.Move");				//Di chuyển 1 shape đến 1 tọa độ khác
			System.out.println("5.Print");				//In ra thông tin 1 Shape được chọn trong Layer
			System.out.println("6.Print All");			//In ra tất cả các Shape trong 1 Layer
			System.out.println("7.Delete Rectangle");   // Xóa Rectangle trong 1 Layer;
			System.out.println("8.Delete Shape Same");  //Xóa những hình giống nhau cùng tọa độ
			System.out.println("9.Back");
			Scanner input = new Scanner(System.in);
			int select = input.nextInt();
			switch(select){
				case 1 :
					this.createNewShape();
					break;
				case 2 :
					this.filled(this.selectShape());
					break;
				case 3 :
					this.setSizeShape(this.selectShape());
					break;
				case 4 :
                    Scanner input1 = new Scanner(System.in);
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Nhập vào tọa độ :");
                    System.out.print("x = ");
                    System.out.print("y = ");
                    int x = input1.nextInt();
                    int y = input2.nextInt();
					this.move(this.selectShape(),x,y);
					break;
				case 5 :
					this.info(this.selectShape());
					break;
				case 6 :
					this.printAllShape();
					break;
				case 7 :
					this.deleteRectangle();
					break;
				case 8 :
					this.deleteShapeSame();
					break;
				default : 
					exit = true;
					break;
			}
		}
	}
}

abstract class Shape{
	protected double x,y;		//Tọa độ của 1 hình
	protected double rotate;	//Độ nghiêng của mỗi hình 
	protected boolean filled;	//Hình có được tô màu hay không ?

	Shape(){
		this.x = 0;
		this.y = 0;
		this.rotate = 0;
		filled = false;
	}
	Shape(double x, double y){
		this.x = x;
		this.y = y;
	}
	Shape(double x, double y, double rotate){
		this(x,y);
		this.rotate = rotate;
	}
	public void setRotate(double rotate){
		this.rotate = rotate;
	}
	public void setFilled(){
		this.filled = true;
	}
	public void setPosition(double x, double y)
	{	
		this.x = x;
		this.y = y;
	}
	public void setSize(double width, double length){}				//Overloading
	public void setSize(double size){}
	public void setSize(double height, double base, double angle){}
	public abstract void toString1();
}

class Rectangle extends Shape{
	public double width;
	public double length;
	Rectangle(){
		this.width = 1;
		this.length = 1;
	}
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

        @Override
	public void setSize(double width, double length){
		this.width = width;
		this.length = length;
	}
        @Override
	public void toString1(){
		System.out.println("Rectangle"+" "+width+" "+length+" "+x + " " + y +" "+filled+" "+rotate);
	}
}

class Square extends Rectangle{
	public Square(){
			super();
		}
	public Square(double side){							//Cac constructor
		super(side,side);
	}
	public double getSize(){
		return this.width;
	}
        @Override
	public void setSize(double size){
		this.width = size;
		this.length = size;
	}
        @Override
	public void toString1(){
		System.out.println("Square"+ " " + width + " " + x + " " + y +" "+filled+" "+rotate);
	}
}

class Triangle extends Shape{
	public double height;
	public double base;
	public double angle;
	Triangle(){
		this.height = 1;
		this.base = 1;
		this.angle = 90;
	}
	Triangle(double height, double base, double angle){
		this.height = height;
		this.base = base;
		this.angle = angle;
	}

        @Override
	public void setSize(double height, double base, double angle){
		this.height = height;
		this.base = base;
		this.angle = angle;
	}
        @Override
	public void toString1(){
		System.out.println("Triangle"+" "+height+" "+base+" " + angle + " " + x + " " + y +" "+filled + " " + rotate);
	}
}

class Circle extends Shape{
	public double radius;
	Circle(){
		this.radius = 1;
	}
	Circle(double radius){
		this.radius = radius;
	}
        @Override
	public void setSize(double radius){
		this.radius = radius;
	}
        @Override
	public void toString1(){
		System.out.println("Circle"+" "+radius+ " " + x + " " + y +" "+filled+" "+rotate);
	}
}

class Hexagon extends Shape{
	public double size;
	Hexagon(){
		this.size = 0;
	}
	Hexagon(double size){
		this.size = size;
	}
        @Override
	public void setSize(double size){
		this.size = size;
	}
	 @Override
	public void toString1(){
		System.out.println("Hexagon"+" "+size+ " " + x + " " + y +" "+filled+" "+rotate);
	}
}

public class Test{
	public static void main(String[] args) {
		Diagram run = new Diagram();
		run.menu();
	}
}