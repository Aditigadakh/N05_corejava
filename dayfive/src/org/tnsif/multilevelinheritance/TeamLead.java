package org.tnsif.multilevelinheritance;
//Child class2
//parent class2
public class TeamLead extends Manager {
	
//private data members
	private String leadname;

	private int empID;

	private String projectname;
	
	//getters and setters

	public String getLeadname() {
		return leadname;
	}

	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	@Override
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", empID=" + empID + ", projectname=" + projectname + ", toString()="
				+ super.toString() + "]";
	}

	

	//Parameterized constructor
	public TeamLead(String deptname, String name, int empid , String leadname ,int empID, String projectname) {
		super(deptname, name, empid);
		
		this.empID=empID;
		this.leadname=leadname;
		this.projectname=projectname;
		
		// TODO Auto-generated constructor stub
	}
	

}
