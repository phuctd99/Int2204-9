package BT01;

class hoaqua {
    static class hoaQua {
        protected String nguongoc;
        protected String gia;
        protected String NSX;
        protected String HD;

        public String getNguongoc() {
            return nguongoc;
        }

        public void setNguongoc(String nguongoc) {
            this.nguongoc = nguongoc;
        }

        public String getGia() {
            return gia;
        }

        public void setGia(String gia) {
            this.gia = gia;
        }

        public String getNSX() {
            return NSX;
        }

        public void setNSX(String NSX) {
            this.NSX = NSX;
        }

        public String getHD() {
            return HD;
        }

        public void setHD(String HD) {
            this.HD = HD;
        }
    }


    static class quacam extends hoaQua { //lớp quả cam kế thừa của lớp hoa quả
        private
        String loaicam;
        String giongcam;
        String mausac;

        public String getLoaicam() {
            return loaicam;
        }

        public void setLoaicam(String loaicam) {
            this.loaicam = loaicam;
        }

        public String getGiongcam() {
            return giongcam;
        }

        public void setGiongcam(String giongcam) {
            this.giongcam = giongcam;
        }

        public String getMausac() {
            return mausac;
        }

        public void setMausac(String mausac) {
            this.mausac = mausac;
        }
    }

    static class quatao extends hoaQua { //lớp quả táo kế thừa của lớp hoa quả
        private
        String loaitao;
        String mausac;

        public String getLoaitao() {
            return loaitao;
        }

        public void setLoaitao(String loaitao) {
            this.loaitao = loaitao;
        }

        public String getMausac() {
            return mausac;
        }

        public void setMausac(String mausac) {
            this.mausac = mausac;
        }
    }

    static class quacaophong extends hoaQua { //lớp quả cao phong kế thừa của lớp hoa quả

    }

    static class camsanh extends hoaQua{ //lớp cam sành kế thừa của lớp hoa quả
        private String loaicam;

        public String getLoaicam() {
            return loaicam;
        }

        public void setLoaicam(String loaicam) {
            this.loaicam = loaicam;
        }
    }

    public static void main(String[] args) {
        quacam qc = new quacam();
        quacaophong qcp = new quacaophong();
        quatao qt = new quatao();
        camsanh cs = new camsanh();


        System.out.println(qc instanceof hoaQua); // kiểm tra xem các lớp có kế thừa của lớp hoa quả không
        System.out.println(qcp instanceof hoaQua);
        System.out.println(qt instanceof hoaQua);
        System.out.println(cs instanceof hoaQua);
    }
}



