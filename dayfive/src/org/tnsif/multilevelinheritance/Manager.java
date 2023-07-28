package org.tnsif.multilevelinheritance;
//Parent class(super class)
public class Manager {

	//private data members
	private String deptname;

	private String name;

	private int empid;

	
	//degault constructor
	public Manager() {
		System.out.println("Default constructor for manager");
	}


	//Parameterized constructor
	public Manager(String deptname, String name, int empid) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empid = empid;
	}


	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", empid=" + empid + "]";
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
	
}
