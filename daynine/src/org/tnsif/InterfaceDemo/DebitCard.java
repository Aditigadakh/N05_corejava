package org.tnsif.InterfaceDemo;

public interface DebitCard {
	
	/*By default all the variable inside an interface is public static final and 
	 * if it is final then we must have to initialize value for that variable*/
	
	long cardno=57588991022L;
	/*we can't use concrete method inside an interface
	 * by default ,method inside an interface ia an abstract*/
	
	//abstract method
	void displayCardDetails();
	//default method and static method is the new features of java 8
	//inside an interface
	
	//Q. we can use default and static method in an interface?
	default void diplay()
	{
		System.out.println("Default Method");
	}
	//static method
	static void print()
	{
		System.out.println("Static Method");
	}
	
	
	

}
