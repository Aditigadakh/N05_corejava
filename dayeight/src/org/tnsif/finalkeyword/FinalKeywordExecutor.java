package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		
		FinalVariable f=new FinalVariable();
		//cannot be assigned we can't change the value of final variable
		//f.SALARY=68900.34F;
		f.print();
		Circle c=new Circle();
		c.printshapetype();
		c.printshapetype(c.area);

	}

}
