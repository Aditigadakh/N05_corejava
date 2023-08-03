package org.tnsif.finalkeyword;
//Program to demonstrate on final method

//we can't inherit the final class
//public final class shape
public class Shape {

	final String shapename ="Circle";
	
	//final method
	final void printshapetype()
	{
		System.out.println(shapename);
	}
	
}
