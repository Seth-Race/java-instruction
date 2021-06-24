package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void pirateCreateTest() {
		Pirate p1 = new Pirate("Blackbeard");
		// expect pirate to have 4 limbs and name of Blackbeard.
		// and isAlive == true
		assertEquals(4,p1.getLimbsRemaining());
		assertEquals("Blackbeard", p1.getName());
		assertFalse(p1.isDead());
	}
	
	@Test
	public void octoPirateTest() {
		Pirate p = new Pirate("Octopete",8);
		assertEquals(8,p.getLimbsRemaining());
	}
	
	@Test(timeout=1000)
	public void timeoutTest() {
		while (true) {
			//infinite loop - on purpose.
			
		}
	}

}
