package com.learning.model;

public class Employee { //build
	private final String cnp;
	private final String surname;
	private String name;
	private int salary;
	
	private Employee(String cnp, String surname){
		this.cnp = cnp;
		this.surname = surname;
	}

	public String getCnp() {
		return cnp;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [cnp=" + cnp + ", prenume=" + surname + ", nume="
				+ name + ", salariu=" + salary + "]";
	}
	
	public static class EmployeeBuilder{
        private Employee nestedEmployee;
        
        public EmployeeBuilder(String cnp, String surname){
        	this.nestedEmployee = new Employee(cnp, surname);
        }
        
        public EmployeeBuilder addNume(String name){
        	this.nestedEmployee.name = name;
        	return this;
        }
        
        public EmployeeBuilder addSalariu(int salary){
        	this.nestedEmployee.salary = salary;
        	return this;
        }
        
        public Employee build(){
        	return this.nestedEmployee;
        }
    }

	
}
