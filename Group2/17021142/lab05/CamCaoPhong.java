class CamCaoPhong extends Cam {
    int price;
    int amount;
    public CamCaoPhong(){
        super("Cam Cao Phong","Việt Nam");
        price = 0;
        amount = 0;
    }
    public CamCaoPhong(int price, int amount){
        super("Cam Cao Phong","Việt Nam");
        this.price = price;
        this.amount = amount;
    }
    public CamCaoPhong(String name, String origin, int price, int amount){
        super(name, origin);
        this.price = price;
        this.amount = amount;
    }
    public void show(){
        System.out.println("Tên loại hoa quả : " + this.name);
        System.out.println("Nguồn Gốc Xuất Xứ : " + this.origin);
        System.out.println("Giá Bán : " + this.price +" $");
        System.out.println("Số Lượng trong Kho : " + this.amount + " quả");
    }
}