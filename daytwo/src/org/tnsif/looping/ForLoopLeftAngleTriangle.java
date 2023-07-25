//Program for left angle triangle using for loop
package org.tnsif.looping;
import java.util.Scanner;

public class ForLoopLeftAngleTriangle {

	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}
	
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			{for(int k=1;k<=i;k++)
			{
			System.out.print("*");
			}
			System.out.println("");
			}
		}
		

	}
	
	
	
	

}
