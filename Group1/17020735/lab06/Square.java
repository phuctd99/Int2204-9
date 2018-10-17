public class Square extends Rectangle {
    public Square() {}

    public Square(Point top_left, int side) {
        super(top_left, side, side);
    }

    public Square(String color, boolean filled, Point top_left, int side) {
        super(color, filled, top_left, side, side);
    }
    
   public int getSide() {
       return super.getWidth();
   }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getInfo() {
                System.out.println(getClass().getName() + " " + Integer.toHexString(hashCode()) + " " +
                getTop_left().getX() + " " + getTop_left().getY() + " " + getSide() +
                " " + getColor() + " " + String.valueOf(isFilled()));
    }
   
}
