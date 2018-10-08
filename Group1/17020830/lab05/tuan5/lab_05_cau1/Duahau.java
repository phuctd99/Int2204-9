
package lab_05_cau1;

public class Duahau extends Hoaqua{
    private String hinhdang;
    

    public String getHinhdang() {
        return hinhdang;
    }
    public void setHinhdang(String hinhdang) {
        
        this.hinhdang = hinhdang;
    }
    public void nhapthongtin_duahau(){
        nhapthongtin();
        this.getHinhdang();
    }
    public void xuatthongtin_dauhau(){
        xuatthongtin();
        
    }
            
    
}
