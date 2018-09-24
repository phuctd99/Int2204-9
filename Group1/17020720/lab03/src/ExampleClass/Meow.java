package ExampleClass;

public class Meow {
    private String maulong, cannang;

    public Meow(String mau, String nang){
        this.maulong = mau;
        this.cannang = nang;
    }

    public void setMaulong(String maulong){
        this.maulong = maulong;
    }

    public void setCannang(String cannang){
        this.cannang = cannang;
    }

    public String getMaulong(){
        return this.maulong;
    }

    public String getCannang(){
        return this.cannang;
    }

    public void getInfo(){
        System.out.println("Con meo mau " + maulong + " nang " + cannang + " kg.");
    }

    public static void main(String[] args){
        System.out.println("Ho nha meo '>>' !!!");
        Meow meo1 = new Meow("den", "2");
        meo1.getInfo();
        Meow meo2 = new Meow("vang", "2,5");
        meo2.getInfo();
        Meow meo3 = new Meow("trang", "1,5");
        meo3.getInfo();
    }
}


