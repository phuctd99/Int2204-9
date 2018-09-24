package ExampleClass;

public class Laptop {
    private String style, screen, hardDrive, opera, CPU;

    public Laptop(String name, String manhinh, String ocung, String heDieuHanh, String cpu){
        this.style = name;
        this.screen = manhinh;
        this.hardDrive = ocung;
        this.opera = heDieuHanh;
        this.CPU = cpu;
    }

    public void setStyle(String style){
        this.style = style;
    }

    public String getStyle(){
        return this.style;
    }

    public void setScreen(String screen){
        this.screen = screen;
    }

    public String getScreen(){
        return this.screen;
    }

    public void setHardDrive(String hardDrive){
        this.hardDrive = hardDrive;
    }

    public String getHardDrive(){
        return this.hardDrive;
    }

    public void setOpera(String opera){
        this.opera = opera;
    }

    public String getOpera(){
        return this.opera;
    }

    public void setCPU(String CPU){
        this.CPU = CPU;
    }

    public String getCPU(){
        return this.CPU;
    }

    public void getInfo(){
        System.out.println("Lap top: " + style);
        System.out.println("Man hinh: " + screen);
        System.out.println("O cung: " + hardDrive);
        System.out.println("He dieu hanh: " + opera);
        System.out.println("CPU: " + CPU);
    }

    public static void main(String[] args){
        Laptop L = new Laptop("Asus vivobook S14 S410U", "Full HD", "ssd chuan m2santa", "Window", "Intel Core I5-8250U");
        L.getInfo();
    }

}
