import java.awt.Color;
import java.awt.Graphics;
public class Circle extends Shape {
    int radius;
    int x;
    int y;
    int X = 15;
    int Y = 15;
    // Constructor
    public Circle(int x, int y, int radius, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    // Vẽ Circle
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
    // Di chuyển Circle
    public void update() {
        x = x + X;
        y = y + Y;
        if (x < 0) {
            X = -X;
        } 
        else if (x + radius > testmain.WIDTH) {
            X = -X;
            x = testmain.WIDTH - radius;
        }
        if (y < 0) {
            Y = -Y;
        } 
        else if (y + radius > testmain.HEIGHT) {
            Y = -Y;
            y = testmain.HEIGHT - radius;
        }
    }
    // Trả về thông tin Hexagon

    /**
     *
     * @return
     */
    @Override
    public String getInfo() {
        return "Circle => Radius: " + radius + " Color: " + color;
    }
}