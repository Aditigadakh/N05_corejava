/*2.  A microwave oven manufacturer recommends that when heating 2 items and 50% 
to the heating time and when 3 items 
 *  double the heating time. Heating more than 3 items at once is not recommended .Write a program to find out the recommended
 *  heating time.
 *  sample ip item= 2,  heating time= 5.0 ,find recommended heating time use Note : switch case 
*/
package org.tnsif.challenges;
import java.util.Scanner;
public class Heating {
	
	
	
	
	
	public static void main(String[] args) {
		
		/* Scanner s = new Scanner(System.in);

	        System.out.print("Enter the number of items to heat: ");
	        int items = s.nextInt();

	        System.out.print("Enter the initial heating time: ");
	        float ht = s.nextFloat();

	       
	   	        switch (items) {
	            case 1:
	                System.out.println(ht);
	                break;
	            case 2:
	                System.out.println((ht/2)+ht);
	                break;
	            case 3:
	            	System.out.println(2*ht);
	            default:
	                System.out.println("Heating more than 3 items at once is not recommended.");
	        }

	       
	    }
	


	}
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of items to heat: ");
	        int items = input.nextInt();

	        System.out.print("Enter the initial heating time: ");
	        double initialHeatingTime = input.nextDouble();

	        double recommendedHeatingTime = calculateRecommendedHeatingTime(items, initialHeatingTime);
	        System.out.println("Recommended heating time: " + recommendedHeatingTime + " minutes");
	    }

	    public static double calculateRecommendedHeatingTime(int items, double initialHeatingTime) {
	        double recommendedTime = initialHeatingTime;

	        switch (items) {
	            case 2:
	                recommendedTime *= 1.5; // 50% increase for 2 items
	                break;
	            case 3:
	                recommendedTime *= 2;   // Double the time for 3 items
	                break;
	            default:
	                System.out.println("Heating more than 3 items at once is not recommended.");
	        }

	        return recommendedTime;
	    }
	


	}


