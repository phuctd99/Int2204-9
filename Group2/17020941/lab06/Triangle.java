package oop_tuan6;

public class Triangle extends Shape {
    private double canh1;
    private double canh2;
    private double canh3;

    public Triangle() {
        super();
        this.canh1 = 1.0;
        this.canh2 = 1.0;
        this.canh3 = 1.0;
    }

    public Triangle(double x, double y, double z) {
        super();
        this.canh1 = x;
        this.canh2 = y;
        this.canh3 = z;
    }

    public Triangle(double x, double y, String color, double canh1, double canh2, double canh3) {
        super(x,y,color);
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh1() {
		return canh1;
	}

	public void setCanh1(double canh1) {
		this.canh1 = canh1;
	}

	public double getCanh2() {
		return canh2;
	}

	public void setCanh2(double canh2) {
		this.canh2 = canh2;
	}

	public double getCanh3() {
		return canh3;
	}

	public void setCanh3(double canh3) {
		this.canh3 = canh3;
	}

	public double getchuVi() {
        return canh1 + canh2 + canh3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "canh 1=" + canh1 +
                ", canh2=" + canh2 +
                ", canh3=" + canh3 +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}