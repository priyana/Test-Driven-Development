/**
 * 
 * This file is part of the AircraftSimulator Project, written as 
 * part of the assessment for CAB302, semester 1, 2016. 
 * 
 */
package asgn2Simulators;

/**
 * Specialisation of the {@link asgn2Aircraft.AircraftException,asgn2Aircraft.Bookings,asgn2Passengers.Passenger,asgn2Passengers.PassengerException} class for the Flights. 
 * 
 * @author hogan
 * @author priyanka patel
 */

import asgn2Aircraft.AircraftException;
import asgn2Aircraft.Bookings;
import asgn2Passengers.Passenger;
import asgn2Passengers.PassengerException;

public class Flights extends java.lang.Object
{

	/**
	 * Constructor for Flights uses booking flight time 
	 * 
	 * @param time <code>int</code> containing flight timing 
	 * @throws AircraftException if invalid parameters. 
	 */
	public Flights(int time) throws AircraftException
	{
		
	}
	
	/**
	 * Method to add passenger into the aircraft 
	 * seat prior to entry to this method.   
	 *
	 * @param p <code>Passenger</code> to be add into the aircraft 
	 * @param time <code>int</code> time operation performed 
	 * @throws PassengerException if <code>Passenger</code> is not Confirmed OR booking time 
	 * is invalid. 
	 * @throws AircraftException if <code>Passenger</code> is not recorded in aircraft seating 
	 */
	public void addPassenger(Passenger p,int time) throws AircraftException,PassengerException
	{
		
	}
	
	/**
	 * Method to remove passenger from the aircraft 
	 * seat prior to entry to this method.   
	 *
	 * @param rng <code>Random</code> to be set Randome range
	 * @param cancelProb <code>double</code> to be set cancallation prob
	 * @param cancelTime <code>int</code> time operation performed 
	 * @throws PassengerException if <code>Passenger</code> is not Confirmed OR cancallation time 
	 * is invalid. 
	 * @throws AircraftException if <code>Passenger</code> is not recorded in aircraft seating 
	 */
	public java.util.List<Passenger> cancelBookings(java.util.Random rng, double cancelProb, int cancelTime) throws PassengerException,AircraftException
	{
		return null;
	}
	
	/**
	 * Method to manage passenger from the aircraft 
	 * seat prior to entry to this method.   
	 *
	 * 
	 * @param time <code>int</code> departure time operation performed 
	 * @throws PassengerException if <code>Passenger</code> is not Confirmed OR cancallation time 
	 * is invalid. 
	 */
	public void flyPassengers(int time) throws PassengerException
	{
		
	}
	
	/**
	 * Method to get current booking passenger 
	 * seat prior to entry to this method.   
	 *
	 * 
	 * @return number of booking details
	 */
	public Bookings getCurrentCounts()
	{
		return null;
	}
	
	/**
	 * Method to get booking status of current time 
	 * seat prior to entry to this method.   
	 *
	 * 
	 * @return confirm or cancle or book message for particular time
	 */
	public java.lang.String getStatus(int time)
	{
		return "";
	}
	
	/**
	 * Method to get booking status of new state 
	 * seat prior to entry to this method.   
	 *
	 * 
	 * @return confirm or cancle or book message for new booking
	 */
	public java.lang.String initialState()
	{
		return "";
	}
	
	/**
	 * Method to get Passenger status 
	 * seat prior to entry to this method.   
	 *
	 * 
	 * @return available or not available of current Passenger
	 */
	public boolean seatsAvailable(Passenger p)
	{
		return true;
	}
	
	/* 
	 * (non-Javadoc) (Supplied) 
	 * @see java.lang.Object#toString()
	 */
	public java.lang.String toString()
	{
		return "";
	}
	
	/**
	 * Method to create new Passenger instance based on upgrade to a higher fare class.
	 * Transition rules are specific to each fare class
	 * 
	 */
	public void upgradePassengers()
	{
		
	}
}
