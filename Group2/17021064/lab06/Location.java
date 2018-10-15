public class Location {
    private int x, y;
    //setter/getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    // khởi tạo
    public Location(){
        this.x = 0;
        this.y = 0;
    }

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    // tính khảong cách 2 điểm.
    public double distance(Location s2){
        return Math.sqrt((this.x - s2.x)*(this.x - s2.x) + (this.y - s2.y)*(this.y - s2.y));
    }
    // dịch 1 điểm tới 1 tọa độ mới
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}
