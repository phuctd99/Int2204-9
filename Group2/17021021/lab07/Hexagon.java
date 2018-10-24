import java.awt.*;

public class Hexagon extends Shape {

    private double radius;
    private int[] coorX = new int[6];
    private int[] coorY = new int[6];


    //constructor
    public Hexagon() {
        x = 500;
        y = 200;
        radius = 50;
        color = Color.GREEN;
        rotate = 0;
        calculateCoordinate();
        resetMiddlePoint();
    }

    //setter
    @Override
    public void resetMiddlePoint() {
        middleX = x + radius;
        middleY = y + Math.sin(Math.toRadians(60)) * radius;
    }

    @Override
    public void setPosi(int x, int y) {
        this.x = x;
        this.y = y;
        resetMiddlePoint();
        calculateCoordinate();
    }

    @Override
    public void setProperties(double[] properties) {
        x = (int) properties[0];
        y = (int) properties[1];
        radius = (int) properties[2];
        rotate = (double) properties[3];
        try {
            color = new Color((int) properties[5], (int) properties[6], (int) properties[7]);
        } catch (Exception ex) {

        }
        resetMiddlePoint();
        calculateCoordinate();
    }

    //getter
    @Override
    public java.awt.Shape getShape() {
        return new Polygon(coorX, coorY, 6);
    }

    @Override
    public Object[][] getProperties() {
        Object[][] objects =    {{"x", x},
                {"y", y},
                {"radius", radius},
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
        if (!(other instanceof Hexagon)) {
            return false;
        }
        Hexagon temp = (Hexagon) other;
        if (temp.x != x ||
            temp.y != y ||
            temp.rotate != rotate ||
            temp.radius != radius)
            return false;
        return true;
    }

    private void calculateCoordinate() {
        coorX[0] = x;
        coorY[0] = (int)(y + Math.sin(Math.toRadians(60)) * radius);
        coorX[1] = (int)(x + radius / 2);
        coorY[1] = y;
        coorX[2] = (int)(coorX[1] + radius);
        coorY[2] = y;
        coorX[3] = (int)(x + radius * 2);
        coorY[3] = coorY[0];
        coorX[4] = coorX[2];
        coorY[4] = coorY[0] * 2 - coorY[2];
        coorX[5] = coorX[1];
        coorY[5] = coorY[4];
    }
}
