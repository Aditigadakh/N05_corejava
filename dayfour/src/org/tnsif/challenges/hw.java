/*1.  Write a program to calculate the hotel tariff .
The room rent is 12% high during peek
  seasons (april to june is peek season and November to dec peek season ) 
 * note : use the switch cases
 * Sample ip month=3(march) ,rent =1500 ,day = 2days calculate hotel budget
 * 
 * 
 *    
 * */


package org.tnsif.challenges;

import java.util.Scanner;
public class hw {

	public static void main(String[] args) {
		
		
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the month (1-12): ");
		        int month = scanner.nextInt();

		        System.out.print("Enter the room rent per day: ");
		        double roomRent = scanner.nextDouble();

		        System.out.print("Enter the number of days of stay: ");
		        int days = scanner.nextInt();

		        double totalAmount = roomRent * days;

		        switch (month) {
		            case 4: // April
		            case 5: // May
		            case 6: // June
		            case 11: // November
		            case 12: // December
		                double peakSeasonSurcharge = totalAmount * 0.12;
		                totalAmount += peakSeasonSurcharge;
		                System.out.println("Peak season : RS " + peakSeasonSurcharge);
		                break;
		            default:
		                System.out.println("No peak season .");
		        }

		        System.out.println("Total hotel budget: RS " + totalAmount);

		        scanner.close();
		    }
		}

		
		
	
