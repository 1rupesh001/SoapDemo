package org.SOAP.Demo;


public class EmployeeInformationImpl {
	
	EmployeeDetails emp = new EmployeeDetails();
	
	public void setEmployeeDetails(){
		emp.setName("Welcome to SOAP WebService Session");
	}
	
	public String getEmployeeDetails(){
		String name = emp.getName();
		return name;
	}

}
