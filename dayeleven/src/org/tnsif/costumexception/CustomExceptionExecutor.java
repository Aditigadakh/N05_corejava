//program to demonstrate on user-define exception 
package org.tnsif.costumexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an email id and password :");
		
		String email=s.nextLine();
		String password=s.nextLine();
		
		try
		{
		
		if(email.equals("aditigadakh4@gmail.com") && password.equals("Pass@123"))
		{
			System.out.println("Credential match");
		}
				
		else
		{
			throw new LoginCredentials("Invalid Credentials");
		}
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
	}

}
