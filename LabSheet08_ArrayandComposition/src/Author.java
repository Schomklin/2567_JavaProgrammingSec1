
public class Author {
	private String name;
	private String email;
	
	Author(){
		this(null,null);
		//name = null;   //name = "";
		//email = null;
	}
	
	Author(String name,String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return getName() + " ("+ getEmail()+ ")";
	}

}





