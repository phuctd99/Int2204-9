package ex3;
//Doi tuong ban
public class Desk {
    private String shape;
    private String color;
    private String others;
    
    //getter va setter
    public void setShape(String n) {
        shape = n;
    }
    
    public String getShape() {
        return shape;
    }
    
    public void setColor(String n) {
        color = n;
    }
    
    public String getColor() {
        return color;
    }
    
    
    public void setOthers(String n) {
        others = n;
    }
    
    public String getOthers() {
        return others;
    }
    
    //ham lay thong tin
    public void getInfor() {
        System.out.println(shape);
        System.out.println(color);
        System.out.println(others);
    }
    
    
    
}
