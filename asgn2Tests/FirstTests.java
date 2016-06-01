package asgn2Tests;

/**
 * @author Conrad Bell
 */

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.First;

public class FirstTest extends First{
	
	@Test
	public void testFirst() {
		try{
			new First(12, 20);
		}catch (Exception e){
		fail(e.getMessage());
		}
	}

	@Test
	public void testCancelSeat() {
		try{
			new First(12, 17).cancelSeat(13);
		}catch(Exception e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testConfirmSeat() {
		try{
			new First(12, 17).confirmSeat(13, 17);
		}catch(Exception e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testFlyPassenger() {
		try{
			new First(12, 17).flyPassenger(17);
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
}
