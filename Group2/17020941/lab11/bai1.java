import java.util.Arrays;

public class bai1 {

    class PS implements Compareable<PS>{
        private double tu;
        private double mau;
        public double getTu() {
            return tu;
        }
        public void setTu(double tu) {
            this.tu = tu;
        }
        public double getMau() {
            return mau;
        }
        public void setMau(double mau) {
            this.mau = mau;
        }
        public PS(double ts, double ms) {
            this.tu = ts;
            this.mau = ms;
        }
        public double GCD(double a, double b) {
            if (b == 0) {
                return a;
            } else {
                return GCD(b, a % b);
            }
        }
        public void toiGianPs() {
            int gcd = (int) GCD(this.getTu(), this.getMau());
            this.setTu(this.getTu() / gcd);
            this.setMau(this.getMau() / gcd);
            if (this.getMau() < 0) {
                this.setMau(this.getMau() * -1);
                this.setTu(this.getTu() * -1);
            }
            if (this.getTu() == 0) this.setMau(0);
        }

        public PS congPS(PS ps) {
            double ts = this.getTu() * ps.getMau() + this.getMau() * ps.getTu();
            double ms = this.getMau() * ps.getMau();
            PS tongPS = new PS(ts, ms);
            tongPS.toiGianPs();
            return tongPS;
        }
        public PS truPS(PS ps) {
            double ts = this.getTu() * ps.getMau() - this.getMau() * ps.getTu();
            double ms = this.getMau() * ps.getMau();
            PS hieuPS = new PS(ts, ms);
            hieuPS.toiGianPs();
            return hieuPS;
        }
        public PS nhanPS(PS ps) {
            double ts = this.getTu() * ps.getTu();
            double ms = this.getMau() * ps.getMau();
            PS tichPS = new PS(ts, ms);
            tichPS.toiGianPs();
            return tichPS;
        }
        public PS chiaPS(PS ps) {
            double ts = this.getTu() * ps.getMau();
            double ms = this.getMau() * ps.getTu();
            PS thuongPS = new PS(ts, ms);
            thuongPS.toiGianPs();
            return thuongPS;
        }

        @override
        public int compateTo(PS ps) {
            if (this.getTu() * ps.getMau() < this.getMau() * ps.getTu()) return -1;
            if (this.getTu() * ps.getMau() > this.getMau() * ps.getTu()) return 1;
            else return 0;
        }

        public void print() {
            System.out.println(this.getTu() + "/" + this.getMau());
        }

        public static void main(String[] args) {
            PS newps = new PS(2, 3);
            newps.print();
        }
    }

    public < E extends Comparable<E>> void sort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    E temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bai1 test = new bai1();
        Integer[] arrInts = {1,7,3,9,3};
        test.sort(arrInts);
        System.out.println(Arrays.toString(arrInts));
        String[] arrString = {"av", "sc", "tr", "ut"};
        test.sort(arrString);
        System.out.println(Arrays.toString(arrString));
        Character[] arrChar = {'a', 'g', 'b', 'u'};
        test.sort(arrChar);
        System.out.println(Arrays.toString(arrChar));
        PS[] ps = {new PS(1,3), new PS(1, 2), new PS(2,3)};
        test.sort(ps);
    }
}
