//Program to demonstrate on if-else statement
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Elligible to donate the blood");
		}
		else
		{
			System.out.println("Not elligible to donate the blood");
		}

	}

}
