package MobileShop.Entity;

public class Users {
	private long id;
	private	String user;
	private	String password;
	private String display_name;
	private int number_phone; 
	private String address;
	
	public Users() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public int getNumber_phone() {
		return number_phone;
	}
	public void setNumber_phone(int number_phone) {
		this.number_phone = number_phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
