public class Square extends Rectangle {

    public Square(){
        new Rectangle();
    }
    public  Square (Double side){
        this.setWidth(side);
        this.setLength(side);
    }
    public  Square(Double side, String color, boolean filled){
        this.setWidth(side);
        this.setLength(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    public Double getSide() {
        return super.getWidth();
    }

    public void setSide(Double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    @Override
    public void setWidth (Double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(Double side) {
        super.setLength(side);
    }
    @Override
    public String toString(){
        return this.getSide() + "\n" + this.getPerimeter() + "\n" + this.getArea();
    }

    public static void main(String[] args) {
        Square h1 = new Square(2.0);
        System.out.println(h1.toString());
    }
}
