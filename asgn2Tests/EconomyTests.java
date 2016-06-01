package asgn2Tests;

/**
 * @author Conrad Bell
 */

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Economy;

public class EconomyTest extends Economy {

	@Test
	public void testEconomy() {
		try{
			new Economy(12, 20);
		}catch (Exception e){
		fail(e.getMessage());
		}
	}
}
