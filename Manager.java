package user;

import javax.persistence.Entity;

@Entity

public class Manager extends Employee1{
	private String teamName;
	
	
	public Manager(int empId, String empName, String city, long empPhone, double empSalary, String teamName) {
		super(empId, empName, city, empPhone, empSalary);
		this.teamName=teamName;
		
		
	}
	public String getTeamName() {
		return teamName;
	}
	
	
	
	
}
