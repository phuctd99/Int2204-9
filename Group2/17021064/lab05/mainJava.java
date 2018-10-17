public class mainJava {
    public static void main(String[] args) {
        hoaQua fruit = new hoaQua();
        fruit.setTen("Nhãn");
        fruit.setnguonGoc("Việt Nam");
        fruit.setsoLuong(100);
        fruit.inThongTin();

        quaTao apple = new quaTao();
        apple.setTen("Táo");
        apple.setnguonGoc("Hà nội");
        apple.setsoLuong(1000);
        apple.inThongTin();

        quaCam oran =new quaCam();
        oran.setTen("Cam");
        oran.inThongTin();

        camCaoPhong caoPhong = new camCaoPhong() ;
        caoPhong.inThongTin();
        camSanh sanh = new camSanh();
        sanh.inThongTin();
    }
}
