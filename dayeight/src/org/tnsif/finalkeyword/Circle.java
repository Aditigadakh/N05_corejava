package org.tnsif.finalkeyword;

public class Circle extends Shape{

   final float area =34.6f;
   //Cannot override the final method from Shape
	/*void printshapetype()
	{
		System.out.println(area +"sq.cm");
	}*/
   
   public void printshapetype(float area) {
   System.out.println(area +"sq.cm");}
}
