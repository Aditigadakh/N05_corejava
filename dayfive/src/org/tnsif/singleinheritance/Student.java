package org.tnsif.singleinheritance;
//Derived class 

public class Student extends Citizen {

	
	//private data members
	private int rollno;
	private String collegename;
	public Student() {
		super();
		// super() use to call parent class default constructor
		System.out.println("Childe class default constructor");
	}
	
	//parameterized constructor
	public Student(String city, int pinno, long aadharno, long contactno,int rollno, String collegename) {
		super(city, pinno, aadharno, contactno);
		this.rollno=rollno;
		this.collegename=collegename;
		
	
	}
	
	//getter-setter

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", toString()=" + super.toString() + "]";
	}
	
	//
	
	
	
	
}
