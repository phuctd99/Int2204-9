
public class phanSo {
    private int tuso, mauso;
    public phanSo(int a, int b)
        {
                this.tuso=a;
                this.mauso=b;
        }
    public phanSo()
        {
                new phanSo(0,1);
        }

    public phanSo rutgon()
        {
           lab3 a = new lab3();
           phanSo toiGian = this;
                int UC = a.UCLN(toiGian.tuso,toiGian.mauso);
                    toiGian.tuso=toiGian.tuso/UC;
                    toiGian.mauso=toiGian.mauso/UC;
           return toiGian;
        }

    public phanSo cong(phanSo a)
        {
            phanSo tong = new phanSo();
            tong.tuso = a.tuso * this.mauso + this.tuso * a.mauso;
            tong.mauso = a.mauso * this.mauso;
            tong.rutgon();
        return tong;
        }

    public phanSo tru(phanSo a)
        {
            phanSo hieu = new phanSo();
            hieu.tuso = this.tuso*a.mauso - a.tuso*this.mauso;
            hieu.mauso = a.mauso*this.mauso;
            hieu.rutgon();
        return hieu;
        }

    public phanSo nhan(phanSo a)
        {
            phanSo tich = new phanSo();
            tich.tuso = this.tuso*a.tuso;
            tich.mauso = a.mauso*this.mauso;
            tich.rutgon();
        return tich;
        }

    public phanSo chia(phanSo a)
        {
            phanSo thuong = new phanSo();
            thuong.tuso = this.tuso*a.mauso;
            thuong.mauso = a.tuso*this.mauso;
            thuong.rutgon();
        return thuong;
        }

    public boolean equals(phanSo a)
        {
            return this.tuso*a.mauso == a.tuso*this.mauso;
        }

    public void inPS()
        {
            System.out.println(this.tuso + "/" + this.mauso);
        }
}
