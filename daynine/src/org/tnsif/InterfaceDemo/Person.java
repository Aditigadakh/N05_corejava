package org.tnsif.InterfaceDemo;
//Program to demonstrate on multiple inheritance
//implementable class or child class

public class Person implements ColdDrink,Alcohol {

	@Override
	public void showDrinkName() {
		System.out.println(brand+""+alcoholname+" "+name);
		
	}

}
