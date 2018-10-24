
import java.awt.Color;
import java.awt.Graphics;
public class Rectangle extends Shape {
    int width;
    int height;
    int x;
    int y;
    int X = 12;
    int Y = 12;
    @Override
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
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
    // Constructor
    public Rectangle(int width, int height, int x, int y, Color color) {
        super(color);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    // Vẽ Rectangle
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    // Di chuyển rectangle
    public void update() {
        x = x - X;
        y = y - Y;
        if (x < 0 || x + width / 2 > test.WIDTH || x + width / Math.sqrt(2) > test.WIDTH) {
            X = -X;
        }
        if (y < 0 || y + height / 2 > test.HEIGHT || y + height * Math.sqrt(2) > test.HEIGHT) {
            Y = -Y;
        }
    }
    // Trả về thông tin Rectangle
    @Override
    public String getInfo() {
        return "Rectangle => Width: " + width + " Height: " + height + " Color: " + color;
    }

}