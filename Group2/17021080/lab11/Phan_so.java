public class Phan_so implements Comparable<Phan_so> {
    private int x = 0;
    private int y = 1;

    public Phan_so(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public int compareTo(Phan_so o) {
        return ( this.x* o.y - o.x * this.y ) ;
    }

    @Override
    public String toString() {
        return ( this.x + "/"+ this.y );
    }
}
