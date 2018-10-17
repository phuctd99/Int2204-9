
public class Rectangle extends Shape{
    private int weight;
    private int height;
    public Rectangle(){
        weight =1;
        height =1;
    }
    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Rectangle(int x, int y, String color, boolean isMove, int weight, int height) {
        super(x, y, color, isMove);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
