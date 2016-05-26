package asgn2Passengers;

/**
 * This class is used to represent the characteristics of a booking process of First Class Passenger
 *
 * This is class subclass of Passenger class, so this class can use all methods and variable 
 * of Passenger Class
 * @author CAB302
 * @version 1.0
 */

public class First extends Passenger
{
	/**
	 * This is no-argument First() constructor
	 */
	protected	First()
	{
		
	}
	
	/**
	 * 	First(int,int) constructor of this First class, this constructor check set new booking and departure Time 
	 *  of any Passenger
	 */
	protected First(int bookingTime, int departureTime) throws PassengerException
	{
		
	}

	/**
	 *  This method is override from Passenger Class, this method call when no seat available
	 */
	@Override
	String noSeatsMsg() {
		// TODO Auto-generated method stub
		return "no seats available";
	}

	/**
	 *  This method is also override from Passenger Class, this method upgrade passenger information if any 
	 *  change in booking system
	 */
	@Override
	Passenger upgrade() {
		// TODO Auto-generated method stub
		return null;
	}

}
