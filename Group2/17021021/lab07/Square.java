import java.awt.*;
import java.awt.Rectangle;

public class Square extends Shape {

    private int side;

    //constructor
    public Square() {
        x = 300;
        y = 300;
        side = 100;
        rotate = 0;
        color = Color.ORANGE;
        resetMiddlePoint();
    }

    //setter
    @Override
    public void resetMiddlePoint() {
        middleX = x + side / 2.0;
        middleY = y + side / 2.0;
    }

    @Override
    public void setProperties(double[] properties) {
        x = (int) properties[0];
        y = (int) properties[1];
        side = (int) properties[2];
        rotate = (double) properties[3];
        try {
            color = new Color((int) properties[5], (int) properties[6], (int) properties[7]);
        } catch (Exception ex) {

        }
        resetMiddlePoint();
    }

    //getter
    @Override
    public java.awt.Shape getShape() {
        return new Rectangle(x, y, side, side);
    }

    public int getSide() {
        return side;
    }

    @Override
    public Object[][] getProperties() {
        Object[][] objects = {{"x", x},
                {"y", y},
                {"side", side},
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
        if (!(other instanceof Square)) {
            return false;
        }
        Square temp = (Square) other;
        if (temp.x != x ||
                temp.y != y ||
                temp.rotate != rotate ||
                temp.side != side)
            return false;
        return true;
    }
}