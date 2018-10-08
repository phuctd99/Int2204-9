package KeThua_Final;

public class CamCaoPhong extends QuaCam{//ke thua lop QuaCam
    private String tinhChat;

    public CamCaoPhong(String nguonGoc, String giaCa, String ngayNhap, String soLuong, String name, String tinhChat) {
        super(nguonGoc, giaCa, ngayNhap, soLuong, name);
        this.tinhChat = tinhChat;
    }

    public String getTinhChat() {
        return tinhChat;
    }

    public void setTinhChat(String tinhChat) {
        this.tinhChat = tinhChat;
    }

    public void getPrintCamCaoPhong(){
        System.out.println("Tinh trang: " + tinhChat);
    }
}
