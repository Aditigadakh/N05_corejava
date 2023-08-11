package org.tnsif.singledimentionalarray;

import java.util.*;
//program to demonstrate on run time array and find out the largest element in an array------------
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		//int max = arr[0];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		for(int i=0; i<arr.length-1;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("The largest element is:"+max);
		//Arrays is a class and sort is an built in function
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}

}
