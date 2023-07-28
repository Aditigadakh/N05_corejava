package org.tnsif.multilevelinheritance;
//child class1
public class TeamMember extends TeamLead {
	

	public TeamMember(String deptname, String name, int empid, String leadname, int empID2, String projectname ,int size , int duration) {
		super(deptname, name, empid, leadname, empID2, projectname);
		this.size=size;
		this.duration=duration;
		
		// TODO Auto-generated constructor stub
	}

	private int size;

	private int duration;
	
	//getter and setter

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

	

}
