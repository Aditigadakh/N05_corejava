package org.tnsif.InterfaceDemo;
/*Functional Interface:- An interface contains exactly one abstract method
 * then that interface is known as functional interface*/


/*below annotation ensures that we have to use exactly one abstract method inside
 * an interface*/
@FunctionalInterface

public interface PopCorn {
//abstract method
	void displayReceipe();
	//void display();
	
	
}
