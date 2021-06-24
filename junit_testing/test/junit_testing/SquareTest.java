package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

import business.BasicCalculations;

public class SquareTest {

	@Test
	public void squaredTest() {
		assertEquals(25, BasicCalculations.square(5));
		
	}
	
	@Test
	public void countTest() {
		assertEquals(1, BasicCalculations.countA("Why are we still here? Only to suffer?"));
	}

	
	
}
