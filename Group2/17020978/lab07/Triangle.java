import java.awt.*;

public class Triangle extends Shape{
    public int x1,x2 ,x3 ;
    public int y1,y2 ,y3 ;

    public int[] xPoint = {x1,x2,x3};
    public int[] yPoint = {y1,y2,y3};

    Triangle(){}

    Triangle(int x, int y,int x1, int x2, int x3, int y1, int y2, int y3 , String color, boolean filled)
    {
        super(x,y,color,filled);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

//    Triangle(int x, int y,int x1, int x2, int x3, int y1, int y2, int y3 , String color, boolean filled)
//    {
//        super(x,y,color,filled);
//        this.x1 = x1;
//        this.x2 = x2;
//        this.x3 = x3;
//        this.y1 = y1;
//        this.y2 = y2;
//        this.y3 = y3;
//    }
    Triangle(int[] xPoint, int[] yPoint)
    {
        xPoint[0] = x1;
        xPoint[1] = x2;
        xPoint[2] = x3;

        yPoint[0] = y1;
        yPoint[1] = y2;
        yPoint[2] = y3;

    }


    public int[] getxPoint()
    {


        xPoint[0] = x1;
        xPoint[1] = x2;
        xPoint[2] = x3;
//        x1 = xPoint[0];
//        x2 = xPoint[1];
//        x3 = xPoint[2];
        return xPoint;
    }

    public void setxPoint(int[] xPoint) {
        xPoint[0] = x1;
        xPoint[1] = x2;
        xPoint[2] = x3;
//        x1 = xPoint[0];
//        x2 = xPoint[1];
//        x3 = xPoint[2];
    }

    public int[] getyPoint()
    {

        yPoint[0] = y1;
        yPoint[1] = y2;
        yPoint[2] = y3;
//        y1 = yPoint[0];
//        y2 = yPoint[1];
//        y3 = yPoint[2];
        return yPoint;
    }

    public void setyPoint(int[] yPoint) {
        yPoint[0] = y1;
        yPoint[1] = y2;
        yPoint[2] = y3;
//        y1 = yPoint[0];
//        y2 = yPoint[1];
//        y3 = yPoint[2];
    }

    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled ;
    }
}
