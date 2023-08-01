package org.tnsif.superkeyword;

//parent class
class State
{
    String statename ="Punjab";
    
}
//child class
class Capital extends State
{
	
	 String statename ="Hariyana";
	 String capital ="Chandigarh";
	 
	 public void display()
	 {   /*super keyword with variable is used to call parent class variable
	 if and only if parent and child class variable name*/
		 System.out.println(super.statename);//punjab
		 System.out.println(statename);// hariyana
		 
	 }
}
//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		
		Capital c=new Capital();
		
		c.display();
		

	}

}
