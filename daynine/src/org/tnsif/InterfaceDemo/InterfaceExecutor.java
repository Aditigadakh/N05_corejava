package org.tnsif.InterfaceDemo;
//Program to demonstrate on an interface
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
	
		/*we can't create object for interface*/
    //DebitCard d=new DebitCard();
	
		
		SBIDebitCard s= new  SBIDebitCard();
		s.displayCardDetails();
		//we can call default method of an interface using the obj
		//of implementable class
		
		s.diplay();
		
		/*Print() is a static method in side an interface to call an 
		 * print method we have to use interfacename.methodname()*/
		DebitCard.print();
		
		CheesePopCorn c= new  CheesePopCorn();
		c.displayReceipe();
		
		
		Person p= new  Person();
		p.showDrinkName();
		
		
		
	}

}
