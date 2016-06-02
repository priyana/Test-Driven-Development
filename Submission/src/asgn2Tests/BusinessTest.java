package asgn2Tests;

/**
 * @author Conrad Bell
 */

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Business;

public class BusinessTest extends Business {

	@Test
	public void testBusinessIntInt() {
		try{
			new Business(12, 20);
		}catch (Exception e){
		fail(e.getMessage());
		}
	}
}
