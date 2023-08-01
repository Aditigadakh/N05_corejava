package org.tnsif.statickeyword;
/*Static variable : if any variable is non-static and out side the 
 * main function and if you want to access that variable inside the main function
 * then we can make that variable as static
 * */
public class StaticVariableExecutor {
static int num=67;
	public static void main(String[] args) {
		
		System.out.println(num);
		
		/*insted of static :-
		 * StaticVariableExecutor s=new StaticVariableExecutor();
		 * System.out.println(s.num);
		 * */

	}

}
