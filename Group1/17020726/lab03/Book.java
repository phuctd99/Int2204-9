public class Book {
    private String name;
    private  int cost;
    private int  length;
    private int width;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCost(){
        if(this.cost > 200000) return true;
        else return false;
    }

    public void Infor(){
        System.out.println("Ten sach: "+this.name+"| Gia sach: "+this.cost+"| Kich co: "+this.length+" "+this.width);
    }

}
