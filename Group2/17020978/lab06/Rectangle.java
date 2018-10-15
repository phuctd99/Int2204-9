public class Rectangle extends Shape {
    protected double width = 5.0;
    protected double length = 4.0;


    Rectangle(){}
   public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

   public Rectangle(double width, double length,String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getAres()
    {
        return (this.width+this.length)*2;
    }

    public double getPerimeter() {
        return this.width * this.length;
    }

    public String toString()
    {
        return "Color: " + this.color + " FILLED:" + this.filled+" Chieu dai hinh chu nhat:" + this.length + " Chieu rong hinh chu nhat:" + this.width + " Chu vi hinh chu nhat:" + this.getAres() + "Dien tich hinh chu nhat:" + this.getPerimeter();
    }
}
