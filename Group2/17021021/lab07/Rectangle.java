import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    //constructor
    public Rectangle() {
        x = 100;
        y = 300;
        width = 100;
        height = 50;
        rotate = 0;
        color = Color.GRAY;
        resetMiddlePoint();
    }

    //setter
    @Override
    public void resetMiddlePoint() {
        middleX = x + width / 2.0;
        middleY = y + height / 2.0;
    }

    @Override
    public void setProperties(double[] properties) {
        x = (int) properties[0];
        y = (int) properties[1];
        width = (int) properties[2];
        height = (int) properties[3];
        rotate = properties[4];
        try {
            color = new Color((int) properties[6], (int) properties[7], (int) properties[8]);
        } catch (Exception ex) {

        }
        resetMiddlePoint();
    }

    //getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public java.awt.Shape getShape() {
        return new java.awt.Rectangle(x, y, width, height);
    }

    @Override
    public Object[][] getProperties() {
        Object[][] objects =    {{"x", x},
                                {"y", y},
                                {"width", width},
                                {"height", height},
                                {"rotate", rotate},
                                {"COLOR", "value"},
                                {"red", color.getRed()},
                                {"green", color.getGreen()},
                                {"blue", color.getBlue()}};
        return objects;
    }

    //function
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rectangle)) {
            return false;
        }
        Rectangle temp = (Rectangle) other;
        if (temp.x != x ||
            temp.y != y ||
            temp.rotate != rotate ||
            temp.width != width ||
            temp.height != height)
            return false;
        return true;
    }
}
