public abstract  class Shape {
    public static String name = "shape";
    //Toa do cua tam hinh
    protected double x, y;
    //Mau cua hinh
    protected String color = "default";

    //Constructor
    public Shape(){
        x = 0;
        y = 0;
    }

    public Shape(String color, double x, double y) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(String name, String color, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //getter, setter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Ham di chuyen toi vi tri co toa do x va y
    public void moveTo(double x, double y){
        System.out.println("Di chuyen toi vi tri co toa do "+x+" "+y);
        this.x = x;
        this.y = y;
    }

    public abstract boolean equals(Shape shape);
    public abstract boolean isSameType(Shape shape);
    @Override
    public abstract String toString();
}
