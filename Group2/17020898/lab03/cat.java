package com.company;

public class cat {
    double cannang;
    double chieucao;
    String maumat;
    public cat(){
        cannang = 0;
        chieucao = 0;
        maumat = "xanh";
    }
    public void setCannang(Double cn){
        cannang = cn;
    }

    public double getCannang(){
        return cannang;
    }
    public void setChieucao(Double cc){
         chieucao = cc;
    }

    public double getChieucao(){
        return chieucao;
    }
    public String setMaumat(String mm){
        maumat = mm;
        return maumat;
    }
    public String getMaumat(){
        return maumat;
    }
}
