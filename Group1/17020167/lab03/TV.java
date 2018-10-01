package ex3;
//Doi tuong TV
public class TV {
    private String shape;
    private String color;
    private String remotebutton;
    private String others;
    
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
    
    public void setRemotebutton(String n) {
        remotebutton = n;
    }
    
    public String getRemotebutton() {
        return remotebutton;
    }
    
    public void setOthers(String n) {
        others = n;
    }
    
    public String getOthers() {
        return others;
    }
    
    //Ham lay thong tin
    public void getInfor() {
        System.out.println(shape);
        System.out.println(color);
        System.out.println(remotebutton);
        System.out.println(others);
    }
    
    //Ham bat/tat TV
    public void TurnOnTV() {
        System.out.println("TV will be turned on");
        remotebutton = "on";
    }
    
    public void TurnOffTV() {
        System.out.println("TV will be turned off");
        remotebutton = "off";
    }
    
}
