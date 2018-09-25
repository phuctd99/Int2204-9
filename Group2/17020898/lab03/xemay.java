package com.company;

public class xemay {
    int tocdomax;
    String mauxe;
    double Trongluong;
    public xemay(){
        tocdomax = 150;
        mauxe ="do";
        Trongluong = 100;
    }

    public void setTocdomax(int tocdomax) {
        this.tocdomax = tocdomax;
    }

    public int getTocdomax() {
        return tocdomax;
    }

    public void setTrongluong(double trongluong) {
        Trongluong = trongluong;
    }

    public double getTrongluong() {
        return Trongluong;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public String getMauxe() {
        return mauxe;
    }
}
