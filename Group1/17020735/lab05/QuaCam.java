package bai1;

/**
 * Trừu tượng hóa đối tượng quả cam được kế thừa từ hoa quả
 * @author Nguyễn Quang Hiệp
 */
public class QuaCam extends HoaQua{
    private String flavor;
    // trả về hương vị
    public String getFlavor() {
        return flavor;
    }
    // gán hương vị
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
