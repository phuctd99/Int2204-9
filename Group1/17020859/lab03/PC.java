public class PC {

    private String Chipset;
    private int Ram;
    private int Memory;
    private String GPU;

    public String getChipset() {
        return Chipset;
    }

    public void setChipset(String chipset) {
        Chipset = chipset;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
}
