/*Ask a user for their birth year encoded as 2 digit (like "62") and for the current year also encoded as 2 digit (like "99") 
 * write a program to find users current age in years 
 *   
 *   b=62 and c=99 
 *   
 * b=02 and c=23
 * year = 
 * 
 * 23
 * 62
 * */


package org.tnsif.challenges;
import java.util.Scanner;
public class AreCalculator {
	
	static void AreCalculator (int c, int b)
	
	{
		if(c<b)
		{
			
			
			System.out.println((100-c)+b);
		}
		
		else
		{
			System.out.println(c-b);
		}
	}
	

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the value of Currentyear and Birthyear :");
		
		 int c=s.nextInt();
		 int b=s.nextInt();
		AreCalculator(c,b);
		
	

	}

}
