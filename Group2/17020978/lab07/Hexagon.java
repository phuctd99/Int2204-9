public class Hexagon extends Shape{
        public int radius;
        public int y, z;
    Hexagon(){}

    Hexagon(int x, int y, int radius, String color,boolean filled)
    {
        super(x,y,color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

//    @Override
//    public int getY() {
//        return y;
//    }
//
//    @Override
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getZ() {
//        return z;
//    }
//
//    public void setZ(int z) {
//        this.z = z;
//    }
}
