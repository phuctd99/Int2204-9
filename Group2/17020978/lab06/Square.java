public class Square extends Rectangle{
    Square(){}
    Square(double side)
    {
        super(side, side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side,side,color,filled);
    }
    public double getSide() {
        return super.width;
    }

    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }


    public double getAres()
    {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return this.length*4;
    }
    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled+" Canh hinh vuong:" +this.length+ " Chu vi hinh vuong:" + this.getPerimeter() + " Dien tich hinh vuong:" + this.getAres();
    }
}
