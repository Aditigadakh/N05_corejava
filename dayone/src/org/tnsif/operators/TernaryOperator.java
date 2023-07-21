////Program to demonstrate on Relational OPerator
package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		String res =(num%2==0)?"Even":"Odd";
		System.out.println("Result is :"+res);
		s.close();
	}

}
