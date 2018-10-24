package lab7;

public class Triangle extends Shape {
    protected Point p1 = new Point();
    protected Point p2 = new Point();
    protected Point p3 = new Point();

    public Triangle(){}

    public Triangle(Point p1, Point p2 , Point p3){
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p2;
    }

    public Triangle(Point p1, Point p2 , Point p3, String color, boolean filled){
        super(color, filled);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP1() {
        return p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP2() {
        return p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP3() {
        return p3;
    }

    public double canhA() {
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }

    public double canhB() {
        return Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.y));
    }

    public double canhC() {
        return Math.sqrt((p3.x-p1.x)*(p3.x-p1.x)+(p3.y-p1.y)*(p3.y-p1.y));
    }

    public double p = (canhA()+canhB()+canhC())/2;

    public double getArea(){
        return Math.sqrt(p*(p-canhA())*(p-canhB())*(p-canhC()));
    }

    public double getPerimeter(){
        return p*2;
    }

    public void move(int x_, int y_){
        p1.setX(p1.x + x_);
        p1.setY(p1.x + y_);
        p2.setX(p2.x + x_);
        p2.setY(p2.x + y_);
        p3.setX(p3.x + x_);
        p3.setY(p3.x + y_);
    }




}
