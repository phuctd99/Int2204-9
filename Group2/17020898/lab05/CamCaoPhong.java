package com.company;

public class CamCaoPhong extends QuaCam {
    public String doNgot;
    public String muivi;
    public CamCaoPhong(){
        super();
        this.doNgot = " rat ngot ";
        this.muivi = "thom ";
    }

    public void setDoNgot(String doNgot) {
        this.doNgot = doNgot;
    }
    public String getDoNgot() {
        return doNgot;
    }

    public void setMuivi(String muivi) {
        this.muivi = muivi;
    }

    public String getMuivi() {
        return muivi;
    }
}
