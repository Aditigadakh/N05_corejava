package org.tnsif.operators;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		System.out.println("Check if you are eligible to donate blood or not");
		System.out.println("Enter the Age :");
		
	int age=s.nextInt();
	System.out.println("Enter the Weight :");
	int weight=s.nextInt();
	if((age>=18 && weight >=50))	
		{System.out.println("Can donate blood");}
		
		else {System.out.println("Can't donate blood");}
	
		
     
	}

}
