package org.SOAP.Demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EmployeeInformation {
	
	EmployeeInformationImpl employeeInformationImpl = new EmployeeInformationImpl();
	
	@WebMethod
	public void setEmployeeDetails(){
		employeeInformationImpl.setEmployeeDetails();
	}
	
	@WebMethod
	public String getEmployeeDetails(){
		String empName = employeeInformationImpl.getEmployeeDetails();
		return empName;
	}

}
