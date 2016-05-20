package test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.learning.model.Employee;
import com.learning.model.EmployeeService;
import com.learning.model.Floor;
import com.learning.model.Employee.EmployeeBuilder;
import com.learning.model.Floor.FloorBuilder;
import com.learning.model.Company;
import com.learning.model.Company.CompanyBuilder;


public class EmployeeTest {

	@Test
	public void testEmployeeCreate() {
		Employee employee = null;
		assertNull(employee);
		employee = new EmployeeBuilder("1900101334444","Adrian").addNume("Popescu").addSalariu(543).build();
		assertNotNull(employee);
	}
	
	@Test
	public void testEmployeeAttributes() {
		Employee employee = new EmployeeBuilder("1900101334444","Adrian").addNume("Popescu").addSalariu(543).build();
		assertEquals("Adrian",employee.getSurname());
		assertEquals("Popescu",employee.getName());
		assertEquals(543, employee.getSalary());
		assertEquals("1900101334444", employee.getCnp());
	}
	
	@Test
	public void testFLoorAddCompany(){
		Floor floor1 = null;
		floor1 = new FloorBuilder("Et1").build();
		assertNull(floor1.getCompany());
		Company company = new CompanyBuilder("IBM").build();
		floor1 = new FloorBuilder("Et1").addCompany(company).build();
		assertEquals("IBM",floor1.getCompany().getDenumire());
	}
	
	@Test
	public void testRiseEmployeeSalary(){
		Employee employee = new EmployeeBuilder("1900101334444","Adrian").addNume("Popescu").addSalariu(543).build();
		EmployeeService e = new EmployeeService();
		e.riseSalary(employee, 100);
		assertEquals(643, employee.getSalary());
	}
	
	@Test
	public void testRiseEmployeeSalaryNull(){
		boolean thrown = false;
		EmployeeService e = new EmployeeService();
		try{
			e.riseSalary(null, 100);
		}catch(NullPointerException ex){
			thrown = true;
		}
		assertTrue(thrown);
	}
}
