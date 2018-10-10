package lapo5;


	public class rectangle extends Shape {
	    public rectangle(String color, boolean filled) {
	        super(color, filled);
	    }
	    
	    protected double crong = 1;
	    private double cdai = 2;

	    public rectangle(String color, boolean filled, double crong, double cdai) {
	        super(color, filled);
	        this.crong = crong;
	        this.cdai = cdai;
	    }

	    public double getcRong() {
	        return crong;
	    }

	    public void setcRong(double crong) {
	        this.crong = crong;
	    }

	    public double getcDai() {
	        return cdai;
	    }

	    public void setcDai(double cdai) {
	        this.cdai = cdai;
	    }
	    public double getArea () { return crong * cdai ;}
	    public double getPerimeter () { return 2 * ( cdai + crong) ;}

	    @Override
	    public String toString() {
	        System.out.println("Day la hinh chu nhat \n" +
	                           "co chieu rong la: " + crong +"\n"
	                        +  "va chieu dai la : " + cdai   );
	        return super.toString();
	    }
	}


