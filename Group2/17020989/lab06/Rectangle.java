
public class Rectangle extends Shape {
    protected int length, width;
   
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
    @Override
    public void inputtoado() {
//        super.input();
        System.out.println("toa do dai la: ");
        setLength(super.scan.nextInt());
        System.out.println("toa do rong la: ");
        setWidth(super.scan.nextInt());
    }
    
    @Override
    public void outputtoado() {
//        super.output();
        System.out.println("toa do Rectangle la: " +"( "+ getWidth()+" , " + getLength()+ " )");
        System.out.println("kich thuoc Rectangle la:" + getWidth()*getLength());
    }
    
}
