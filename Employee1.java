package user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Table2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee1 {
@Id
private int empId;
private String empName;
private String city;
private long empPhone;
private double empSalary;
public Employee1(int empId, String empName, String city, long empPhone2, double empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.city = city;
	this.empPhone = empPhone2;
	this.empSalary = empSalary;
	
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getEmpPhone() {
	return empPhone;
}
public void setEmpPhone(long empPhone) {
	this.empPhone = empPhone;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}


	
}
