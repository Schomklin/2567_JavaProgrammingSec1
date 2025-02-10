
public class Customer {
	
	private int cid;
	private String name;
	private int discount;
	
	Customer(int cid, String name, int discount){
		this.cid = cid;
		this.name = name;
		this.discount = discount;		
	}
	
	public int getCustID() {
		return this.cid;		
	}
	
	public String getCustName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;		
	}
	
	public String toString() {
		return getCustName() + "(" + getCustID() + ")(" + getDiscount() + "%)";
	}

}
