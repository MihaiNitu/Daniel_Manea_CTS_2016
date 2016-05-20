package com.learning.model;

public class EmployeeService implements EmployeeServiceIntf{

	@Override
	public void riseSalary(Employee employee, int value) {
		if (employee == null) {
			throw new NullPointerException("Employee is null!");
		}
		employee.setSalary(employee.getSalary() + value);
	}

}
