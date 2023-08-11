package org.tnsif.multipledimentionalarray;



import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[][]= new int[3][2];
		//for initializing array value----------
		for(int i=0; i<3; i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		//for printing array values------------
		for(int i=0; i<3; i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
