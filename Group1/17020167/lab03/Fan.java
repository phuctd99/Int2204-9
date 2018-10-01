package ex3;
//Doi tuong quat
public class Fan {
    private String shape;
    private String color;
    private String remotebutton;
    private String others;

//Getter va setter    
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
    
    //ham lay thong tin
    public void getInfor() {
        System.out.println(shape);
        System.out.println(color);
        System.out.println(remotebutton);
        System.out.println(others);
    }
    
    //ham bat/tat quat
    public void TurnOnFan() {
        
        remotebutton = "on";
    }
    
    public void TurnOffFan() {
        
        remotebutton = "off";
    }
}
