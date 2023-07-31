package org.tnsif.thisKeyword;

public class ThisKeywordDemoDemoFour {

	int x;
	//default constructor
	ThisKeywordDemoDemoFour()
	{
		//invoking current parameterized constructor
		this(34);
		System.out.println("Default Constructor");
	}
	
	ThisKeywordDemoDemoFour (int x)
	{
		this.x=x;
		System.out.println("Parameterized Constructor: "+x);
	}
	
	public static void main(String[] args) {
		
		ThisKeywordDemoDemoFour f=new  ThisKeywordDemoDemoFour();
		
	}

}
