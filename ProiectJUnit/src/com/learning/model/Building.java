package com.learning.model;

import java.util.ArrayList;
import java.util.List;

public class Building implements FloorContainer{ //facade //builder //Iterator
	List<FloorIntf> floors;

	private Building(FloorIntf ... inFloors) {
		this.floors = new ArrayList<FloorIntf>();
		for (FloorIntf arg : inFloors) {
	        floors.add(arg);
	    }	
	}
	
	public void closeBuilding(){
		for (FloorIntf arg : this.floors) {
			arg.close();
	    }
	}
	
	public void openBuilding(){
		for (FloorIntf arg : this.floors) {
			arg.open();
	    }
	}
	
	public List<FloorIntf> getFloors(){
		return this.floors;
	}
	
	public static class BuildingBuilder{
		private Building nestedBuilding;
		
		public BuildingBuilder(FloorIntf ... inFloors){
			this.nestedBuilding = new Building(inFloors);
		}
		
		public Building build(){
        	return this.nestedBuilding;
        }
	}

	@Override
	public Iterator getIterator() {
		return new FloorIterator();
	}
	
	private class FloorIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < floors.size()){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return floors.get(index++);
	         }
	         return null;
	      }		
	   }
	
}
