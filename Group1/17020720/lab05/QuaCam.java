package KeThua_Final;

public class QuaCam extends HoaQua {
    private String name;

    QuaCam(String nguonGoc, String giaCa, String ngayNhap, String soLuong, String name) {
        super(nguonGoc, giaCa, ngayNhap, soLuong);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getPrintQuaCam(){
        System.out.println("Loai qua: " + name);
    }
}
