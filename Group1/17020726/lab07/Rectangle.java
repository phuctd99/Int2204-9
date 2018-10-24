public class Rectangle extends Shape{
    public static String name = "rectangle";
    private double width, length;

    //Constructor
    public Rectangle(String color, double width, double length, double x, double y) {
        super(color, x, y);
        this.width = width;
        this.length = length;
    }

    //setter, getter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public void setHeight(double height) {
        this.length = height;
    }

    @Override
    public boolean equals (Shape shape ){
        if (shape instanceof Rectangle)
            if ((x == shape.getX()) && (y == shape.getY()) && (width == ((Rectangle) shape).getWidth()) && (length == ((Rectangle) shape).getLength()))
                return true;
        return false;
    }

    //Ham tinh chu vi
    public double getPerimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString(){
        return name +" color: "+color+", Central = ("+x+","+y+") "+"width = "+width+" height = "+length+"\n";
    }

    @Override
    public boolean isSameType(Shape shape){
        return shape instanceof Rectangle;
    }

}