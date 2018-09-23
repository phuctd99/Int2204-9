package ps;

public class PS {
    private int tu, mau; // khoi tao hai thuc tinh tu, mau
    public PS(PS ps){
        this.tu = ps.tu;
        this.mau = ps.mau;
    }
    public int gcd(int a, int b){ // viet ham tinh ucln de rut gon phan so
        if (b == 0) { 
            return a; 
        }
        else {
            return gcd(b , a % b);  
                                  
        }
    }
    public void compact(PS ps){ // viet ham rut gon phan so
        ps.tu = ps.tu/ gcd(ps.tu, ps.mau);
        ps.mau = ps.mau/ gcd(ps.tu, ps.mau);
    }
    public void add(PS ps1, PS ps2, PS ps){ // viet ham cong hai phan so
        compact(ps1); // rut gon hai phan so ps1 va ps2
        compact(ps2); //
        int mc = ps1.mau * ps2.mau / gcd(ps1.mau, ps2.mau); // tinh mau chung  
                                                            // hai phan so
        int cs1 = mc / ps1.mau; // tao 2 chi so cs1 cs2 de tinh tu cua tong hai 
        int cs2 = mc / ps2.mau; // phan so
        ps.tu = ps1.tu * cs1 + ps2.tu * cs2; // tong cua hai phan so la phan so
        ps.mau = mc;                         // ps va rut gon ps
        compact(ps);
    }
    public void subtract(PS ps1, PS ps2, PS ps){ // viet ham tru hai phan so 
        compact(ps1);                            // tuong tu ham cong
        compact(ps2); 
        int mc = ps1.mau * ps2.mau / gcd(ps1.mau, ps2.mau);   
                                                            
        int cs1 = mc / ps1.mau;  
        int cs2 = mc / ps2.mau; 
        ps.tu = ps1.tu * cs1 - ps2.tu * cs2; 
        ps.mau = mc;
        compact(ps);
    }
    public void multi(PS ps1, PS ps2, PS ps){ // viet ham nhan hai phan so                           
        ps.tu = ps1.tu * ps2. tu;     // tich hai phan so ps1 va ps2 la phan so 
        ps.mau =  ps1.mau * ps2.mau;  // ps
        compact(ps);                  // rut gon ps
    }
    public void div(PS ps1, PS ps2, PS ps) { // viet ham chia hai phan so tuong 
                                             // tu ham nhan
        ps.tu = ps1.tu * ps2. mau;      
        ps.mau =  ps1.mau * ps2.tu;  
        compact(ps); 
    }
    public boolean equals(PS ps1, PS ps2){ // viet ham so sanh hai phan so
                                           // tuong tu ham cong
        compact(ps1); // rut gon hai phan so                        
        compact(ps2); //
        if (ps1.tu == ps2.tu && ps1.mau == ps2.mau){ // so sanh hai phan so
            return true;
        }
        else {
            return false;
        }
    }
}
