package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	static float salary;
	String companyname;
	/*static block is used to initialize the static variable 
	 *we can't assign a value  for any non static variable inside  the static block
	 * */
	static {
		
		//companyname="Accenture";
		salary=65784.34f;
		
	}
	//static method
	static void print()

	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		
      print();
	}

}
