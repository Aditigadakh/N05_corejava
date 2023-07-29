//Program to demonstrate on access specifier

package org.tnsif.accessspecifier;

public class Bank {
  //different access specifier
	public String bankname;//compile time input
	private int pinno;
	long accountno=3312356789L;
	
	//public method
	public void displayPublic()
	{System.out.println("Bank name is "+bankname);}
	
	//private method
		private void displayPrivate()
		{System.out.println("Bank pinno is "+pinno);}
		
		//default method
		void displayDefault()
		{System.out.println("Account no is :  "+accountno);}
	
}
