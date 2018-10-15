class CamSanh extends Cam {
    int price;
    int amount;
    public CamSanh(){
        super("Cam Sành","Việt Nam");
        price = 0;
        amount = 0;
    }
    public CamSanh(int price, int amount){
        super("Cam Sành","Việt Nam");
        this.price = price;
        this.amount = amount;
    }
    public CamSanh(String name, String origin, int price, int amount){
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