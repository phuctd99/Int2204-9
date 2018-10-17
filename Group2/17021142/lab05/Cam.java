class Cam extends HoaQua {
    String origin;
    public Cam(){
        super("Cam");
        this.origin = "Việt Nam";
    }
    public Cam(String origin){
        super("Cam");
        this.origin = origin;
    }
    public Cam(String name, String origin){
        super(name);
        this.origin = origin;
    }
    public void show(){
        System.out.println("Tên loại hoa quả : " + this.name);
        System.out.println("Nguồn Gốc Xuất Xứ : " + this.origin);
    }
}
