package com.learning.model;

public abstract class AFloor implements FloorIntf{
	protected Company company; 
	protected String name;
	protected boolean isOpen = false;
	
	public String getName(){
		return this.name;
	}
}
