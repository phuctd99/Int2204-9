import java.awt.*;

public class Circle extends Shape {

    private double radius;

    //constructor
    public Circle() {
        x = 200;
        y = 100;
        radius = 50;
        rotate = 0;
        color = Color.MAGENTA;
    }

    //setter
    @Override
    public void resetMiddlePoint() {
        middleX = x + radius;
        middleY = y + radius;
    }

    @Override
    public void setProperties(double[] properties) {
        x = (int) properties[0];
        y = (int) properties[1];
        radius = (int) properties[2];
        try {
            color = new Color((int) properties[4], (int) properties[5], (int) properties[6]);
        } catch (Exception ex) {

        }
        resetMiddlePoint();
    }

    //getter
    @Override
    public java.awt.Shape getShape() {
        return new java.awt.geom.Ellipse2D.Double(x, y, radius * 2, radius * 2);
    }

    @Override
    public Object[][] getProperties() {
        Object[][] objects =    {{"x", x},
                                {"y", y},
                                {"radius", radius},
                                {"COLOR", "value"},
                                {"red", color.getRed()},
                                {"green", color.getGreen()},
                                {"blue", color.getBlue()}};
        return objects;
    }

    //function
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Circle)) {
            return false;
        }
        Circle temp = (Circle) other;
        if (temp.x != x ||
                temp.y != y ||
                temp.rotate != rotate ||
                temp.radius != radius)
            return false;
        return true;
    }
}
