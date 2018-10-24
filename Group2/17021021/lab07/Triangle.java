import java.awt.*;

public class Triangle extends Shape {

    private int[] coorX = new int[3];
    private int[] coorY = new int[3];

    //constructor
    public Triangle() {
        x = 0;
        y = 0;
        coorX[0] = 50;  coorY[0] = 0;
        coorX[1] = 0;   coorY[1] = 86;
        coorX[2] = 100; coorY[2] = 86;
        rotate = 0;
        color = Color.CYAN;
        resetMiddlePoint();
    }

    //setter
    @Override
    public void resetMiddlePoint() {
        middleX = middlePointCalculate(coorX[0], coorX[1], coorX[2], coorY[0], coorY[1], coorY[2]);
        middleY = middlePointCalculate(coorY[0], coorY[1], coorY[2], coorX[0], coorX[1], coorX[2]);
    }

    @Override
    public void setPosi(int x, int y) {
        coorX[0] += x;
        coorX[1] += x;
        coorX[2] += x;
        coorY[0] += y;
        coorY[1] += y;
        coorY[2] += y;
        resetMiddlePoint();
    }

    @Override
    public void setProperties(double[] properties) {
        coorX[0] = (int) properties[1];
        coorY[0] = (int) properties[2];
        coorX[1] = (int) properties[4];
        coorY[1] = (int) properties[5];
        coorX[2] = (int) properties[7];
        coorY[2] = (int) properties[8];
        rotate = properties[9];
        try {
            color = new Color((int) properties[11], (int) properties[12], (int) properties[13]);
        } catch (Exception ex) {

        }
        resetMiddlePoint();
    }


    //getter
    @Override
    public java.awt.Shape getShape() {
        return new Polygon(coorX, coorY, 3);
    }

    @Override
    public Object[][] getProperties() {
        Object[][] objects =    {{"POINT 1", "value"},//0
                                {"x1", coorX[0]},//1
                                {"y1", coorY[0]},//2
                                {"POINT 2", "value"},//3
                                {"x2", coorX[1]},//4
                                {"y2", coorY[1]},//5
                                {"POINT 3", "value"},//6
                                {"x3", coorX[2]},//7
                                {"y3", coorY[2]},//8
                                {"rotate", rotate},//9
                                {"COLOR", "value"},//10
                                {"red", color.getRed()},//11
                                {"green", color.getGreen()},//12
                                {"blue", color.getBlue()}};//13
        return objects;
    }

    //function
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Triangle)) {
            return false;
        }
        Triangle temp = (Triangle) other;
        if (temp.x != x ||
                temp.y != y ||
                temp.rotate != rotate)
            return false;
        return true;
    }

    private double middlePointCalculate(int x1, int x2, int x3, int y1, int y2, int y3) {
        double result = ((x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2) * (y2 - y3) - (x2 * x2 - x3 * x3 + y2 * y2 - y3 * y3) * (y1 - y2)) / 2;
        result /= ((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2));
        return result;
    }
}
