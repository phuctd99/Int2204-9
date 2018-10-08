class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side, String color, boolean filled) {
       this.color = color;
       this.filled = filled;
       this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double length){
        super.setLength(length);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
    }
}
