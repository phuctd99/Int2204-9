package bai1;

/**
 * trừu tượng hóa lớp cam cao phong kế thừa từ lớp quả cam
 * @author Nguyễn Quang Hiệp
 */
public class CamCaoPhong extends QuaCam {
    private int price;
    // gán giá bán
    public void setPrice(int price) {
        this.price = price;
    }
    // trả về giá bán
    public int getPrice() {
        return price;
    }

}
