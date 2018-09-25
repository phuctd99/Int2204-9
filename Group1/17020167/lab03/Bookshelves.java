package ex3;
//doi tuong gia sach
public class Bookshelves {
    private String shape;
    private String color;
    private String numberofbookcases;
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
    
    public void setNumberofbookcases(String n) {
        numberofbookcases = n;
    }
    
    public String getNumberofbookcases() {
        return numberofbookcases;
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
        System.out.println(numberofbookcases);
        System.out.println(others);
    }
    
}
