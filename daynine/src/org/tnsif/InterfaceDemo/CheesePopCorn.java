package org.tnsif.InterfaceDemo;

//implementable class for a functional interface
public class CheesePopCorn implements PopCorn{

	@Override
	public void displayReceipe() {
		System.out.println("Take popcorn packets"
	                         +" from shop and cook it in high"
		                      +" fire inside a cooker");
		
	}

}
