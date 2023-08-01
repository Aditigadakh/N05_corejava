package org.tnsif.superkeyword;
//parent class
class Nationality
{
	String nationname;

	public Nationality(String nationname) {
		
		this.nationname = nationname;
		System.out.println(nationname);
	}
	
}
//child class
class Person extends Nationality
{
	String language;

	public Person(String nationname, String language) {
		//calling to parent class constructor
		super(nationname);
		this.language = language;
		System.out.println(language);
	}
	
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Person p =new Person("Gemany","German");

	}

}
