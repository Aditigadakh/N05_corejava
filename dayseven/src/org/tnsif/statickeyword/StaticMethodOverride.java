package org.tnsif.statickeyword;
//we can't override any static method
public class StaticMethodOverride {

	public static void main(String[] args) {
		
		
	tiger t =new tiger();
	t.eat();
	
	/*we can't override static method*/
	t.run();

	}

}
