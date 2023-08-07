package org.tnsif.InterfaceDemo;
//implementable class
public class SBIDebitCard implements DebitCard {

	@Override
	public void displayCardDetails() {
		System.out.println("Card no. is : "+cardno);
		
	}

}
