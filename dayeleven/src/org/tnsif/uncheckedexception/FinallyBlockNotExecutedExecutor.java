package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			System.out.println(x/y);
			/* 1. When we use system.exit(0) then finally block does't executed
			 * 2. but if there error occur in try block and it is handle by catch 
			 * block the system.exit(0) statement gets ignored and finally block 
			 * gets executed.*/
			
			System.exit(0);
		}
		
		//catch block is used to handle an exception 
		catch (Exception e)
		
		{
			System.out.println("Exception handled "+e);
		}
		finally
		{
			
			System.out.println("Finally block is always executed");
		}

	}

}
