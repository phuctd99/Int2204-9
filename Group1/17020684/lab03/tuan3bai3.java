public class tuan3bai3{

    public static void main(String[] args)
    {
            Cat meo = new Cat();
            Girl gai = new Girl();
            TongThong tt = new TongThong();
            DatNuoc dn = new DatNuoc();
            DaiHoc dh = new DaiHoc();
            Nganh ng = new Nganh();
            Computer maytinh = new Computer();
            notebook note = new notebook();
            beverage beve = new beverage();
            fastfood ff = new fastfood();

               System.out.println(meo.getColor() + " "+ meo.getLeg());
               System.out.println(gai.getChieucao() + " "+ gai.getNgoaihinh());
               System.out.println(tt.getTen() + " "+ tt.getQuocgia());
               System.out.println(dn.getTennuoc() + " "+ dn.getKhuvuc());
               System.out.println(dh.getName() + " "+ dh.getDiachi());
               System.out.println(ng.getName() + " "+ ng.getJob());
               System.out.println(maytinh.getName() + " "+ maytinh.getGiatien());
               System.out.println(note.getName() +" " +note.getMoney() + " "+ note.getPage());
               System.out.println(beve.getTenBeverage() + " "+ beve.getGia());
               System.out.println(ff.getName() + " "+ ff.getGia());
    }
}

class Cat{
    private String color;
    private int leg;

   Cat(){color="black";leg=4;}
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getLeg()
    {
        return leg;
    }
    public void setLeg(int leg)
    {
        this.leg = leg;
    }
}
class Girl
{

    private String ngoaihinh;
    private String chieucao;
Girl(){ngoaihinh="pretty";chieucao="1m60";}
    public String getNgoaihinh()
    {
        return ngoaihinh;
    }
    public void setNgoaihinh(String ngoaihinh)
    {
        this.ngoaihinh = ngoaihinh;
    }
    public String getChieucao()
    {
        return chieucao;
    }
    public void setChieucao(String chieucao)
    {
        this.chieucao = chieucao;
    }

}
class TongThong
{

    private String ten;
    private String quocgia;
    TongThong(){ten="Obama";quocgia="USA";}
    public String getTen()
    {
        return ten;
    }
    public void setTen(String ten)
    {
        this.ten = ten;
    }
    public String getQuocgia()
    {
        return quocgia;
    }
    public void setQuocgia(String quocgia)
    {
        this.quocgia = quocgia;
    }
}
class DatNuoc
{
    private String tennuoc;
    private String khuvuc;
    DatNuoc(){tennuoc="VietNam";khuvuc="Dong Nam A";}
    public String getTennuoc()
    {
        return tennuoc;
    }
    public void setTennuoc(String tennuoc)
    {
        this.tennuoc = tennuoc;
    }
    public String getKhuvuc()
    {
        return khuvuc;
    }
    public void setKhuvuc(String khuvuc)
    {
        this.khuvuc = khuvuc;
    }
}
class DaiHoc
{
    private String name;
    private String addret;

    DaiHoc(){name="UET-VNU";addret="Xuan Thuy";}
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDiachi()
    {
        return addret;
    }
    public void setAddret(String addret)
    {
        this.addret = addret;
    }
}
class Nganh
{
    private String name;
    private String job;

    Nganh(){name="it"; job="WIn dao";}
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getJob()
    {
        return job;
    }
    public void setJob(String job)
    {
        this.job = job;
    }
}
class Computer
{
    private String name;
    private String giatien;
    Computer(){name="MAC"; giatien="5000$";}
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getGiatien()
    {
        return giatien;
    }
    public void setGiatien(String giatien)
    {
        this.giatien = giatien;
    }
}
class notebook {
    private String name;
    private int money, page;
    notebook(){name="campus";money=3000;page=160;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
class beverage
{
    private String tenBeverage;
    private String gia;
    beverage(){tenBeverage="cocacola";gia="6000VND";}

    public String getTenBeverage() {
        return tenBeverage;
    }

    public void setTenBeverage(String tenBeverage) {
        this.tenBeverage = tenBeverage;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

}
class fastfood{
    private String  name;
    private int gia;

    fastfood(){name="duiga";gia=15000;}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}