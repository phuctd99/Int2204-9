package lapo5;

public class quaCam extends hoaQua {
	private int soMui;
	 public int soMui() {
	        return soMui;
	    }

	    public void setsoMui(int soMui ) {
	        this.soMui = soMui;
	    }
	
	public quaCam(int cost, int weight, String hsd,int soMui) {
		super(cost, weight, hsd);
		
}
	public static void main (String [] args) {
		quaCam X = new quaCam(12,16,"22/12",12);
	}
}