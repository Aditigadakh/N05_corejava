package org.tnsif.finalkeyword;
//Program to demonstrate on final keyword with final variable
public class FinalVariable {

	//The blank final field NUM may not have been initialized
	//final int NUM ;
	final float SALARY=78000.67f;
	
	public void print()
	{   //The final field FinalVariable.SALARY
		//cannot be assigned we can't change the value of final variable
		//SALARY =89000.56f;
		System.out.println("Salary is : "+SALARY);
	}
}
