public class subject {
        private String tenMonhoc;
        private String maMonhoc;
        private int soTinchi;
        private String giangvien;
        private String tiethoc;
        public void setTenMonhoc(String tenMonhoc){
            this.tenMonhoc =tenMonhoc;
        }
        public void setMaMonhoc(String maMonhoc){
            this.maMonhoc = maMonhoc;
        }
        public void setSoTinchi(int soTinchi){
            this.soTinchi = soTinchi;
        }
        public void setGiangvien(String giangvien){
            this.giangvien = giangvien;
        }
        public void setTiethoc(String tiethoc){
            this.tiethoc = tiethoc;
        }

        public String getTenMonhoc() {
            return tenMonhoc;
        }
        public String getMaMonhoc() {
            return maMonhoc;
        }
        public int getSoTinchi() {
            return soTinchi;
        }
        public String getGiangvien() {
            return giangvien;
        }
        public String getTiethoc(){
            return tiethoc;
        }
    }