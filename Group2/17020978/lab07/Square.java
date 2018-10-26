import java.awt.*;

public class Square extends Rectangle{

    Square(){}

    Square(int side)
    {
        super(side, side);
    }

    public Square(int x, int y,int side, String color, boolean filled)
    {
        super(x,y,side,side,color,filled);
    }

    public int getSide() {
        return super.width;
    }

    public void setSide(int side) {
        super.width = side;
        super.length = side;
    }

    @Override
    public void setLength(int side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
    }

    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled+" Canh hinh vuong:" +this.length;
    }
}
