import java.security.PrivateKey;

/**
 * Created by CCNE on 24/09/2018.
 */
public class bai3 {
    public class hocsinh1 {
        private String Ten;
        private String Tuoi;
        private String MonHoc;

        public void setTen(String Ten) {
            this.Ten = Ten;
        }

        public void setTuoi(String Tuoi) {
            this.Tuoi = Tuoi;
        }

        public void setboMon(String boMon) {
            this.MonHoc = MonHoc;
        }

        public String getTen() {
            return Ten;
        }

        public String getTuoi() {
            return Tuoi;
        }

        public class CoGiao {
            private String Ten;
            private String Tuoi;
            private String BoMon;

            public void setTen(String Ten) {
                this.Ten = Ten;
            }

            public void setTuoi(String Tuoi) {
                this.Tuoi = Tuoi;
            }

            public void setboMon(String BoMon) {
                this.BoMon = BoMon;
            }

            public String getTen() {
                return Ten;
            }

            public String getTuoi() {
                return Tuoi;
            }

            public class conmeo {
                private String maulong;
                private String Tuoi;
                private String doan;

                public void setmaulong(String maulong) {
                    this.maulong = maulong;
                }

                public void setTuoi(String Tuoi) {
                    this.Tuoi = Tuoi;
                }

                public void setdoan(String doan) {
                    this.doan = doan;
                }

                public String getmaulong() {
                    return Ten;
                }

                public String getTuoi() {
                    return Tuoi;
                }
            }
        }
    }
}



