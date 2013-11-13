package support;

public class Customer {
	
	String name;
	String password;
	String seat;
	int hour;
	public Customer(String name, String password, String seat, int hour) {
		super();
		this.name = name;
		this.password = password;
		this.seat = seat;
		this.hour = hour;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String seat, int hour) {
		super();
		this.name = name;
		this.password = null;
		this.seat = null;
		this.hour = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getSeat() {
		return seat;
	}
	
	public void setSeat(String seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return name+"  "+seat+"  "+hour;
	}
	
	
	
}
