package com.learning.model;

public class Floor extends AFloor{//builder
	
	private Floor(String name){
		this.name = name;
	}
	
	public boolean isOpen(){
		return isOpen;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Company getCompany(){
		return this.company;
	}
	
	public static class FloorBuilder{
		private Floor nestedFloor;
		
		public FloorBuilder(String name){
			this.nestedFloor = new Floor(name);
		}
		
		public FloorBuilder addCompany(Company company){
			this.nestedFloor.company = company;
			return this;
		}
		
		public Floor build(){
        	return this.nestedFloor;
        }
	}

	@Override
	public void open() {
		this.isOpen = true;
		System.out.println("Open normal floor");
	}

	@Override
	public void close() {
		this.isOpen = false;
		System.out.println("Close normal floor");
	}
}	
