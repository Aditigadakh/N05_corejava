package org.tnsif.challenges;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner (System.in);
		
		String str=sc.next();
		String org_str =str;
		
		String rev ="";
		int len=str.length();
		
		
		for(int i=len-1;i>=0;i-- )
		{
			rev = rev + str.charAt(i);
			
		}
		
		if(org_str.equals(rev))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		
		
	}

}
