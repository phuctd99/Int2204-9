public class Triangle extends Shape {
    public static String name = "triangle";
    //do dai 3 canh cua tam giac
    private int a, b, c;

    public Triangle(String color, double x, double y, int a, int b, int c ) {
        super(color, x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getter, setter
    public void setC(int c) {
        this.c = c;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    //Ham tinh chu vi
    public int getPerimeter(){
        return a+b+c;
    }
    @Override
    public boolean equals(Shape shape){
        if (shape instanceof Triangle)
            return (x == shape.getX()) && (y == shape.getY()) && (a == ((Triangle) shape).getA()) && (b == ((Triangle) shape).getB() && (c == ((Triangle) shape).getC()));
        return false;
    }
    @Override
    public String toString(){
        return name+" color: "+color+", Central = ("+x+","+y+") "+", Chu vi: "+getPerimeter()+"\n";
    }
    @Override
    public boolean isSameType(Shape shape){
        return shape instanceof Triangle;
    }
}
