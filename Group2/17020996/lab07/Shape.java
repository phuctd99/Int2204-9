import java.awt.Graphics;

public abstract class Shape {
    protected String color = "Blue";
    protected boolean filled;

    public Shape () {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public void paint(Graphics g) {
		
	}
}

class Circle extends Shape {
    private xOy toaDoTam;
    private int radius;
    private final double PI = 3.14;

    public  Circle() {}

    public Circle(xOy toaDoTam, int radius) {
        super();
        this.toaDoTam = toaDoTam;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, xOy toaDoTam, int radius) {
        super(color, filled);
        this.toaDoTam = toaDoTam;
        this.radius = radius;
    }

    public xOy getsetToaDoTam() {
        return toaDoTam;
    }

    public void setToaDoTam(xOy toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void move(int x, int y) {
        toaDoTam.setX(this.toaDoTam.getX() + x);
        toaDoTam.setY(this.toaDoTam.getY() + y);
    }
}

class Rectangle extends Shape {

    private xOy viTri;
    private int chieuDai;
    private int chieuRong;

    public Rectangle(xOy viTri, int chieuDai, int chieuRong) {
        super();
        this.viTri = viTri;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Rectangle(String color, boolean filled, xOy viTri, int chieuDai, int chieuRong) {
        super(color, filled);
        this.viTri = viTri;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Rectangle() {
    }

    public xOy getViTri() {
        return viTri;
    }

    public void setViTri(xOy viTri) {
        this.viTri = viTri;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getArea() {
        return (this.chieuDai * this.chieuRong);
    }

    public int getPerimeter() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public void move(int x, int y) {
        viTri.setX(viTri.getX() + x);
        viTri.setY(viTri.getY() + y);
    }
}

class Square extends Rectangle {
    private xOy viTri;
    private int side;

    public Square() {}


    public Square(xOy viTri, int side) {
        super(viTri, side, side);
    }

    public Square(String color, boolean filled, xOy viTri, int side) {
        super(color, filled, viTri, side, side);
    }


    public xOy getViTri() {
        return viTri;
    }


    public void setViTri(xOy viTri) {
        this.viTri = viTri;
    }


    public int getSide() {
        return side;
    }


    public void setSide(int side) {
        this.side = side;
    }
}

class Triangle extends Shape {
    private xOy diemA;
    private xOy diemB;
    private xOy diemC;

    public Triangle() {
    }

    public Triangle(xOy diemA, xOy diemB, xOy diemC) {
        super();
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public Triangle(String color, boolean filled, xOy diemA, xOy diemB, xOy diemC) {
        super(color, filled);
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public xOy getDiemA() {
        return diemA;
    }

    public void setDiemA(xOy diemA) {
        this.diemA = diemA;
    }

    public xOy getDiemB() {
        return diemB;
    }

    public void setDiemB(xOy diemB) {
        this.diemB = diemB;
    }

    public xOy getDiemC() {
        return diemC;
    }

    public void setDiemC(xOy diemC) {
        this.diemC = diemC;
    }

    public double getArea() {
        return Math.abs((diemB.getX() - diemA.getX()) * (diemC.getY() - diemA.getY())
                - (diemC.getX() - diemA.getX()) * (diemB.getY() - diemA.getY()));
    }

    public double getPerimeter() {
        return Math
                .sqrt((diemA.getX() - diemB.getX()) * (diemA.getX() - diemB.getX())
                        + (diemA.getY() - diemB.getY()) * (diemA.getY() - diemB.getY()))
                + Math.sqrt((diemA.getX() - diemC.getX()) * (diemA.getX() - diemC.getX())
                + (diemA.getY() - diemC.getY()) * (diemA.getY() - diemC.getY()))
                + Math.sqrt((diemB.getX() - diemC.getX()) * (diemB.getX() - diemC.getX())
                + (diemB.getY() - diemC.getY()) * (diemB.getY() - diemC.getY()));
    }

    public void move(int x, int y) {
        diemA.setX(diemA.getX() + x);
        diemA.setY(diemA.getY() + y);
        diemB.setX(diemB.getX() + x);
        diemB.setY(diemB.getY() + y);
        diemC.setX(diemC.getX() + x);
        diemC.setY(diemC.getY() + y);
    }
}

class Hexagon extends Shape {
    private xOy point1;
    private xOy point2;
    private xOy point3;
    private xOy point4;
    private xOy point5;
    private xOy point6;

    public Hexagon() {
        super();
    }

    public Hexagon(xOy point1, xOy point2, xOy point3, xOy point4, xOy point5, xOy point6) {
        super();
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.point5 = point5;
        this.point6 = point6;
    }

    public Hexagon(String color, boolean isFilled, xOy point1, xOy point2, xOy point3, xOy point4, xOy point5,
                   xOy point6) {
        super(color, isFilled);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.point5 = point5;
        this.point6 = point6;
    }

    public void resize(xOy point1, xOy point2, xOy point3, xOy point4, xOy point5, xOy point6) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.point5 = point5;
        this.point6 = point6;
    }

    public xOy getPoint1() {
        return point1;
    }

    public void setPoint1(xOy point1) {
        this.point1 = point1;
    }

    public xOy getPoint2() {
        return point2;
    }

    public void setPoint2(xOy point2) {
        this.point2 = point2;
    }

    public xOy getPoint3() {
        return point3;
    }

    public void setPoint3(xOy point3) {
        this.point3 = point3;
    }

    public xOy getPoint4() {
        return point4;
    }

    public void setPoint4(xOy point4) {
        this.point4 = point4;
    }

    public xOy getPoint5() {
        return point5;
    }

    public void setPoint5(xOy point5) {
        this.point5 = point5;
    }

    public xOy getPoint6() {
        return point6;
    }

    public void setPoint6(xOy point6) {
        this.point6 = point6;
    }
    public double getArea() {
        // tính độ dài 1 cạnh rồi áp dụng công thức
        double doDaiCanh = Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX())
                + (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
        double dienTich = (Math.pow(3, 1/2) * 3 * doDaiCanh * doDaiCanh) / 2;
        return dienTich;
    }
    public double getPerimeter() {
        double doDaiCanh = Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX())
                + (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
        double chuVi = doDaiCanh*6;
        return chuVi;
    }

    public void move(int x, int y) {
        point1.setX(point1.getX() + x);
        point1.setY(point1.getY() + y);
        point2.setX(point2.getX() + x);
        point2.setY(point2.getY() + y);
        point3.setX(point3.getX() + x);
        point3.setY(point3.getY() + y);
        point4.setX(point4.getX() + x);
        point4.setY(point4.getY() + y);
        point5.setX(point5.getX() + x);
        point5.setY(point5.getY() + y);
        point6.setX(point6.getX() + x);
        point6.setY(point6.getY() + y);

    }
}