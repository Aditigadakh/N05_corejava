//Program to demonstrate on encapsulation
/*Encapsulation arheives data hiding using private access specifier*/
package org.tnsif.encapsulation;

public class HDFC {

	
	//private data members
	private long accountno;
	private int cvvno;
	private String accounttype;
	private int pinno;
	
	
	//getter and setter
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public int getCvvno() {
		return cvvno;
	}
	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	
	//using to string insted of get method
	@Override
	public String toString() {
		return "HDFC [accountno=" + accountno + ", cvvno=" + cvvno + ", accounttype=" + accounttype + ", pinno=" + pinno
				+ "]";
	}
	
}
