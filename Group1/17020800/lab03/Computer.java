import sun.text.resources.no.CollationData_no;

public class Computer {
    //Tên hãng
    private String NameType ;
    //Ram
    private String Ram ;
    //CPU
    private String CPU ;
    //Pin
    private String Pin ;
    public Computer() {
        NameType = "" ;
        Ram = "" ;
        CPU = "" ;
        Pin = "" ;
    }

    public String getNameType() {
        return NameType;
    }

    public void setNameType(String nameType) {
        NameType = nameType;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }
    public String Info() {
        return (NameType + "\n" + Ram + "\n" + CPU + "\n" + Pin) ;
    }
}
