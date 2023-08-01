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
		
		
		
			/*Scanner s=new Scanner(System.in);
			int month=s.nextInt();
			int rent=s.nextInt();
			int day=s.nextInt();
			switch(month)
			{
			  case 4:
				 
			  case 5:
				 
			  case 6:	  
				 
			 break;
			double  rent1 = (rent*1.12);
			return rent1;
				
			}*/

		      Scanner s = new Scanner(System.in);

		        System.out.print("Enter the month (1-12): ");
		        int month = s.nextInt();

		        System.out.print("Enter the room rent per day: ");
		        double rent = s.nextDouble();

		        System.out.print("Enter the number of days of stay: ");
		        int days = s.nextInt();

		        
		    }

		    

		        switch (month) {
		            case 4:
		            case 5:
		            case 6:
		            case 11:
		            case 12:
		            	 System.out.println((rent+(rent*0.2))*days);
		                break:
		                System.out.println((rent+(rent*0.2))*days);
		                
		            case 1:
		            case 2:
		            case 3:
		            case 7:
		            case 8:
		            case 9:
		            case 10:
		            	 System.out.println((rent*days);
		            	 break;
		            	 System.out.println("invalid");
		            	
		                
		        }
		        
		       

		       
		    }
		


	}

	}
