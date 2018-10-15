public class quaCam extends hoaQua {
	private String origin;
	private int quantity;
	public quaCam(){
		new hoaQua();
		origin = "";
		quantity = 0;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
