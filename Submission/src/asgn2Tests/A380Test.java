package asgn2Tests;

/**
 * @author priyanka patel
 */

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Aircraft.A380;
import asgn2Aircraft.AircraftException;

public class A380Test extends A380 {

	public A380Test(String flightCode, int departureTime)
			throws AircraftException {
		super(flightCode, departureTime);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testA380StringInt() {
			try{
				new A380("Brisbane", 20);
			}catch (Exception e){
			fail(e.getMessage());
			}
		}

	@Test
	public void testA380StringIntIntIntIntInt() {
		try{
			new A380("Brisbane", 20, 10, 14, 20, 30);
			}catch (Exception e){
				fail(e.getMessage());
				}	
		}
	}