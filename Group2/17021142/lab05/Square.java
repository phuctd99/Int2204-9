class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }
    public String toString(){
        return "\nHình vuông màu " + color + " có cạnh là " + String.valueOf(getSide())
                + "\nDiện tích là " + String.valueOf(getArea())
                + "\nChu vi là " + String.valueOf(getPerimeter());
    }
}