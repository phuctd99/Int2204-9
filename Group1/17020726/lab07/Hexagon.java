public class Hexagon extends Shape{
    public static String name = "Hexagon";
    private double edge;

    //Constructor
    public Hexagon(){

    }
    public Hexagon(String color, double x, double y, double edge) {

        super(color, x, y);
        this.edge = edge;
    }

    //getter, setter
    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    //Ham tinh chu vi
    public double getPerimeter(){
        return edge*6;
    }

    @Override
    public String toString(){
        return name+" color: "+color+", Central = ("+x+","+y+") "+"edge = "+edge+"\n";
    }

    @Override
    public boolean equals(Shape shape){
        if (shape instanceof Hexagon)
            return (x == shape.getX())&&(y == shape.getY())&&(edge == ((Hexagon) shape).getEdge());
        return false;
    }

    @Override
    public boolean isSameType(Shape shape){
        return shape instanceof Hexagon;
    }
}
