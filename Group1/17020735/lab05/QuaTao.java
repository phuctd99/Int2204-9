package bai1;

/**
 * Trừu tượng hóa lớp quả táo kế thừa từ lớp hoa quả
 * @author Nguyễn Quang Hiệp
 */
public class QuaTao extends HoaQua {
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
