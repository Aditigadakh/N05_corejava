package org.tnsif.challenges;

import java.util.*;

public class ReverseWithoutReverse {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int [] intarray = {10,2,40,33,202,44,20,4};
		
		
	
		System.out.println("Original");;
		for(int i=0;i<intarray.length ;i++)
		{
			System.out.print(intarray[i]+" ");
		}
		//System.out.println("Reverse");
		for(int i=intarray.length-1;i>0;i--)
		{
			System.out.print(intarray[i]+"  ");
		}

	}

}
