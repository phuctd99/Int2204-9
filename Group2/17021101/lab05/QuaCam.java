public class QuaCam extends HoaQua {
    private Integer SoLuong;

    public QuaCam(){
        new HoaQua();
        SoLuong = 0;

    }
    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }
}
