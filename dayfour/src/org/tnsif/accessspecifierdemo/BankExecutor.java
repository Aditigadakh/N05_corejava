//program to demonstrate on

package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.Bank;
//import org.tnsif.accessspecifierdemo.*;
public class BankExecutor {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.bankname="SBI";
		b.displayPublic();
		/*pinno and displayPrivate ()method are private 
		 * so we can't access into another class and
		 *  another package , only we can access private 
		 *  data member inside the same class*/
		//b.pinno;
		//b.displayPrivate();
		
		
		/*accountno and displayDefault () method are
		 * default that's why we are not able to use 
		 * in another package, only we access within 
		 * the same package*/
		//b.accountno;
		//b.displayDefault();
		 
	}

}
