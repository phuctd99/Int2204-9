public class phanso {
    private int tuSo;
    private int mauSo;
    public void setTuSo(int tuSo)
    {
        this.tuSo=tuSo;
    }
    public int getTuSo()
    {
        return tuSo;
    }
    public void setMauSo(int mauSo)
    {
        this.mauSo=mauSo;
    }
    public int getMauSo()
    {
        return mauSo;
    }
    public String  get()
    {
        if(mauSo==0)
        {
            return ("mau so phai khac 0");
        }
        else if(tuSo==0) {
            return "0";
        }
        else if(tuSo%mauSo==0)
        {
            return (tuSo/mauSo+" ");
        }
        else if(tuSo<0&&mauSo<0)
        {
            return (Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }
        else if(tuSo>0&&mauSo<0)
        {
            return (-tuSo+"/"+Math.abs(mauSo));
        }else
            return (tuSo +"/"+mauSo);
    }

    public static int UCLN(int a,int b)
    {
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0)
        {
            return (a+b);
        }
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
                b=b-a;
        }
        return a;
    }
    public void rutGonPhanSo()
    {
        int a=UCLN(tuSo,mauSo);
        tuSo=tuSo/a;
        mauSo=mauSo/a;
    }
    public phanso cong(phanso s2)
    {
        phanso s3=new phanso();
        s3.tuSo=tuSo*s2.mauSo+s2.tuSo*mauSo;
        s3.mauSo=mauSo*s2.mauSo;
        rutGonPhanSo();
        return s3;
    }
    public phanso tru(phanso s2)
    {
        phanso s=new phanso();
        s.tuSo=tuSo*s2.mauSo-s2.tuSo*mauSo;
        s.mauSo=mauSo*s2.mauSo;
        rutGonPhanSo();
        return s;
    }
    public phanso nhan(phanso s2)
    {
        phanso s=new phanso();
        s.tuSo=tuSo*s2.tuSo;
        s.mauSo=mauSo*s2.mauSo;
        rutGonPhanSo();
        return s;
    }
    public phanso chia(phanso s2)
    {
        phanso s=new phanso();
        s.tuSo=tuSo*s2.mauSo;
        s.mauSo=mauSo*s2.tuSo;
        rutGonPhanSo();
        return s;
    }
    public boolean equals(phanso s2)
    {
        return (tuSo*s2.mauSo==mauSo*s2.tuSo);
    }
    public static void main(String [] args)
    {
        phanso s1=new phanso();
        s1.setMauSo(-10);
        s1.setTuSo(5);
        s1.rutGonPhanSo();
        System.out.println("phan so 1 : "+s1.get());
        phanso s2=new phanso();
        s2.setTuSo(6);
        s2.setMauSo(12);
        s2.rutGonPhanSo();
        System.out.println("phan so 2 : "+s2.get());
        phanso s=new phanso();
        s=s1.cong(s2);
        System.out.println("ket qua phep cong : "+s.get());
        s=s1.tru(s2);
        System.out.println("ket qua phep tru : "+s.get());
        s=s1.nhan(s2);
        System.out.println("ket qua phep nhan : "+s.get());
        s=s1.chia(s2);
        System.out.println("ket qua phep chia : "+s.get());
        if(s1.equals(s2))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");



    }
}
