package com.learning.model;

public class GroundFloor extends AFloor implements GroundFloorIntf{
	
	private boolean isArmed = false;
	
	private GroundFloor(String name){
		this.name = name;
	}
	
	public boolean isArmed(){
		return isArmed;
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
	
	public static class GroundFloorBuilder{
		private GroundFloor nestedFloor;
		
		public GroundFloorBuilder(String name){
			this.nestedFloor = new GroundFloor(name);
		}
		
		public GroundFloor addCompany(Company company){
			this.nestedFloor.company = company;
			return this.nestedFloor;
		}
		
		public GroundFloor build(){
        	return this.nestedFloor;
        }
	}

	@Override
	public void open() {
		this.isArmed = false;
		this.isOpen = true;
		System.out.println("Open ground floor");
	}

	@Override
	public void close() {
		this.isArmed = true;
		this.isOpen = false;
		System.out.println("Close ground floor");
	}
}
