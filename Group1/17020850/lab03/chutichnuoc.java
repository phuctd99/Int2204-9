public class chutichnuoc {
    private String name;
    private int namsinh;
    private int  nammat;
    private String que;
    //gan gia tri cho thuoc tinh
    public void setName(String name)
    {
        this.name=name;
    }
    public void setNamSinh(int nam)
    {
        this.namsinh=nam;
    }
    public void setNamMat(int nam)
    {
        this.nammat=nam;
    }
    //tra ve gia tri
    public String getName()
    {
        return name;
    }
    public int getNamSinh()
    {
        return namsinh;
    }
    public int getNamMat()
    {
        return nammat;
    }
    //ham tinh huong tho
    public int huongtho()
    {
        int huongtho=namsinh=nammat;
        return huongtho;
    }
}
