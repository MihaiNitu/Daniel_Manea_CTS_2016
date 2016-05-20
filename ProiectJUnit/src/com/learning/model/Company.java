package com.learning.model;

import java.util.ArrayList;
import java.util.List;

public class Company {//builder
	private final String denumire;
	private List<Employee> employees;
	
	private Company(String denumire){
		this.denumire = denumire;
		employees = new ArrayList<Employee>();
	}
	
	public String getDenumire(){
		return this.denumire;
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
	
	public void removeEmployee(Employee emp){
		employees.remove(emp);
	}
	
	public List<Employee> getEmployees(){
		return this.employees;
	}
	
	@Override
	public String toString() {
		return "Company [denumire=" + denumire + "]";
	}
	
	public static class CompanyBuilder{
		private Company nestedCompany;
		
		public CompanyBuilder(String name){
			this.nestedCompany = new Company(name);
		}
		
		public Company build(){
        	return this.nestedCompany;
        }
	}
}
