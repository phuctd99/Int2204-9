package test05;

class Square extends Rectangle{
    protected double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){  //kb không khởi tạo
        this.area = 0;
        this.side = 0;
        this.length = 0;
        this.width = 0;
        this.perimeter = 0;
        this.filled = true;
        this.color = "red";
    }

    public Square(double side, String color, boolean filled,
                  double perimeter, double area){ //kb tương tự
        this.area = area;
        this.side = side;
        this.length = side;
        this.width = side;
        this.perimeter = perimeter;
        this.filled = filled;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color  +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
