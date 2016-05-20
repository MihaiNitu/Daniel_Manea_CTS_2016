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


public class CompanyTest {

	@Test
	public void testAddCompany(){
		Company cmp = new CompanyBuilder("ORACLE").build();
		assertEquals("ORACLE", cmp.getDenumire());
		assertEquals(0, cmp.getEmployees().size());
	}
	
	@Test
	public void testEmployeeList(){
		Company cmp = new CompanyBuilder("ORACLE").build();
		assertEquals("ORACLE", cmp.getDenumire());
		assertEquals(0, cmp.getEmployees().size());
		Employee employee = new EmployeeBuilder("1900101334444","Adrian").addNume("Popescu").addSalariu(543).build();
		Employee employee1 = new EmployeeBuilder("1911010101001","Gelu").addNume("Irimescu").addSalariu(543).build();
		Employee employee2 = new EmployeeBuilder("1932132132111","Andrei").addNume("Georgescu").addSalariu(543).build();
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		cmp.addEmployee(employee);
		employees.add(employee1);
		cmp.addEmployee(employee1);
		employees.add(employee2);
		cmp.addEmployee(employee2);
		assertArrayEquals(employees.toArray(), cmp.getEmployees().toArray());
		employees.remove(employee2);
		assertNotEquals(employees.size(), cmp.getEmployees().size());
	}

}
