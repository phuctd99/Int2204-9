public class PS
{
    private int TS, MS;

    PS(int tuSo, int mauSo)
    {
        this.TS = tuSo;
        this.MS = mauSo;
    }

    public PS()
    {
    }

    int getTS() {return TS;}
    void setTS(int tuSo)
    {
        TS = tuSo;
    }

    int getMS() {return MS;}
    void setMS(int mauSo)
    {
        MS = mauSo;
    }

    PS sum (PS ps1, PS ps2)
    {
        PS Sum = new PS();
        Sum.setTS( ps1.getTS() * ps2.getMS() + ps1.getMS() * ps2.getTS() );
        Sum.setMS( ps1.getMS() * ps2.getMS() );
        Sum.simplyfiPS();
        return Sum;
    }

    PS sub (PS ps1, PS ps2)
    {
        PS Sub = new PS();
        Sub.setTS( ps1.getTS() * ps2.getMS() + ps1.getMS() * ps2.getTS() );
        Sub.setMS( ps1.getMS() * ps2.getMS() );
        Sub.simplyfiPS();
        return Sub;
    }

    PS mul(PS ps1, PS ps2)
    {
        PS Mul = new PS();
        Mul.setTS( ps1.getTS() * ps2.getTS() );
        Mul.setMS( ps1.getMS() * ps2.getMS() );
        Mul.simplyfiPS();
        return Mul;
    }

    PS div(PS ps1, PS ps2)
    {
        PS Div = new PS();
        Div.setTS( ps1.getTS() * ps2.getTS() );
        Div.setMS( ps1.getMS() * ps2.getMS() );
        Div.simplyfiPS();
        return Div;
    }

    void simplyfiPS()
    {
        int GCD = Ex1.GCD(this.getTS(), this.getMS());
        TS /= GCD;
        MS /= GCD;
    }

    public boolean equals(PS psCmp)
    {
        psCmp.simplyfiPS();
        this.simplyfiPS();
        if (psCmp.getTS() == this.getTS() && psCmp.getMS() == this.getMS()) return true;
        return false;
    }

    void printPS ()
    {
        if (MS == 1)
        {
            System.out.println(TS);
            return;
        }
        if (MS == -1)
        {
            System.out.println(-TS);
            return;
        }
        System.out.println(TS + "/" + MS);
    }

}
