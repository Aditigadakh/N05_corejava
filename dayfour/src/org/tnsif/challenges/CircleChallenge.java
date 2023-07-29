package org.tnsif.challenges;
/*There are n people standing in a circle waiting to be executed .
 * The counting out begging at some point in the circle and proceeds
 *  around a circle in a fix direction . IN each step a certain no 
 *  of people are skipped and the person is executed. the elimination proceed 
 *  around the circle(Which is becoming smaller and smaller as the executed 
 *  people are removed) , until only the last person remain ,who is 
 *  giving freedom
 *  Given the total no of person 'n' an a number k which indicates that k-1 
 *  person are skipped and the kth person is stilled in circle
 *  The task is to choose the person in the initial circle that survived */

import java.util.Scanner;

//let n=10 and k=2(killed) ,k-1=2-1=1(skipped) ,from 


public class CircleChallenge {
	
	static int survive (int n,int k)
	{
		if (n==1)
			return 1;
		
		else 
			return (survive (n-1,k)+k-1)%n+1;
	}
	
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		// System.out.println("Enter the value of n :""Enter the value of k :");
		 int n=s.nextInt();
		 int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}
