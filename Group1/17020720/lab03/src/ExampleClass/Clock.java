package ExampleClass;

import java.util.concurrent.Callable;

public class Clock {
    private String shape, color, size, cost;

    public Clock(String hinhDang, String mauSac, String kichThuoc, String gia){
        this.shape = hinhDang;
        this.color = mauSac;
        this.size = kichThuoc;
        this.cost = gia;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getShape(){
        return this.shape;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

    public void setCost(String cost){
        this.cost = cost;
    }

    public String getCost(){
        return this.cost;
    }

    public void getInfo(){
        System.out.println("Hinh dang: " + shape);
        System.out.println("Mau sac: " + color);
        System.out.println("Kich thuoc: " + size);
        System.out.println("Gia: " + cost);
    }

    public static void main(String[] args){
    System.out.println("DONG HO~!!!~");
    Clock c = new Clock("Hinh vuong", "mau dong", "450x450", "500.000");
    c.getInfo();
    }
}

