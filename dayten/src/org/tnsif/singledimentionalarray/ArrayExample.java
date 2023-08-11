package org.tnsif.singledimentionalarray;

//Program to demonstrate on array using compile time input values------
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration and initialization at compile time----
		int arr[]= {22,33,54,65,76,45};
		System.out.println(arr[2]);
		//-------------------------------------------------------------------------
		//to print all the values of an array
//		for(int i:arr) {
//			System.out.println(i+" ");//enhanced for loop--------------------------
//		}
		//-------------------------------------------------------------------------
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
