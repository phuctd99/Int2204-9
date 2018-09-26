public class Ball {
    private  int  radius;
    private String status;

    public int getRadius() {
        return radius;
    }

    public String getStatus() {
        return status;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean haveScore(){
        if(this.status.equals("trong luoi")) return true;
        else return false;
    }

    public boolean outSide(){
        if(this.status.equals("ngoai san")) return true;
        else return false;
    }

    public boolean inSide(){
        if(this.status.equals("trong san")) return true;
        else return false;
    }

}
