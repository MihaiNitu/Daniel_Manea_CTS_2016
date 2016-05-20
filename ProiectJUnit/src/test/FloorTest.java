package test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.learning.model.Building;
import com.learning.model.Building.BuildingBuilder;
import com.learning.model.Employee;
import com.learning.model.Employee.EmployeeBuilder;
import com.learning.model.Floor;
import com.learning.model.Floor.FloorBuilder;
import com.learning.model.GroundFloor;
import com.learning.model.GroundFloor.GroundFloorBuilder;
import com.learning.model.Company;
import com.learning.model.Company.CompanyBuilder;


public class FloorTest {
	
	@Test
	public void testFloorCreate() {
		Floor floor = null;
		assertNull(floor);
		floor = new FloorBuilder("Et1").build();
		assertNotNull(floor);
	}

	@Test
	public void testFloorName() {
		Floor floor = new FloorBuilder("Et1").build();
		assertEquals("Et1", floor.getName());
	}

	@Test
	public void testAddCompany(){
		Company cmp = new CompanyBuilder("ORACLE").build();
		assertEquals("ORACLE", cmp.getDenumire());
		assertEquals(0, cmp.getEmployees().size());
	}

}
