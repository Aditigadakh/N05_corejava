package org.tnsif.superkeyword;
class Sports
{
   	String sportname ="Cricket";
   	void display()
   	{
   		System.out.println("Sport name is : "+sportname);
   	}
}
//child class
class Cricket extends Sports
{	
	int noofplayers=11;
   	void display()
   	{
   		/*If parent and child method name are same if we want to call parent class method
   		 * name inside the child class  then use super.methodname();*/
   		super.display();
   		System.out.println("No of Players : "+noofplayers);
   	}
	}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		
        Cricket c=new Cricket();
		
		c.display();
		
		

	}

}
