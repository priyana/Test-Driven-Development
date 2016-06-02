package asgn2Tests;

/**
 * @author Conrad Bell
 */

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Premium;

public class PremiumTest extends Premium {

	@Test
	public void testPremiumIntInt() {
		try{
			new Premium(12, 20);
		}catch (Exception e){
		fail(e.getMessage());
		}
	}

}
