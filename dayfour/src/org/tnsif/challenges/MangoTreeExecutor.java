/*Pratik is so much interested in gardening hence he plants more tree in his garden
 * he plants trees in a rectangular way with the order of rows and columns and numbers the trees in a 
 * row wise order. He planted the mango tree only in the first row first column and the last column.
 * so given the tree number and rows and columns your task is to find out whether the given tree is mango tree or not
 * 
 * input n=5 ,t=11(tree no.)
 * 
 * */
package org.tnsif.challenges;
import java.util.Scanner;
public class MangoTreeExecutor {
	
	static void ismangotree (int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango tree");
		}
		
		else
		{
			System.out.println("Not a mango tree");
		}
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the value of n and t :");
		
		 int n=s.nextInt();
		 int t=s.nextInt();
		ismangotree(n,t);
		
	}

}
