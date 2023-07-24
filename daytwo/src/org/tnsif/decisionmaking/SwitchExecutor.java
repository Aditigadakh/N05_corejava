//Program to demonstrate on Switch statement
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		  case 1:
			  System.out.println("Perfect");
			  break;
		  case 2:
			  System.out.println("Oo Antava");
			  break;
		  case 3:	  
			  System.out.println("Taki Taki");
			  break;
		  default :
		  System.out.println("Invalid Input");
			
		}

		/*
		//Code for String
		
		Scanner s=new Scanner(System.in);
		String songno=s.next();
		switch(songno)
		{
		  case "one":
			  System.out.println("Perfect");
			  break;
		  case "two":
			  System.out.println("Oo Antava");
			  break;
		  case "three":	  
			  System.out.println("Taki Taki");
			  break;
		  default :
		  System.out.println("Invalid Input");
			
		}

		
		*/
		
		
		
	}

}
