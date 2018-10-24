import java.awt.*;

abstract public class Shape {

    protected Color color;
    protected double rotate;
    protected int x;
    protected int y;
    protected double middleX;
    protected double middleY;

    abstract public java.awt.Shape getShape();
    abstract public Object[][] getProperties();
    abstract public void setProperties(double[] properties);
    abstract public void resetMiddlePoint();
    abstract public boolean equals(Object other);

    //getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public double getRotate() {
        return rotate;
    }

    public double getMiddleX() {
        return middleX;
    }

    public double getMiddleY() {
        return middleY;
    }

    //setter
    public void setColor(Color color) {
        this.color = color;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosi(int x, int y) {
        this.x = x;
        this.y = y;
        resetMiddlePoint();
    }
}
