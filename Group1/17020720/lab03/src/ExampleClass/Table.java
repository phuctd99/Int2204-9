package ExampleClass;

public class Table {
    private String color, material;

    public Table(String mau, String chatlieu){
        this.color = mau;
        this.material = chatlieu;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return this.material;
    }

    public void getInfo(){
        System.out.println("Chiec ban " + color + " lam tu " + material);
    }

    public static void main(String[] args){
        Table t1 = new Table("nau", "go");
        Table t2 = new Table("trang", "nhua");
        t1.getInfo();
        t2.getInfo();
    }
}
