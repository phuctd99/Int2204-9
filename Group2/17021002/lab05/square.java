package lapo5;


	public class square extends rectangle {
	    public square(String color, boolean filled) {
	        super(color, filled);
	    }
	    
	    private double crong = 1;

	    public square(String color, boolean filled, double rong) {
	        super(color, filled);
	        this.crong = crong;
	    }

	    public double getcRong() {
	        return crong;
	    }

	    public void setRong(double crong) {
	        this.crong = crong;
	    }
	    public double getdientic () { return crong * crong ;}
	    public double getchuvi () { return 4* crong ;}
	    @Override
	    
	    public String toString() {
	        System.out.println("Day la hinh vuong \n" +
	                           "co chieu rong la: " + crong +"\n");
	        return super.toString();
	    }
	}

