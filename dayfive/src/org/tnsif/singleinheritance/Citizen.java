package org.tnsif.singleinheritance;
//Based class

public class Citizen {

	private String city;
	private int pinno;
	private long aadharno;
	private long contactno;
	
	
	
	public Citizen() {
		System.out.println("Default Constructor");
	}
	
	//Parameterised constructor
	public Citizen(String city, int pinno, long aadharno, long contactno) {
		super();
		this.city = city;
		this.pinno = pinno;
		this.aadharno = aadharno;
		this.contactno = contactno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pinno=" + pinno + ", aadharno=" + aadharno + ", contactno=" + contactno
				+ "]";
	}
	
	
}
