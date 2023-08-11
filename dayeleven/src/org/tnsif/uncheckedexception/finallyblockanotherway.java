package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class finallyblockanotherway {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			System.out.println(x/y);	
		}
		
		//catch block is used to handle an exception 
		catch (Exception e)
		
		{
			System.out.println("Exception handled "+e);
		}
		finally
		{
			/*when finally block contains exception then finally block does not executed*/
			System.out.println(4/0);
			System.out.println("Finally block is always executed");
		}

	}

}

