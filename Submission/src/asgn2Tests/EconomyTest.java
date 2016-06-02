package asgn2Tests;

/**
 * @author Conrad Bell
 */

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Economy;
import asgn2Passengers.PassengerException;

public class EconomyTest extends Economy {

	public EconomyTest(int bookingTime, int departureTime)
			throws PassengerException {
		super(bookingTime, departureTime);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEconomy() {
		try{
			new Economy(12, 20);
		}catch (Exception e){
		fail(e.getMessage());
		}
	}
}
