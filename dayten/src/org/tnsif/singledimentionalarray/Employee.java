package org.tnsif.singledimentionalarray;



public class Employee {
	private int Id;
	private String name;
	private double salary;
	//parameterized constructor
	public Employee(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//getter and setters
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
