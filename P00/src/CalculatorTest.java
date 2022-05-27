import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21036941, 27 May 2022 11:23:49 am
 */

public class CalculatorTest {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
			int a = 100;
			int b = 2;
				
			Calculator cal = new Calculator();
			int actual = cal.substract (a, b); 
				 
			int expected = 98;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiple() {
		int a = 100;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 200;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivide() {
		int a = 100;
		int b = 2; 
			
		Calculator cal = new Calculator();
		int actual = cal.divide (a, b); 
			 
		int expected = 50;
		assertEquals (expected, actual);
		}


}
