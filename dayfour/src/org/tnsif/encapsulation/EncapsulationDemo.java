//Program to demonstrate on encapsulation
/*Encapsulation arheives data hiding using private access specifier*/
//Driver class(it contains the main fun.)
//access specifier

package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
	HDFC h=new HDFC();
	
	//Setting a value for private members
	h.setAccountno(234567890123L);
	h.setAccounttype("Current account");
	h.setCvvno(2345);
	h.setPinno(1212);
	
	
	/*
	//accessing and printing all the private members
	System.out.println(h.getAccountno());
	System.out.println(h.getAccounttype());
	System.out.println(h.getCvvno());
	System.out.println(h.getPinno());*/
	
	//by using tostring
	
	System.out.println(h);

	}

}
