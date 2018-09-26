/**
 * Created by CCNE on 24/09/2018.
 */
public class doiTuong {

    public class cpu{
        private String xungNhip, soHieu, socket;
        //ví dụ xungNhip = "5.0GHz"
        public void setXungNhip(String xungNhip){
            this.xungNhip = xungNhip;
        }
        //ví dụ vd soHieu = "I9-7980XE"
        public void setSoHieu(String soHieu){
            this.soHieu = soHieu;
        }
        //ví dụ socket = "FCLGA2066"
        public void setSocket(String socket){
            this.socket=socket;
        }
        public String getXungNhip(){
            return xungNhip;
        }
        public String getSoHieu(){
            return soHieu;
        }
        public String getSocket(){
            return socket;
        }
    }

    public class mainBoard{
        private String socket, chipset;
        //ví dụ socket = "FCLGA2066"
        public void setSocket(String socket){
            this.socket = socket;
        }
        //ví dụ chipset = "X299"
        public void setChipset(String chipset){
            this.chipset = chipset;
        }
        public String getSocket(){
            return socket;
        }
        public String getChipset(){
            return chipset;
        }
    }

    public class RAM{
        private String bus, type;
        //ví dụ bus = "2400MHz"
        public void setBus(String bus){
            this.bus = bus;
        }
        //ví dụ type = "DDR4"
        public void setType(String type){
            this.type = type;
        }
        public String getBus(){
            return bus;
        }
        public String getType(){
            return type;
        }
    }

    public class graphicCard{
        private String vRam, type;
        //ví dụ vRam = "11GB"
        public void setvRam(String vRam){
            this.vRam = vRam;
        }
        //ví dụ type = "GTX1080Ti"
        public void setType(String type){
            this.type = type;
        }
        public String getvRam(){
            return vRam;
        }
        public String getType(){
            return type;
        }
    }

    public class nguon{
        private String congSuat;
        //ví dụ congSuat = "1000W"
        public void setSocket(String congSuat){
            this.congSuat = congSuat;
        }
        public String getCongSuat(){
            return congSuat;
        }
    }

    public class voCase{
        private String brand;
        //ví dụ brand = "Corsair"
        public void setBrand(String brand){
            this.brand = brand;
        }
        public String getBrand(){
            return brand;
        }
    }

    public class banPhim{
        private String brand, type;
        //ví dụ brand = "Corsair"
        public void setBrand(String brand){
            this.brand = brand;
        }
        //ví dụ type = "K70-MK.2-RGB-Cherry MX"
        public void setType(String type){
            this.type = type;
        }
        public String getBrand(){
            return brand;
        }
        public String getType(){
            return type;
        }
    }

    public class chuot{
        private String brand, type;
        //ví dụ brand = "Corsair"
        public void setBrand(String brand){
            this.brand = brand;
        }
        //ví dụ type = "DarkCore-RGB"
        public void setType(String type){
            this.type = type;
        }
        public String getBrand(){
            return brand;
        }
        public String getType(){
            return type;
        }
    }

    public class taiNghe{
        private String brand, type;
        //ví dụ brand = "Corsair"
        public void setBrand(String brand){
            this.brand = brand;
        }
        //ví dụ type = "VoidPro-V2-RGB-7.1"
        public void setType(String type){
            this.type = type;
        }
        public String getBrand(){
            return brand;
        }
        public String getType(){
            return type;
        }
    }

    public class manHinh{
        private String kichThuoc, doPhanGiai, tanSoQuet;
        //ví dụ kichThuoc = "27Inches"
        public void setKichThuoc(String kichThuoc){
            this.kichThuoc = kichThuoc;
        }
        //ví dụ doPhanGiai = "2560x1440"
        public void setDoPhanGiai(String doPhanGiai){
            this.doPhanGiai = doPhanGiai;
        }
        //ví dụ tanSoQuet = "144Hz"
        public void setTanSoQuet(String tanSoQuet){
            this.tanSoQuet = tanSoQuet;
        }
        public String getKichThuoc(){
            return kichThuoc;
        }
        public String getDoPhanGiai(){
            return doPhanGiai;
        }
        public String getTanSoQuet(){
            return tanSoQuet;
        }
    }
}
