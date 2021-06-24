package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTest {

	@Test
	public void test1() {
		System.out.println("Test 1");
		assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		assertTrue(true);
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
		assertTrue(true);
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before");
		assertTrue(true);
	}
	
	@After
	public void afterTest() {
		System.out.println("After");
		assertTrue(true);
	}
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before class");
		assertTrue(true);
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("After class");
		assertTrue(true);
	}
	
	

}
