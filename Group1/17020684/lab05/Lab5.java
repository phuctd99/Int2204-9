
package lab5;


public class Lab5 {

   
    public static void main(String[] args) {
        HoaQua HQ = new HoaQua(25000,"Hamoi","18/8/2018",100);
        QuaTao QT = new QuaTao();
        QuaCam QC = new QuaCam();
        CamSanh CS = new CamSanh();
        CamCaoPhong CCP = new CamCaoPhong();
        System.out.println(HQ.toString());
        
        System.out.println(QC.toString());
    }
    
}
