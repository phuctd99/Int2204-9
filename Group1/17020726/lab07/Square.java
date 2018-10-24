public class Square extends Shape { // toa do la dinh tren ben trai
    public static String name = "square";
    private double edge;

    //Constructor
    public Square(String color, double edge, double x, double y) {
        super(color, x, y);
        this.edge = edge;
    }

    //settet, getter
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }



    @Override
    public boolean isSameType(Shape shape){
        return shape instanceof Square;
    }

    @Override
    public boolean equals(Shape shape){
        if (shape instanceof Square)
            return (this.x == shape.getX())&&(this.y == shape.getY())&&(edge == ((Square) shape).getEdge());
        return false;
    }

    @Override
    public String toString(){
        return name +" color: "+color+",Central = ("+x+","+y+") "+" edge = "+edge+"\n";
    }

    //Hham tinh chu vi
    public double getPerimeter(){
        return edge*4;
    }

}