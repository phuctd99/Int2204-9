class Tao extends HoaQua {
    String origin;
    public Tao(){
        super("Táo");
        this.origin = "Việt Nam";
    }
    public Tao(String origin){
        super("Táo");
        this.origin = origin;
    }
    public Tao(String name, String origin){
        super(name);
        this.origin = origin;
    }
    public void show(){
        System.out.println("Tên loại hoa quả : " + this.name);
        System.out.println("Nguồn Gốc Xuất Xứ : " + this.origin);
    }
}
