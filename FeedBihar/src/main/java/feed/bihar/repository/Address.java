package feed.bihar.repository;




public class Address {

	private String Line1;
	private String country;
	private String state;
	private String city;
	private int pin;
	
	public Address() {
		
	}
	public Address(String line1, String country, String state, String city, int pin) {
		super();
		Line1 = line1;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
	}
	public String getLine1() {
		return Line1;
	}
	public void setLine1(String line1) {
		Line1 = line1;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	} 
	
	
	
}
