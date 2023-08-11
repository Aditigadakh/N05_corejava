package org.tnsif.costumexception;

//program to demonstrate on user-define exception 
public class LoginCredentials extends Exception{

	//private data member
	private String str;

	
	//getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//parameterized constructor

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	//to string 
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
}
