import java.sql.SQLOutput;
import java.util.Objects;

public class PhanSo {
    //Cac thuoc tinh cua lop PhanSo
    private int tuSo;
    private int mauSo;

    //Cac phuong thuc get/get cua lop PhanSo
    public int getTuSo()
    {
        return tuSo;
    }
    public void setTuSo( int TS)
    {
        tuSo = TS;
    }
    public int getMauSo()
    {
        return mauSo;
    }
    public void setMauSo( int MS )
    {
        mauSo = MS;
    }

    //Ham in phan so
    public void inPS() {
        this.rutGon();
        System.out.println( this.tuSo + "/" + this.mauSo);
    }

    //Ham rut gon phan so
    public PhanSo rutGon() {
        int a = this.tuSo;
        int b = this.mauSo;
        a = Math.abs( a );
        b = Math.abs( b );
        if( a==0 && b!=0)
        {
            System.out.println( b );
        }
        else if( b==0 && a!=0 )
        {
            System.out.println( a );
        }
        else
        {
            while( a!=b )
            {
                if( a>b )
                    a = a-b;
                else
                    b = b-a;
            }
        }
        this.mauSo = this.mauSo/a;
        this.tuSo = this.tuSo/a;
        return this;
    }

    //Ham khoi tao tham so cho lop phan so
    public PhanSo( int tuSo, int mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    //Phuong thuc cong phan so
    public PhanSo cong( PhanSo a)
    {
        if( a.mauSo == this.mauSo)
        {
            this.tuSo = a.tuSo+this.tuSo;
        }
        else
        {
            this.mauSo = a.mauSo*this.mauSo;
            this.tuSo = this.tuSo*a.mauSo + this.mauSo*a.tuSo;
        }
        this.rutGon();
        return this;
    }

    //Phuong thuc tru phan so
    public PhanSo tru( PhanSo a)
    {
        if( a.mauSo == this.mauSo)
        {
            this.tuSo = this.tuSo-a.tuSo;
        }
        else
        {
            this.mauSo = a.mauSo*this.mauSo;
            this.tuSo = this.tuSo*a.mauSo - this.mauSo*a.tuSo;
        }
        this.rutGon();
        return this;
    }

    //Phuong thuc nhan phan so
    public PhanSo nhan( PhanSo a)
    {
        this.mauSo = a.mauSo*this.mauSo;
        this.tuSo = a.tuSo*this.tuSo;
        this.rutGon();
        return this;
    }

    //Phuong thuc chia phan so
    public PhanSo chia( PhanSo a)
    {
        this.mauSo = this.mauSo/a.mauSo;
        this.tuSo = this.tuSo/a.tuSo;
        this.rutGon();
        return this;
    }


    //Phuong thuc so sanh hai phan so

    public boolean equals(PhanSo ps) {
        this.rutGon();
        if( ps.tuSo == 0 && this.tuSo == 0) {
            return  true;
        }
        if( this.tuSo*this.mauSo < 0 && ps.mauSo*ps.tuSo < 0 &&
            Math.abs( this.mauSo) == Math.abs( ps.mauSo)
            && Math.abs( this.tuSo) == Math.abs( ps.tuSo))
        {
            return true;
        }
        if( this.tuSo == ps.tuSo && this.mauSo == ps.mauSo) {
            return true;
        }
        return false;
    }

    //Ham main
    public static void main( String[] args) {
        PhanSo ps1 = new PhanSo( 10, -5);
        PhanSo ps2 = new PhanSo( -3, 5);
        System.out.println( ps1.equals( ps2));

    }



}
