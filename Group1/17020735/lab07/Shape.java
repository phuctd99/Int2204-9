import java.awt.*;

public abstract class Shape  {
    protected Color color = null;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics graphics);
    public abstract boolean contains(Point point);
    public abstract void move(Point start, Point end);
    public abstract void makeObject(Point start, Point end);

}
