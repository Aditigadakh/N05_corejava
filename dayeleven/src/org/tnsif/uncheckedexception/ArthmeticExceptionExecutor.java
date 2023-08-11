package org.tnsif.uncheckedexception;

import java.util.Scanner;

//Program to demonstrate on Arithmetic Exception
public class ArthmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try block contains exception code
		try {
			System.out.println(x/y);
		}
		
		//catch block is used to handle an exception 
		catch (Exception e)
		
		{
			System.out.println("Exception handled "+e);
		}
	}

}
