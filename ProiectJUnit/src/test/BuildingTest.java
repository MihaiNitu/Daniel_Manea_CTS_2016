package test;
import static org.junit.Assert.*;

import org.junit.Test;
import com.learning.model.AFloor;
import com.learning.model.Building;
import com.learning.model.FloorIntf;
import com.learning.model.Iterator;
import com.learning.model.Building.BuildingBuilder;
import com.learning.model.Floor;
import com.learning.model.Floor.FloorBuilder;
import com.learning.model.GroundFloor;
import com.learning.model.GroundFloor.GroundFloorBuilder;

public class BuildingTest {

	@Test
	public void testBuildingOpenClose() {
		GroundFloor floor0 = null;
		floor0 = new GroundFloorBuilder("Et0").build();
		Floor floor1 = null;
		floor1 = new FloorBuilder("Et1").build();
		Floor floor2 = null;
		floor2 = new FloorBuilder("Et2").build();
		Building bld = new BuildingBuilder(floor0,floor1,floor2).build();
		//facade
		bld.closeBuilding();
		for (FloorIntf fl : bld.getFloors()){
			assertFalse(fl.isOpen());
		}
		//facade
		bld.openBuilding();
		for (FloorIntf fl : bld.getFloors()){
			assertTrue(fl.isOpen());
		}	
	}
	
	@Test
	public void testBuildingIterator(){
		GroundFloor floor0 = null;
		floor0 = new GroundFloorBuilder("Et0").build();
		Floor floor1 = null;
		floor1 = new FloorBuilder("Et1").build();
		Floor floor2 = null;
		floor2 = new FloorBuilder("Et2").build();
		Floor floor3 = null;
		floor3 = new FloorBuilder("Et3").build();
		Building bld = new BuildingBuilder(floor0,floor1,floor2,floor3).build();
		int i = 0;
		//Iterator
		for(Iterator iter = bld.getIterator(); iter.hasNext();){
	         AFloor floor = (AFloor)iter.next();
	         System.out.println("Name : " + floor.getName());
	         i++;
	      } 
		assertEquals(i, 4);
	}
	
	
	@Test
	public void testBuildingCreate() {
		GroundFloor floor0 = null;
		floor0 = new GroundFloorBuilder("Et0").build();
		Floor floor1 = null;
		floor1 = new FloorBuilder("Et1").build();
		Floor floor2 = null;
		floor2 = new FloorBuilder("Et2").build();
		Building bld = new BuildingBuilder(floor0,floor1,floor2).build();
		assertEquals(3, bld.getFloors().size());
	}

}
